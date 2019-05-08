package com.stackroute.pe4;

import java.util.Scanner;

public class CountChar {
  public static void main(String[] args) {
    String str,r; int count;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the string:");
    str = in.nextLine();
    System.out.println("Enter the character whose frequency of occurence you want to find out:");
    r = in.nextLine();
    count = str.length() - str.replaceAll(r,"").length();
    System.out.println("Frequency of " + r + " is " + count);

  }
}
