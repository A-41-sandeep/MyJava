package jdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class DBMS1 {
    public static void main(String[] args)  {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","");
            Statement obj=con.createStatement();
            ResultSet rs=obj.executeQuery("select * from edetail");
            System.out.println("connection successful");
        }
        catch(Exception e)
        {

            System.out.println("connection failed"+e);
        }


    }
}
