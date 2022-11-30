 
package com.mycompany.hmsbasic;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsdbasewij","root","");
//            Connection con=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579476","sql12579476","NzuGebCUJa");
                    
//            if(con!=null) System.out.println("Sucessfully connected :)");
            return con;
        }  
        catch(Exception e){
//            System.out.println(e);
//            System.out.println("not connected");
            return null;
        }
    }
    
//    public static void main(String args[]) {
//        Connection c=getCon();
//        System.out.println(c);
//    }
}
