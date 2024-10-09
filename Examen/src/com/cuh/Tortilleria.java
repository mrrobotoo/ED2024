package com.cuh;

import java.util.Scanner;

import java.util.Stack;

import com.cuh.vo.Persona;

public class Tortilleria {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	    Scanner scannner = new Scanner (System.in);
		Stack <String> todasLasPersonas= new Stack<>();
		/*Stack <String> personasPrimero= new Stack<>();
		Stack <String> personasFinal= new Stack<>(); */
		
		// Agrega personas a la pila
		public void todasLasPersonas(String nombre) {
		
		Persona todasLasPersonas = new Persona( nombre);
		
		todasLasPersonas.push(todasLasPersonas);{
		System.out.println(todasLasPersonas.getNombre() + "llego a las:" + todasLasPersonas.getHoraDeLlegada());
	
		}
		public void mostrarPersonas() {
			if (!todasLasPersonas.isEmpty()) {
				String mostrarPersonas = todasLasPersonas.peek();
			}
			
		public void mostrarPersonasFormadas() {
		
			if (!todasLasPersonas.isEmpty());
		System.out.println("Personas: " + todasLasPersonas);

		
		}
		
		/*
		
		private static void personasEnLaFila (String todasLasPersonas,String personasPrimero,String personasFinal ){
			Persona persona = persona(persona);
		System.out.println("¿Cuantas personas hay?"); 
		
		for (int i = 0; i < todasLasPersonas; i++) {  
			System.out.println("¿Cuantos gramos desea?");
		}

		String i;
		todasLasPersonas.push("persona " + (i + 1));

		
		
		tiempo tiempo = new tiempo(tiempo);
		tiempo.setTiempo("");
	    tiempo.setTiempo("50 g");*/
		
	}

}
