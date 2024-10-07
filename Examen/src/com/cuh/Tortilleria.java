package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Persona> personasFila = new Stack<Persona>();
		Persona persona = new Persona();
		String nombrePersona = null;
		float gramos = 0;
		float tiempo = 0;
		boolean opcion = false;
		
		
		nombrePersona = introducirNombre(nombrePersona);
		introducirGramos(gramos);
		introducirTiempo(tiempo);
		finalizarBucle(opcion);
		scanner.close();
	}
	
	private void agregarPersona() {
		
	}

	private static String introducirNombre(String nombrePersona) {
		System.out.println("Agregar persona");
		System.out.print("1. Nombre de la Persona: ");
		nombrePersona = scanner.nextLine();
		return nombrePersona;
	}
	
	private static float introducirGramos(float gramos) {
		System.out.print("2. Pon la hora en que llego la persona: ");
		gramos = scanner.nextFloat();
		return gramos;
	}

	private static float introducirTiempo(float tiempo) {
		System.out.print("3. Pon cuantos gramos de tortilla se llevara: ");
		tiempo = scanner.nextFloat();
		return tiempo;
	}
	
	private static boolean finalizarBucle(boolean opcion) {
		System.out.println("4. Quieres finalizar la entrada de datos");
		System.out.println("	(1 para Si) (2 para No)");
		System.out.print("Eliga una opcion: ");
		opcion = scanner.hasNextBoolean();
		return opcion;
	}
}