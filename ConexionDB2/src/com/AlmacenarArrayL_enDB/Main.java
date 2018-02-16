package com.AlmacenarArrayL_enDB;


import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Servicio sr=new Servicio();
		
		Collection <Persona> collection = sr.ConsultarTodo();
	
		Iterator<Persona> it = collection.iterator();
		while(it.hasNext()){
			Persona persona = it.next();
			System.out.println(persona.getNombre());
		}
		
	
	
		
	}

}
