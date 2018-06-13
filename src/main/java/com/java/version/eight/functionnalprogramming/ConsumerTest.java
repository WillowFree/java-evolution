package com.java.version.eight.functionnalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

  public static void main(String[] main) {

    List<Employee> employees = new ArrayList();
    employees.add(new Employee(10));
    employees.add(new Employee(50));

    //
    employees.forEach(new Consumer<Employee>() {
      public void accept(Employee emp) {
        System.out.println("Old style : " + emp);
      }
    });

    // Version lambda :
    employees.stream().forEach(emp -> System.out.println("with Lambda : " + emp));


  }

  static class Employee {

    int age;

    public Employee(int age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return "age =" + age;
    }
  }

}
