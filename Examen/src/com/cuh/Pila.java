
package com.cuh;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Pila {

	public static void main1(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pagina ="";
		int opcion;
		Boolean key = false;


		while (!key == true) {
			leerMenu();
			opcion = scanner.nextInt();
			scanner.nextLine();
				
			switch (opcion) {
			case 1:
				System.out.print("Ingresa el nombre de la pagina: ");
				pagina = scanner.nextLine();
				navegar(pagina);
				break;
			case 2:
				paTras();
				break;
			case 3:
				paDelante1();
				break;
			case 4:
				key = true;
				break;
			default:
				System.out.println("\n(Esa opcion no es valida por favor ingrese de nuevo una opción)");
				break;
			}

		}
		
		scanner.close();
		
		System.out.println("\nSaliendo del programa...");
		
	}

	static Stack<String> navHistorial = new Stack<String>();
	static Stack<String> navHistorialFuturo = new Stack<String>();

	private static void paTras() {

		if(!navHistorial.isEmpty()) {
			navHistorialFuturo.push(navHistorial.pop());
			System.out.println("Estas regresando a "
			+ navHistorial.peek());	
		}else {
			System.out.println("No hay paginas para irte pa tras");
		}
		
	}
	private static void paDelante1() {
		if(!navHistorialFuturo.isEmpty()) {
			navHistorial.push(navHistorialFuturo.pop());
			System.out.println("Estas avanzando a "
					+ navHistorial.peek());
			navHistorialFuturo.clear();
			navHistorial.push("pagina4");
			System.out.println("Estas navegando en "
					+ navHistorial.peek());
			
			
		if (!navHistorial.isEmpty() && navHistorial.size() > 1 ) { //Se corrigio error de emptystack 

			
			navHistorialFuturo.push(navHistorial.pop()); //Primero que hace empuja y despues destruye? o es al reves?
			System.out.println("\nEstas regresando a " + navHistorial.peek() + ".com\n");
		} else {
			navHistorialFuturo.push(navHistorial.pop());
			System.out.println("\n(No hay paginas para irte pa tras)\n");
		}
		}

	}

	private static void paDelante() {
		if (!navHistorialFuturo.isEmpty()) {
			navHistorial.push(navHistorialFuturo.pop());
			System.out.println("\nEstas avanzando a " + navHistorial.peek() + ".com\n");
		} else {
			System.out.println("\n(No hay paginas para irte pa delante)\n");
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
		System.out.print("Eliga una opcion: ");
	
	}
	

}



