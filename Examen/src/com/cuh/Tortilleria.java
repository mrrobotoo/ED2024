package com.cuh;

import java.util.Stack;

public class Tortilleria {

	public static void main(String[] args) {
		
		 Stack<Persona> pilaOriginal = new Stack<Persona>();
	        Stack<Persona> pilaOrdenadaPorHora = new Stack<Persona>();

	        Stack<Persona> pilaMenosDeMilGramos = new Stack<Persona>();
	        Stack<Persona> pilaMasDeMilGramos = new Stack<Persona>();

	        Stack<Persona> pilaFinal = new Stack<Persona>();

	        Persona diego = new Persona("10:20:00", 100);
	        Persona angeles = new Persona("13:25:45", 1000);
	        Persona ariana = new Persona("12:33:01", 3000);
	        Persona marisol = new Persona("12:59:00", 250);
	        Persona mauricio = new Persona("09:00:00", 500);
	        Persona leonardo = new Persona("10:55:25", 750);
	        Persona renata = new Persona("14:00:00", 2500);

	        pilaOriginal.push(diego);
	        pilaOriginal.push(angeles);
	        pilaOriginal.push(ariana);
	        pilaOriginal.push(marisol);
	        pilaOriginal.push(mauricio);
	        pilaOriginal.push(leonardo);
	        pilaOriginal.push(renata);
	        
	        	System.out.println(pilaOriginal);
	        	System.out.println(pilaOriginal.peek());
	        	
	        	pilaOrdenadaPorHora = ordenarPorHoraDeLlegada(pilaOriginal);

	        	 System.out.println(pilaOrdenadaPorHora);
	             System.out.println(pilaOrdenadaPorHora.peek());
	             
	             Persona auxiliar;
	             
	             while (!pilaOrdenadaPorHora.isEmpty()) {
	                 auxiliar = pilaOrdenadaPorHora.pop();
	                 if (auxiliar.getGramosSolicitados() >= 1000) {
	                     pilaMasDeMilGramos.push(auxiliar);
	                 } else {
	                     pilaMenosDeMilGramos.push(auxiliar);
	                 }
	             }
	             System.out.println("Pila de pedidos grandes: " + pilaMasDeMilGramos);
	             System.out.println("Pila de pedidos pequeños: " + pilaMenosDeMilGramos);
	             
	             while (!pilaMasDeMilGramos.isEmpty()) {
	                 pilaFinal.push(pilaMasDeMilGramos.pop());
	             }

	             while (!pilaMenosDeMilGramos.isEmpty()) {
	                 pilaFinal.push(pilaMenosDeMilGramos.pop());
	             }
	             
	             System.out.println(pilaFinal);

    }
	private static Stack<Persona> ordenarPorHoraDeLlegada(Stack<Persona> pilaOriginal) {
        Stack<Persona> pilaOrdenadaPorHora = new Stack<Persona>();
        Stack<Persona> pilaTemporal = new Stack<Persona>();

        Persona personaTemporal;
        
        while (!pilaOriginal.isEmpty()) {
            personaTemporal = pilaOriginal.pop();
            insertarPersonaEnOrden(personaTemporal, pilaOrdenadaPorHora, pilaTemporal);
        }
        return pilaOrdenadaPorHora;
    }
	
	 private static void insertarPersonaEnOrden(Persona persona, Stack<Persona> pilaOrdenada, Stack<Persona> pilaTemporal) {
	        if (pilaOrdenada.isEmpty()) {
	            pilaOrdenada.push(persona);
	            vaciarPilaTemporal(pilaOrdenada, pilaTemporal);
	        } else {
	        	 if (persona.getHoraLlegada().compareTo(pilaOrdenada.peek().getHoraLlegada()) <= 0) {
	                 pilaOrdenada.push(persona);
	                 vaciarPilaTemporal(pilaOrdenada, pilaTemporal);
	             } else {
	                 pilaTemporal.push(pilaOrdenada.pop());
	                 insertarPersonaEnOrden(persona, pilaOrdenada, pilaTemporal);
	        }
	

	        }
	 
	 }
	private static void vaciarPilaTemporal(Stack<Persona> pilaOrdenada, Stack<Persona> pilaTemporal) {
		// TODO Auto-generated method stub
		
	}
}