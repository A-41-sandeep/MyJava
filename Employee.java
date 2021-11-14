package JavaClassPr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {
    int Eid;
    String Ename,C_Name;
    Float Emp_sal;

    Employee(int Eid,String Ename,String C_Name,float Emp_sal)
    {
        this.Eid=Eid;
        this.Ename=Ename;
        this.Emp_sal=Emp_sal;
        this.C_Name=C_Name;
    }

    public static void result(Employee[] arg)
    {
        float salary1=Integer.MIN_VALUE , salary2=Integer.MIN_VALUE;
        int index1=0,index2=0;
        for(int i=0;i<arg.length;i++)
        {
            if(arg[i].C_Name.equals("A") && arg[i].Emp_sal>salary1)
            {
                salary1=arg[i].Emp_sal;
                index1=i;
            }
            if(arg[i].C_Name.equals("B") && arg[i].Emp_sal>salary2)
            {
                salary2=arg[i].Emp_sal;
                index2=i;
            }

        }
        System.out.println("object "+arg[index1].Ename +" of company "+ arg[index1].C_Name+" has highest salary "+arg[index1].Emp_sal);
        System.out.println("object "+arg[index2].Ename +" of company "+ arg[index2].C_Name+" has highest salary "+arg[index2].Emp_sal);

    }

    public  static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Howmany objects you wants to create ");
        Employee[] obj= new Employee[s.nextInt()];
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("enter id ,name,company name and salary");
            obj[i]=new Employee(s.nextInt(),s.next(),s.next(),s.nextFloat());
        }
        Employee.result(obj);
    }


}
