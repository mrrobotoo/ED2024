package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Pila {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pagina = null;
		int opcion;
		boolean key = false;

		while (!key == true) {
			leerMenu();
			opcion = scanner.nextInt();
			scanner.nextLine(); // Preguntar por que se ocupa poner esto despues del .nextInt (¿Es para el salto de linea?)

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
				paDelante();
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
		if (!navHistorial.isEmpty() && navHistorial.size() > 1 ) { //Se corrigio error de emptystack 
			navHistorialFuturo.push(navHistorial.pop()); //Primero que hace empuja y despues destruye? o es al reves?
			System.out.println("\nEstas regresando a " + navHistorial.peek() + ".com\n");
		} else {
			navHistorialFuturo.push(navHistorial.pop());
			System.out.println("\n(No hay paginas para irte pa tras)\n");
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
