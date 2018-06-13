package com.java.version.eight.collection.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <li>
 * Dans JDK 8 le Stream joue le même rôle que l’interface Iterator, il permet d’accéder aux données
 * d’une Collection, à la différence qu’il ne fournit aucun mécanisme de stockage, il offre juste un
 * moyen de créer des séquences de données (par exemple les entiers premiers, les nombres pairs,
 * éléments d’une collection satisfaisant un critère, …)
 * </li>
 *
 * <li>Les données ne sont évaluées que quand le programme en a vraiment besoin (lazy
 * evaluation)</li>
 */
public class CollectFilterAverageTest {

  public static void main(String[] args) {

    Stream<Personne> personnesStream =
        Stream.of(new Personne(10, "tata"), new Personne(30, "toto"), new Personne(20, "titi"))
            .filter(personne -> personne.getAge() > 15).sorted();

    double ageMoyen = personnesStream.collect(Collectors.averagingInt(p -> p.getAge()));
    System.out.println("age moyen de la population filtrée : " + ageMoyen);

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
