package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
  public static void main(String[] args) {
    Scanner stringin=new Scanner(System.in);
    System.out.println("Enter a string with your name:");
    String string=stringin.nextLine();
    System.out.println("Enter your name:");
    String word=stringin.nextLine();
    Pattern pattern = Pattern.compile(word);
    Matcher matcher = pattern.matcher(string);

    if (matcher.find()) {
      System.out.println("Is " + word + " here ? true");
    } else {
      System.out.println("Is " + word + " here ? false");
    }

  }
}
