package com.cuh;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Pila {

	

	static Stack<String> navHistorial = new Stack<String>();
	static Stack<String> navHistorialFuturo = new Stack<String>();


	private static void paTras() {
		if (!navHistorial.isEmpty() && navHistorial.size() > 1 ) { //Se corrigio error de emptystack 
			

			navHistorialFuturo.clear();
			navHistorial.push("pagina4");
			System.out.println("Estas navegando en "
					+ navHistorial.peek());
			
			
		}else {
			System.out.println("No hay paginas para irte pa delante");
			

			
		}
	}
	
	private static void navegar() {
		navHistorial.push("pagina1");
		navHistorial.push("pagina2");
		navHistorial.push("pagina3");
		
	
		
	}
	
	public static void main(String[] args) {

		//operacion para meter paginas
		navegar();

		//pa tras pagina2
		paTras();
	
		
		//pa tras pagina1
		paTras();
		
		
		
		//pagina siguiente   pagina2
		
		paDelante();
		
		
	
			navHistorialFuturo.push(navHistorial.pop()); //Primero que hace empuja y despues destruye? o es al reves?
			System.out.println("\nEstas regresando a " + navHistorial.peek() + ".com\n");
		

	}

	private static void paDelante() {
		if (!navHistorialFuturo.isEmpty()) {
			navHistorial.push(navHistorialFuturo.pop());
			System.out.println("\nEstas avanzando a " + navHistorial.peek() + ".com\n");
		} else {
			System.out.println("\n(No hay paginas para irte pa delante)\n");
		}
	}

	private static void navegar(String navegar) {
		navHistorialFuturo.clear();
		navHistorial.push(navegar);
		System.out.println("\nEstas navegando en: " + navHistorial.peek() + ".com\n");

	}

	private static void leerMenu() {
		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Buscar pagina");
		System.out.println("2. Ir para atras");
		System.out.println("3. Ir adelante");
		System.out.println("4. Salir");
		System.out.print("Eliga una opcion: ");
	}
	

}
