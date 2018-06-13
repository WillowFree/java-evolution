package com.java.version.eight.collection.stream;

import java.util.stream.Stream;

public class MapToDoubleStreamTest {

  public static void main(String[] args) {
    Stream<Personne> personneStream = Stream
        .of(new Personne(30, "titi"), new Personne(20, "tata"),
            new Personne(30, "tata"));

    double ageMoyen = personneStream.mapToDouble(personne -> personne.age).average().orElse(Double.NaN);
    System.out.println("ageMoyen : " + ageMoyen);
  }


  static class Personne {

    int age;
    String name;

    public Personne(int age, String name) {
      this.age = age;
      this.name = name;
    }

    @Override
    public String toString() {
      return name + " :" + age;
    }
  }
}
