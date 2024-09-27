package com.cuh;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		Stack<String> navHistorial = new Stack<String>();
		Stack<String> navHistorialFuturo = new Stack<String>();
		
		//operacion para meter paginas
		navHistorial.push("pagina1");
		navHistorial.push("pagina2");
		navHistorial.push("pagina3");

		//pa tras pagina2
		
		navHistorialFuturo.push(navHistorial.pop());
		System.out.println("Estas regresando a "
		+ navHistorial.peek());
		
		//pa tras pagina1
		navHistorialFuturo.push(navHistorial.pop());
		System.out.println("Estas regresando a "
		+ navHistorial.peek());
		
		
		//pagina siguiente   pagina2
		navHistorial.push(navHistorialFuturo.pop());
		System.out.println("Estas avanzando a "
				+ navHistorial.peek());
		
		
		navHistorialFuturo.clear();
		navHistorial.push("pagina4");
		System.out.println("Estas navegando en "
				+ navHistorial.peek());
		
		
	}

}
