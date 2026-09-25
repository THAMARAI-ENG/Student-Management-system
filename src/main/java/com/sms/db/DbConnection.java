package com.sms.db;
import java.sql.DriverManager;
import java.sql.Connection;
public class DbConnection 
{
	 private static final String url="jdbc:mysql://localhost:3306/testdb";
	 private static final String username="root";
	 private static final String password="root123";
	 public static Connection getConnection()
	 {
     try {
    	   Connection con= DriverManager.getConnection(url,username,password);
    	   return con;
    	   
     }
     catch(Exception e) {
    	e.printStackTrace();
     }
     return null;
}
}
