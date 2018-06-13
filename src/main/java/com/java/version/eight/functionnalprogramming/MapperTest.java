package com.java.version.eight.functionnalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapperTest {

  public static void main(String[] main) {

    List<PredicateTest.Employee> employees = new ArrayList();
    employees.add(new PredicateTest.Employee(10));
    employees.add(new PredicateTest.Employee(50));

    // Version lamba :
    List<Integer> ages = employees.stream().map(emp -> emp.age).collect(Collectors.toList());
    System.out.println("ages : " + ages);
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
