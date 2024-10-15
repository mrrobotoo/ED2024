package com.cuh;


import java.util.Scanner;
import java.util.Stack;

import com.cuh.vo.Persona;

public class Tortilleria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
     Scanner scanner = new Scanner(System.in);
     Stack <String> todasLasPersonas = new Stack<>();
     Stack <String> personasOrdenadas = new Stack<>();
     
     String personas;
     int tiempo;
     int gramos;

	    System.out.println("Ingrese el total de personas");
	    personas = scanner.toString();
	    scanner.nextLine();
	    for (int i = 0; i < 0; i++) {
	    
	    System.out.println("Persona" + (i +1));
	    scanner.nextLine();
	    System.out.println("Ingrese los gramos que requiere");
	    gramos = scanner.nextInt();
	    
	    System.out.println("Ingrese la hora en que llego");
	    tiempo = scanner.nextInt();
	    
	    String persona = new String( );
	   todasLasPersonas.push(persona);
	    
	  }
	   System.out.println("Personas formadas");
	   while (!todasLasPersonas.isEmpty()) {
		   personas = todasLasPersonas.pop();
		   
		 
		   }
	   
	    
	    
	 
	  
		
	}

}
