package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<Persona> personasFila = new Stack<Persona>();
		Stack<Persona> filaBajaPrioridad = new Stack<Persona>();
		Stack<Persona> filaAltaPrioridad = new Stack<Persona>();
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
            if(personasFila.peek().getTiempo() > 1) {
            	System.out.println("Es mayor");
            }
        }
		
		scanner.close();

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
        System.out.print("2. Pon la hora en que llego la persona: ");
        return scanner.nextFloat();
    }

    private static float introducirTiempo() {
        System.out.print("3. Pon cuantos gramos de tortilla se llevara: ");
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
		
		if(num == 1) {
			opcion = false;
		} else {
			opcion = true;
		}
		
		return opcion;
	}
}