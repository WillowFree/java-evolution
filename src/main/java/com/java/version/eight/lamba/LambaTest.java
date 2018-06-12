package com.java.version.eight.lamba;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LambaTest {

  public static void main(String[] agrs) {
    // Runnable
    Runnable runnable = () -> System.out
        .println("Runnable executed by : " + Thread.currentThread().getName());
    new Thread(runnable).start();

    // Callable
    Callable<Integer> callable = () -> {
      System.out.println("Callable executed by : " + Thread.currentThread().getName());
      return 42;
    };
    FutureTask<Integer> futureTask = new FutureTask<>(callable);
    new Thread(futureTask).start();


    try {
      Integer fourtyTwo = futureTask.get();
      System.out.println(Thread.currentThread().getName() + " returned by Callable : " + fourtyTwo);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }


  }
}
