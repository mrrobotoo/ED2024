package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {

	public static void main(String[] args) {
		
		
		Stack<Clientes> gramosPedidos = new Stack<>();
		Stack<Clientes> tiempoLlegada = new Stack<>();
		
		
		Scanner scanner = new Scanner (System.in);
		int clientes;
		int gramos;
		String tiempo;
		
		System.out.print("Clientes a atender: ");
		clientes = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < clientes; i++) {

            
            System.out.print("Gramos a comprar de cliente " + (i + 1) + ": ");
            gramos = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Hora de llegada cliente " + (i + 1) + ": ");
            tiempo = scanner.nextLine();  
            
            // Creamos un nuevo cliente y lo agregamos a la pila
            Clientes cliente = new Clientes(tiempo, gramos);
            
            
           //validamos la cantidad de gramos para darle prioridad
            if (gramos < 4000) {
            	gramosPedidos.push(cliente);
            } else {
            	tiempoLlegada.push(cliente);
            }
            
        }
		
		
		
		//damos prioridad a los clientes que compren menos gramos de tortillas
		while (!gramosPedidos.isEmpty()) {
            Clientes cliente = gramosPedidos.pop();  
            System.out.println(cliente);
            
        }
		
		
		//damos prioridad a los clientes dependiendo su hora de llegada
		while (!tiempoLlegada.isEmpty()) {
            Clientes cliente = tiempoLlegada.pop();  
            System.out.println(cliente);
            
        }
		
		

	}

}
