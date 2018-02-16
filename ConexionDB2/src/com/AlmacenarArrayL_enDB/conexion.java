package com.AlmacenarArrayL_enDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	public static Connection getConnection() {
		Connection databaseConnection= null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sourceURL = "jdbc:mysql://localhost/personas";
			 databaseConnection = DriverManager.getConnection(sourceURL, "root", "");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return databaseConnection ;

	}

	}

	
	
	
	
	
	


