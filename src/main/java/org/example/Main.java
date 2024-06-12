package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void firstname(String firstname){
       Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
       Matcher matcher=pattern.matcher(firstname);
       boolean ismatch=matcher.matches();
       if (ismatch){
           System.out.println("Valid input");
       }else {
           System.out.println("Invalid Input");
       }
   }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String firstname=scanner.nextLine();
        firstname(firstname);
    }
}