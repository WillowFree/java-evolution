package com.java.version.previous.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * "PECS" is from the collection's point of view.
 * <li>If you are only pulling items from a generic collection, it is a PRODUCER and you should use
 * EXTENDS;
 * <li>
 * <li>if you are only stuffing items in, it is a CONSUMER and you should use SUPER.
 * <li>
 * <li>If you do both with the same collection, you shouldn't use either extends or super.
 */
public class ProducerExtendsCustomerSuperTest {


  public static void main(String[] args) {
//  Suppose you have a method that takes as its parameter a collection of things,
// but you want it to be more flexible than just accepting a Collection<Thing>.

//  Case A: You want to ADD things TO THE COLLECTION.
//  Then THE LIST IS A CONSUMER, so you should use a Collection<? SUPER Thing>.
//  The reasoning here is that unlike Collection<? extends Thing>,
// Collection<? super Thing> can always hold a Thing no matter what the actual parameterized type is.
// Here you don't care what is already in the list as long as it will allow a Thing to be added; this is what ? super Thing guarantees.
    List<? super Personne> personnes = new ArrayList(2);
    personnes.add(new Personne(20, "tata"));
    personnes.add(new Personne(30, "titi"));

//  Case B: You want to GO THROUGH and do things with each item.
//  Then the LIST IS A PRODUCER, so you should use a Collection<? EXTENDS Thing>.
//  The reasoning is that a Collection<? extends Thing> could hold any subtype of Thing,
// and thus each element will behave as a Thing when you perform your operation.
// (You actually cannot add anything to a Collection<? extends Thing>,
// because you cannot know at runtime which specific subtype of Thing the collection holds.)
    List<? extends Personne> peoples = new ArrayList(personnes);
    for (Personne personne : peoples) {
      System.out.println(personne);
    }

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
      return "Personne{" +
          "age=" + age +
          ", name='" + name + '\'' +
          '}';
    }
  }
}
