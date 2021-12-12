package com.regularexpr;
import java.util.Scanner;
import java.util.regex.*;

public class ValidEmail {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[a-z A-Z 0-9 /. _ /-]+[@][a-z]+[/.][a-z]{2,3}");
        Scanner s=new Scanner(System.in);
        //System.out.println("enter e-mail id");
        //String email=s.nextLine();
        //Matcher m=p.matcher(email);
        Matcher m=p.matcher(args[0]);
        if(m.matches())
            System.out.println("valid Email");
       else
        System.out.println("Invalid email");

    }
}
