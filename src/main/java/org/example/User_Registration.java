package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration
{
    public static String firstname(String firstname) throws InvalidUserDetailExecption{
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher=pattern.matcher(firstname);
        boolean ismatch=matcher.matches();
        if (ismatch){
            return "Happy";
        }else {
            throw new InvalidUserDetailExecption("Enter correct firstname!");
        }

    }


    public static String lastname(String lastname) throws InvalidUserDetailExecption{
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher=pattern.matcher(lastname);
        boolean ismatch=matcher.matches();
        if (ismatch){
           return "Happy";
        }else {
            throw new InvalidUserDetailExecption("Enter correct lastname!");
        }


    }

    public static String email(String email) throws InvalidUserDetailExecption{
        Pattern pattern=Pattern.compile("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$");
        Matcher matcher=pattern.matcher(email);
        boolean ismatch=matcher.matches();
        if(ismatch){
            return "Happy";
        }else {
            throw  new InvalidUserDetailExecption("Enter the correct emailId....");
        }
    }


    public static String phoneNo(String phoneno) throws InvalidUserDetailExecption{
        Pattern pattern=Pattern.compile("^[0-9]{2} [0-9]{10}$");
        Matcher matcher=pattern.matcher(phoneno);
        boolean ismatch=matcher.matches();
        if(ismatch){
            return "Happy";
        }else {
            throw new InvalidUserDetailExecption("Enter the correct Mobile number");
        }
    }



    public static String passwordCharacter( String password) throws InvalidUserDetailExecption{
        Pattern pattern=Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$");
        Matcher matcher=pattern.matcher(password);
        boolean ismatch=matcher.matches();
        if (ismatch){
           return "Happy";
        }else {
            throw new InvalidUserDetailExecption("Enter correct password");
        }
    }


    public static void main(String[] args) {
        try {
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first name: ");
            String firstname = scanner.nextLine();
            System.out.println(firstname(firstname));

            System.out.println("Enter  last the name: ");
            String lastname = scanner.nextLine();
            System.out.println(lastname(lastname));


            System.out.println("Enter the Number: ");
            String phoneno = scanner.nextLine();
            System.out.println(phoneNo(phoneno));

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the email: ");
                String email = scanner.nextLine();
                System.out.println(email(email));
            }

            System.out.println("Enter the password with minimum 8 Character");
            String passwordChar = scanner.nextLine();
            System.out.println(passwordCharacter(passwordChar));
        }catch (Exception e){
            System.out.println("Invalid user input!!!!");
        }

    }
}
