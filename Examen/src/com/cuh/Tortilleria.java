package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class Tortilleria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <Integer> gramosComprar = new Stack <Integer>();
		Stack <Integer> tiempoEspera = new Stack <Integer>();
		
		Scanner scanner = new Scanner (System.in);
		int clientes;
		int gramos;
		
		System.out.println("Numero de clientes a atender:");
		clientes = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0; i<clientes; i++) {
			
			System.out.println("Cliente " + (i + 1)+ ":");
			
			System.out.println("Gramos a comprar: ");
			gramos =  scanner.nextInt();
			gramosComprar.push(gramos);
		}
		

	}

}
