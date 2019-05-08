package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord {
  public static void main(String[] args) {
    System.out.println("Enter a string:");
    Scanner in=new Scanner(System.in);
    String string=in.nextLine();
    System.out.println("Enter the word you want to find frequency of:");
    String word=in.nextLine();
    String str="";
    Pattern p =Pattern.compile(word);
    Matcher m = p.matcher(string);
    while (m.find()){
      str+="Found at: "+m.start()+" - "+m.end()+",";
    }
    String[] output = str.split(",");
    System.out.println("" + output);
  }
}
