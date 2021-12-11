package com.pac;
import java.sql.*;
import java.util.*;

class Function {
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students record", "root", "");
    PreparedStatement ps = null;

    public Function() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

    }

    public void valueInsert(int a, String b, String c, String d, int e) throws SQLException {
        String str = "insert into stutable values(" + a + ",'" + b + "','" + c + "','" + d + "'," + e + ")";
        ps =this.c.prepareStatement(str);
        ps.executeUpdate();
        System.out.println("values "+","+"inserted");
        System.out.println("values "+"','"+"inserted");
    }

    public void deleteValue(int a) throws SQLException {
        ps = this.c.prepareStatement("delete from stutable where roll_no=" + a);
        ps.executeUpdate();
        System.out.println("record deleted");
    }

    public void modify(String a, String b) throws SQLException {
        ps =this.c.prepareStatement("update stutable set b =  where fee="+a);
        ps.executeUpdate();
        System.out.println("record modified");

    }
}

public class DAOClass {
    public static void main(String[] args) {
        try{ 
            Function obj=new Function();
            switch(Integer.parseInt(args[0])){
                case 1:
                    obj.valueInsert(Integer.parseInt(args[1]),args[2],args[3],args[4],Integer.parseInt(args[5]));
                break;
                case 2:
                    obj.deleteValue(Integer.parseInt(args[1]));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
