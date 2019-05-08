package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Scanner;

public class SortInAlphabeticalOrder {
  public static void main(String[] args) {
    System.out.println("Enter a paragraph:");
    Scanner input=new Scanner(System.in);
    String str=input.nextLine();
    String string = str.replaceAll("\\s+","");
    char[] temp = string.toCharArray();

    Arrays.sort(temp);

    String sort = new String(temp);

    System.out.println("" + sort);

  }
}
