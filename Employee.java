package jdbc;

import java.sql.*;

public class Employee {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employ";
            Connection con= DriverManager.getConnection(url,"root","");

            Statement obj=con.createStatement();
           obj.execute("INSERT INTO edetail (name,id) VALUES ('sandeep','3')");
           //obj.execute("UPDATE edetail SET id=2 WHERE name='sandeep'");
            ResultSet rs=obj.executeQuery("select * from edetail");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
            }
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException q)
        {
            q.printStackTrace();
        }
    }

}
