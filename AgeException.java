package com.company.ehandling;
class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}
public class AgeException {
    public static void main(String[] args) {
        try{
            if(Integer.parseInt(args[1])<18 || Integer.parseInt(args[1])>=60)
            {
                throw new MyException("enter Invalid age");
            }
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException n)
        {
            System.out.println("Invalid input");
        }
        System.out.println("End of main");
    }

}
