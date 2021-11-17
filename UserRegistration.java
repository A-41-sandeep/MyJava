package com.company.ehandling;

import java.util.Scanner;

class InvalidCountryException extends Exception
{
    InvalidCountryException(String s)
    {
        super(s);
    }
}
public class UserRegistration {
    private void registerUser(String name, String CountryName) {
        try
        {if (CountryName.equals("India")) {}
            else
                throw new InvalidCountryException("User outside India can not be registered");

        }
        catch(InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String name,CountryName;
        Scanner S=new Scanner(System.in);
            System.out.println("enter name and Countryname(Firstletter should be Capital)");
            name=S.nextLine();
            CountryName=S.nextLine();
            UserRegistration obj = new UserRegistration();
            obj.registerUser(name,CountryName);


    }
}
