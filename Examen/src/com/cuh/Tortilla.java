package com.cuh;
import java.util.Stack;

public class Tortilla {
	
	double  gramos;
	String turno;
	
	public Tortilla(double gramos, String turno) {
		this.gramos= gramos; 	
		this.turno= turno;
	
	}

	 public static void main(String[] args) {
	        Stack<Tortilla> tortilleria = new Stack<Tortilla>();
	     //Objetos "tortilla" agregados a la pila tortilleria
	        tortilleria.push(new Tortilla(5.5, "10:00 am"));
	        tortilleria.push(new Tortilla(5.5, "10:00 am"));
	        tortilleria.push(new Tortilla(5.5, "10:00 am"));
	        tortilleria.push(new Tortilla(5.5, "10:00 am"));
	        	
	        
	        /*Se ocupara un ciclo while proque el codigo continuta corriendo 
	        mientras la pila tortilleria no esté vacía.*/
	 }
    
}
    
