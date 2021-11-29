package jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class JDBC2 {
    public static void main(String[] args) {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "");
           Statement obj = con.createStatement();

          ResultSet rs=obj.executeQuery("select ename,empno from emp");
       while(rs.next())
           {
               System.out.println(rs.getString("ename")+"\t"+rs.getInt(2));
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }

}
