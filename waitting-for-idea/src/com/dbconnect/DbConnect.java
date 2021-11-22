package com.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	//backup database
//	private static String DB_URL = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6410345?useSSL=false";
//    private static String USER_NAME = "sql6410345";
//    private static String PASSWORD = "KWAE4GRBWX";
    
    private static String DB_URL = "jdbc:mysql://localhost:3306/laleaf?useSSL=false";
    private static String USER_NAME = "root";
    private static String PASSWORD = "root";
    public static Connection getConnection()  {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
		return conn;
	}
}
