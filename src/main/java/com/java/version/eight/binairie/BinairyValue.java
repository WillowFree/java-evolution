package com.java.version.eight.binairie;

public class BinairyValue {

  public static void main(String[] args) {

    byte valeurByte = (byte) 0b00010001;
    System.out.println("valeur Byte = " + valeurByte);

    valeurByte = (byte) 0B10001;
    System.out.println("valeur Byte = " + valeurByte);

    valeurByte = (byte) 0B11101111;
    System.out.println("valeur Byte = " + valeurByte);

    short valeurShort = (short) 0b1001110111101;
    System.out.println("valeur Short = " + valeurShort);

    int valeurInt = 0b1000;
    System.out.println("valeur Int = " + valeurInt);

    valeurInt = 0b1001110100010110100110101000101;
    System.out.println("valeur Int = " + valeurInt);

    long valeurLong =
        0b010000101000101101000010100010110100001010001011010000101000101L;
    System.out.println("valeur Long = " + valeurLong);
  }
}
