package com.stackroute.pe4;

import java.util.Scanner;

public class ReplaceCharacters {
  public static void main(String[] args) {
    System.out.println("enter a string:");
    Scanner in= new Scanner(System.in);
    String str=in.nextLine();
    String strnew= str.replace('d','f');
    strnew=strnew.replace('l','t');
    System.out.println(""+ strnew);
  }
}
