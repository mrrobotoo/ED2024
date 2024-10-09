package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {

	public static void main(String[] args) {
		
		
		Stack<Clientes> clienteAtender = new Stack<>();
		
		
		Scanner scanner = new Scanner (System.in);
		int clientes;
		int gramos;
		String tiempo;
		
		System.out.println("Clientes a atender:");
		clientes = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < clientes; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            
            System.out.print("Gramos a comprar: ");
            gramos = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Hora de llegada: ");
            tiempo = scanner.nextLine();  
            
            // Creamos un nuevo cliente y lo agregamos a la pila
            Clientes cliente = new Clientes(tiempo, gramos);
            clienteAtender.push(cliente);
        }
		
		
		
		//damos prioridad a los clientes que compren menos gramos de tortillas
		while (!clienteAtender.isEmpty()) {
            Clientes cliente = clienteAtender.peek();  
            
            if (cliente.getGramos() < 4000) {
                System.out.println("El cliente compro " + cliente.getGramos() + " gramos de tortillas.");
            } else {
                System.out.println("El cliente compro más de 4000 gramos y llegó a las " + cliente.getTiempo() + ".");
            }
            
            clienteAtender.pop();  // Quitamos al cliente que ya fue atendido
        }

		

	}

}
