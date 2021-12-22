package jdbc;

import java.sql.*;  
public class JDBC{  
public static void main(String args[]){  
    try
    {  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/aliens","root","root");  
        //here aliens is database name, root is username and password  
        Statement stmt=con.createStatement();  
        // query for particular output
        ResultSet rs=stmt.executeQuery("select * from user where id=1");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
        con.close();  
    }
    catch(Exception e)
    { 
        System.out.println(e);}  
    }
}  
