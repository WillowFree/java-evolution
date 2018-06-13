package com.java.version.previous;

/**
 * les types primitifs, leurs classes et les String sont passé par "valeur"
 * Les Objets sont passé par "références"
 */
public class PassageParValeurOuReferenceTest {


  public static void main(String[] args) {
    double doubleValue = 1d;
    System.out.println("\ndouble : " + doubleValue);
    modify(doubleValue);
    System.out.println("double modified : " + doubleValue);

    Double doubleObject = 1d;
    System.out.println("\nDouble object : " + doubleObject);
    modify(doubleObject);
    System.out.println("Double object modified : " + doubleObject);

    String str = "test";
    System.out.println("\nString : " + str);
    modify(str);
    System.out.println("String modified : " + str);

    Personne papy = new Personne(100, "papi");
    System.out.println("\nPersonne : " + papy);
    modify(papy);
    System.out.println("Personne modified : " + papy);
  }

  static void modify(double d) {
    d = d + 52D;
    System.out.println("double in function : " + d);
  }


  static void modify(Double d) {
    d = Double.sum(d, new Double(5));
    System.out.println("Double object in function : " + d);
  }

  static void modify(String s) {
    s = s + " added";
    System.out.println("string in function : " + s);
  }

  static void modify(Personne p) {
    p.setName("jeunot");
    System.out.println("Personne in function : " + p);
  }


  static class Personne {

    int age;
    String name;

    public Personne(int age, String name) {
      this.age = age;
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name + " :" + age;
    }
  }
}
