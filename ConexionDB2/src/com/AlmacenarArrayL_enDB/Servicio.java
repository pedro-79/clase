package com.AlmacenarArrayL_enDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class Servicio extends conexion {

	
	public Collection<Persona> ConsultarTodo() {
	
	Connection conn = getConnection();

	try
	{

		Statement statement = conn.createStatement();
		 ResultSet rs= statement.executeQuery("SELECT * FROM `pruebas`");
		 while (rs.next()){
			System.out.println(rs.getString("nombre"));
		}
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	return null ;
	
	}


}


