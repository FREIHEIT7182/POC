package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	static Connection con =null;
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconn","root","hari");
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return con;
		
	}

}
