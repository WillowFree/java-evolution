package com.java.version.eight.functionnalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList();
    employees.add(new Employee(10));
    employees.add(new Employee(50));

    // old School
    employees.stream().filter(new Predicate<Employee>() {
      public boolean test(Employee emp) {
        return emp.age >= 45;
      }
    });

    // with Lambda
    Stream employeesStream = employees.stream().filter(emp -> emp.age >= 45);

    employeesStream.forEach(System.out::println);
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
