package com.regularexpr;

import java.util.Scanner;
import java.util.regex.*;

public class ValidNo {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[8 9][0-9]{9}");
        Scanner s=new Scanner(System.in);
        System.out.println("enter mobile number");
        String num;
        num=s.next();
        Matcher m=p.matcher(num);
        if(m.matches())
            System.out.println("valid number");
        else
            System.out.println("Invalid number");
    }
}
