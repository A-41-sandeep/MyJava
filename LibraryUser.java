package JavaClassPr;

import java.util.Scanner;

public interface LibraryUser {
    void registerAccount(int age);
    void requestBook(String BookName);
}
class KidUsers implements LibraryUser
{
    int age;
    String bookType;
    public void registerAccount(int age)
    {
        if (age<12)
        {
            System.out.println("you have successfully registered as a kid");
        }
        else
            System.out.println("sorry,Age must be less than 12 to register as kid");
    }

    @Override
    public void requestBook(String BookName) {
        if (BookName.equals("Kids"))
        {
            System.out.println("book issued successfully, pls return within 10 days");
        }
        else
            System.out.println("Oops,you are allowed to take only kids books");
    }
}
class AdultUser implements LibraryUser
{
    int age;
    String bookType;
    public void registerAccount(int age)
    {
        if (age>12)
        {
            System.out.println("you have successfully registered under an adult account");
        }
        else
        { System.out.println("sorry,Age must be greater  than 12 to register as adult");}

    }

    @Override
    public void requestBook(String BookName) {
        if (BookName.equals("Fiction"))
        {
            System.out.println("book issued successfully, pls return within 7 days");
        }
        else
            System.out.println("Oops,you are allowed to take only adult fiction books");
    }
}

class LibraryInterfaceDemoJava
        {
            public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
               // TESTCASE-1
                /* KidUsers obj1=new KidUsers();
                System.out.println("enter your age");
                obj1.registerAccount(s.nextInt());

                System.out.println("enter type of book");
                obj1.requestBook(s.next());*/

                //TESTCASE-2
                AdultUser obj2=new AdultUser();
                System.out.println("enter your age");
                obj2.registerAccount(s.nextInt());

                System.out.println("enter type of book");
                obj2.requestBook(s.next());
            }
        }