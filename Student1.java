package JavaClassPr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student1 {
    protected String Name;
    protected int Roll_no;
    public Student1()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the roll no and name ");
        Roll_no=s.nextInt();
        s.next();
        Name=s.nextLine();
    }
    //constructor overriding
    public Student1(int Roll_no,String Name)
    {
        this.Roll_no=Roll_no;
        this.Name=Name;
    }
}





