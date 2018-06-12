package com.java.version.eight.collection.stream;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectFlatmapReduceTest {

  public static void main(String[] args) {

    Stream<Personne> personnesStream =
        Stream.of(new Personne(10, "tata"), new Personne(30, "toto"), new Personne(20, "titi"))
            .filter(personne -> personne.getAge() > 15).sorted();

//    personnesStream.collect(Collectors.toList()).forEach(System.out::println); // Terminal action
//    double ageMoyen = personnesStream.collect(Collectors.averagingInt(p -> p.getAge()));
//    System.out.println("age moyen de la population filtrée : " + ageMoyen);

    Integer ageTotal = personnesStream.reduce(0, (somme, personne) -> somme + personne.getAge(),
        (somme1, somme2) -> (somme1 + somme2));
    System.out.println("age Total de la population filtrée : " + ageTotal);
  }


  static class Personne implements Comparable<Personne> {

    int age;
    String name;

    public Personne(int age, String name) {
      this.age = age;
      this.name = name;
    }

    int getAge() {
      return age;
    }

    String getName() {
      return name;
    }

    @Override
    public String toString() {
      return name + " :" + age;
    }

    @Override
    public int compareTo(Personne p) {
      return this.age - p.getAge();
    }
  }

}
