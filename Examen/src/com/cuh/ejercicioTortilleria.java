package com.cuh;

import java.util.Stack;
import java.util.Scanner;
public class ejercicioTortilleria {

	public static void main(String[] args) {
		
		 Stack<Persona> pilaClientes = new Stack<>();
		 Stack<Persona> pilaClientesOrdenada = new Stack<>();
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Numero de clientes formador: ");
		 int numClientes = scanner.nextInt();
		 scanner.nextLine();
		 
		 
		 for (int i = 0; i < numClientes; i++) {
			 System.out.println("Ingresa tu hora de llegada: ");
			 int horaLlegada = scanner.nextInt();
			 System.out.println("Ingresa la cantidad de gramos que necesitas: ");
			 int gramosTortillas = scanner.nextInt();
			 scanner.nextLine();
			 
			 Persona persona = new Persona(gramosTortillas, horaLlegada);
			 pilaClientes.push(persona);
			 
		 }
		 
		 while(!pilaClientes.isEmpty()) {
			 Persona clienteActual = pilaClientes.pop();
			 while (!pilaClientesOrdenada.isEmpty() && compararPersona(pilaClientesOrdenada.peek(), clienteActual) > 0) {
				 pilaClientes.push(pilaClientesOrdenada.pop());
			 }
			 pilaClientesOrdenada.push(clienteActual);
		 }
		 
		 System.out.println("\nOrden en que se iran despachando las tortillas ");
		 while (!pilaClientesOrdenada.isEmpty()) {
			 System.out.println(pilaClientesOrdenada.pop());
			 
		 }
		 scanner.close();
		 
		 
	}
	public static int compararPersona(Persona persona, Persona clienteActual) {
		if (persona.horaLlegada != clienteActual.horaLlegada) {
			return persona.horaLlegada - clienteActual.horaLlegada;
		} else {
			return persona.gramosTortillas - clienteActual.gramosTortillas;
		}

	
	}

}
