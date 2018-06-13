package com.java.version.eight.collection.stream;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ParralelStreamTest {

  public static void main(String[] args) {
    // Get available threads
    ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
    System.out.println("nombre de Thread dispos : " + forkJoinPool.getParallelism());

    // Serial
    Arrays.asList("Fabien", "Thierry", "Thomas", "Caro", "Gaelle", "David", "Agnes", "Bertrand")
        .forEach(s -> System.out.println(Thread.currentThread().getName() + " is serial processing " + s));

    // Parrallel
    Arrays.asList("Fabien", "Thierry", "Thomas", "Caro", "Gaelle", "David", "Agnes", "Bertrand")
        .parallelStream()
        .forEach(s -> System.out.println(Thread.currentThread().getName() + " is parrallel processing " + s));
  }
}
