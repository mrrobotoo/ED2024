package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<Persona> personasFila = new Stack<Persona>();
		Stack<Persona> filaBajaPrioridad = new Stack<Persona>();
		Stack<Persona> filaAltaPrioridad = new Stack<Persona>();
		Stack<Persona> comparar = new Stack<Persona>();
		String nombrePersona = null;
		float gramos = 0;
		float tiempo = 0;
		boolean opcion = false;

		do {
			nombrePersona = introducirNombre();
			gramos = introducirGramos();
			tiempo = introducirTiempo();
			agregarPersona(personasFila, nombrePersona, gramos, tiempo);
			opcion = finalizarBucle(opcion);
		} while (opcion != false);

		int tamañoFila = personasFila.size();

		for (int i = 0; i < tamañoFila; i++) {
			if (personasFila.peek().getgr() < 1000) {
				filaAltaPrioridad.push(personasFila.pop());
			} else {
				filaBajaPrioridad.push(personasFila.pop());
			}
		}

		personasFila.clear();

		int repeticiones = filaAltaPrioridad.size();
		

		while (!filaAltaPrioridad.isEmpty()) {
			
			comparar.push(filaAltaPrioridad.pop());
			repeticiones--;
			
			for (int j = 0; j < repeticiones; j++) {
				
				if (comparar.peek().getTiempo() > filaAltaPrioridad.peek().getTiempo()) {
					personasFila.push(filaAltaPrioridad.pop());
				} else {
					personasFila.push(comparar.pop());
					comparar.push(filaAltaPrioridad.pop());
				}

				while (!personasFila.isEmpty()) {
					filaAltaPrioridad.push(personasFila.pop());
				}
			}
			
		}
	
		while (!comparar.isEmpty()) {
			filaAltaPrioridad.push(comparar.pop());
		}
		
		personasFila.clear();
		
		repeticiones = filaBajaPrioridad.size();

		while (!filaBajaPrioridad.isEmpty()) {
			
			comparar.push(filaBajaPrioridad.pop());
			repeticiones--;
			
			for (int j = 0; j < repeticiones; j++) {
				
				if (comparar.peek().getTiempo() > filaBajaPrioridad.peek().getTiempo()) {
					personasFila.push(filaBajaPrioridad.pop());
				} else {
					personasFila.push(comparar.pop());
					comparar.push(filaBajaPrioridad.pop());
				}

				while (!personasFila.isEmpty()) {
					filaBajaPrioridad.push(personasFila.pop());
				}
			}
			
		}
		
		while (!comparar.isEmpty()) {
			filaBajaPrioridad.push(comparar.pop());
		}
		
		imprimirPila(filaAltaPrioridad, "Fila Alta Prioridad");
		imprimirPila(filaBajaPrioridad, "Fila Baja Prioridad");

		scanner.close();

	}
	private static void imprimirPila(Stack<Persona> pila, String nombrePila) {
		System.out.println("\n" + nombrePila + ":");
		if (pila.isEmpty()) {
			System.out.println("La pila está vacía.");
		} else {
			for (Persona persona : pila) {
				System.out.println(persona.getNombre() + " - Gramos: " + persona.getgr() + " - Hora: " + persona.getTiempo());
			}
		}
	}

	private static void agregarPersona(Stack<Persona> personasFila, String nombre, float gramos, float tiempo) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setgr(gramos);
		persona.setTiempo(tiempo);
		personasFila.push(persona);
		System.out.println("Persona agregada a la fila.");
	}

	private static String introducirNombre() {
		System.out.println("Agregar persona");
		System.out.print("1. Nombre de la Persona: ");
		return scanner.nextLine();
	}

	private static float introducirGramos() {
		System.out.print("2. Pon cuantos gramos de tortilla se llevara: ");
		return scanner.nextFloat();
	}

	private static float introducirTiempo() {
		System.out.print("3. Pon la hora en que llego la persona: ");
		return scanner.nextFloat();
	}

	private static boolean finalizarBucle(boolean opcion) {
		int num;
		System.out.println("4. Quieres finalizar la entrada de datos");
		System.out.println("	(1 para Si) (2 para No)");
		System.out.print("Eliga una opcion: ");
		num = scanner.nextInt();
		scanner.nextLine();
		System.out.println();

		if (num == 1) {
			opcion = false;
		} else {
			opcion = true;
		}

		return opcion;
	}
}