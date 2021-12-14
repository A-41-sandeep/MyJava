package pack;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class error extends Exception
{
    error(String s)
    {
        super(s);
    }
}

public class Test909 {
    public static void main(String[] args) {
        try(Scanner s=new Scanner(System.in)){
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/internal marks","root","");
            PreparedStatement obj=con.prepareStatement("insert into info(Phone_No,Name) values(?,?)");
            int c1=0,c2=0;
            System.out.println("enter phone no");
            String s1=s.nextLine();
            System.out.println("enter name");
            String s2=s.nextLine();
            Pattern p1= Pattern.compile("(0|91)?[0-9]{10}");
            Pattern p2=Pattern.compile("(A|R)+");
            Matcher m1=p1.matcher(s1);
            Matcher m2=p2.matcher(s2);

            while(m1.find())
            {
                c1++;
            }
            while(m2.find())
            {
                c2++;
            }
            if(c1!=0 && c2!=0)
            {
               obj.setString(1,s1);
               obj.setString(2,s2);
               obj.executeUpdate();

            }
            else
            {
                throw new error("exception occur");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
