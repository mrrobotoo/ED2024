
package com.cuh;

public class Persona {
	
	int horaLlegada;
	int gramosTortillas;
	
	public Persona( int gramosTortillas, int horaLlegada) {
		this.horaLlegada = horaLlegada;
		this.gramosTortillas = gramosTortillas;
	}
	
	public String toString() {
		return "Cliente: + Hora de llegada: " + horaLlegada + ", Gramos de tortillas: " + gramosTortillas;
	}
 
	
	} 

