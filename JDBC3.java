package jdbc;

import java.sql.*;

public class JDBC3 {
    public static void main(String[] args) throws ClassNotFoundException {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost/db2","root","");
           Statement obj=con.createStatement();
           ResultSet rs=obj.executeQuery("select * from emp where sal>1000 AND sal<2000");
           System.out.println("ENAME        JOB      SALARY");
           while(rs.next())
           {
               System.out.println(rs.getString("ename")+"        "+rs.getString("job")+"      "+rs.getFloat("sal"));
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }

    }
}
