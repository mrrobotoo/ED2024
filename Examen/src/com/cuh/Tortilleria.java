package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Persona> personasFila = new Stack<Persona>();
		Persona persona = new Persona();
		String nombrePersona;
		float gramos;
		float tiempo;
		
		mostrarGr();
		gramos = scanner.nextFloat(); 
		mostrarTiempo();
		tiempo = scanner.nextFloat();
		salir();

	}
	
	private void agregarPersona() {
		
	}

	private static void mostrarNombre() {
		System.out.println("Agregar persona");
		System.out.print("1. Nombre de la Persona: ");
	}
	
	private static void mostrarGr() {
		System.out.print("2. Pon la hora en que llego la persona: ");
	}

	private static void mostrarTiempo() {
		System.out.print("3. Pon cuantos gr de tortilla se llevara: ");
	}
	
	private static void salir() {
		System.out.println("4.Quieres finalizar la entrada de datos");
		System.out.println("1 para Si 2 para No");
		System.out.print("Eliga una opcion: ");
	}
}