package com.java.version.eight.collection.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

  public static void main(String[] args) {

    List<String> myList = new ArrayList<>(3);
    myList.add("tata");
    myList.add("titi");
    myList.add("toto");

    myList.forEach(s -> {
      System.out.println(s);
    });

  }

}
