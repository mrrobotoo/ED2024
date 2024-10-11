package com.cuh;

import java.util.Stack;
import java.util.Scanner;

public class ExamenEstructuraDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Stack <Integer> pila1 = new Stack<Integer>();
		Stack <Integer> pila2 = new Stack<>();
		Stack <Integer> pila3 = new Stack<>();
		
		int suma = 0;
		int resultado = 0;
		int numero = 0;
		
		pila1.push(2);
		pila1.push(4);
		pila1.push(3);
		pila1.push(1);
		pila1.push(5);
		pila1.push(2);
		pila1.push(1);
		
		System.out.println("Primer Pila");
		System.out.println(pila1);
		
		pila2.push(10);
		pila2.push(2);
		pila2.push(5);
		pila2.push(7);
		pila2.push(8);
		pila2.push(12);
		pila2.push(9);
		
		System.out.println("Segunda Pila");
		System.out.println(pila2);
		
		
		for (int i = 0; i < suma; i ++) {
		System.out.println(resultado(i ++));
			
		}
		System.out.println("Tercera pila con los resultados");
		System.out.println(resultado);
		
		
	}

	private static char[] resultado(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
