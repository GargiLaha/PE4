package com.stackroute.pe4;

import java.util.Scanner;

public class Transpose {
  public static void main(String[] args) {
    System.out.println("enter a string for reverse");
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String[] string = str.split(" ");
    String temp="";
    for(int i=0;i<string.length;i++)
    {
      StringBuffer sbf = new StringBuffer(string[i]);
      temp+=sbf.reverse()+" ";
    }
    temp=temp.trim();
    System.out.println("" +temp);

  }
}
