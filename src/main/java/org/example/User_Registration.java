package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration
{
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


    public static void lastname(String lastname){
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher=pattern.matcher(lastname);
        boolean ismatch=matcher.matches();
        if (ismatch){
            System.out.println("Valid input");
        }else {
            System.out.println("Invalid Input");
        }
    }

    public static void email(String email){
        Pattern pattern=Pattern.compile("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$");
        Matcher matcher=pattern.matcher(email);
        boolean ismatch=matcher.matches();
        if(ismatch){
            System.out.println("Valid email");
        }else {
            System.out.println("Invalid input");
        }
    }


    public static void phoneNo(String phoneno){
        Pattern pattern=Pattern.compile("^[0-9]{2} [0-9]{10}$");
        Matcher matcher=pattern.matcher(phoneno);
        boolean ismatch=matcher.matches();
        if(ismatch){
            System.out.println("Valid no");
        }else {
            System.out.println("Invalid no");
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstname=scanner.nextLine();
        firstname(firstname);

        System.out.println("Enter  last the name: ");
        String lastname=scanner.nextLine();
        lastname(lastname);

        System.out.println("Enter the email: ");
        String email=scanner.nextLine();
        email(email);

        System.out.println("Enter the Number: ");
        String phoneno=scanner.nextLine();
        phoneNo(phoneno);
    }
}
