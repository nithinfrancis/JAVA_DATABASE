/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/**
 *
 * @author nithin
 */
public class Db {

    /**
     * @param args the command line arguments
     */
    public static void main(String arg[]) throws SQLException, ClassNotFoundException
 
   {
       ResultSet re=null;
       Statement s=null;
       Class.forName("com.mysql.jdbc.Driver");
       Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/nithin","root","12345678");    
        s=co.createStatement();
        Scanner n= new Scanner(System.in);
        int a= n.nextInt();
        String ss="insert into test values("+a+",'bi')";
        s.executeUpdate(ss);
ss="select * from test where id=9";
re=s.executeQuery(ss);
while(re.next())
{
    
   String name=re.getString("name");
    System.out.println(name);


}


}
    
}
