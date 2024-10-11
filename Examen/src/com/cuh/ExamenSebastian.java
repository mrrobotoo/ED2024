package com.cuh;

import java.util.Stack;

public class ExamenSebastian {

	public static void main(String[] args) {
		
		
		Stack <Integer> pila1 = new Stack <Integer>();
		Stack <Integer> pila2 = new Stack <Integer>();
		Stack <Integer> pila3 = new Stack <Integer>();
		
		
		pila1.push(1);
		pila1.push(2);
		pila1.push(4);
		pila1.push(9);
		pila1.push(2);
		pila1.push(5);
		pila1.push(3);
	
		pila2.push(4);
		pila2.push(10);
		pila2.push(1);
		pila2.push(4);
		pila2.push(12);
		pila2.push(9);
		pila2.push(3);
		
		
		
		System.out.println(pila1);
		System.out.println(pila2);
		
		for (int i = 0; i < 5; i++) {
			pila1.push(i);
		}
		
		System.out.println(pila1);
		while (!pila1.isEmpty()) {
			
			
			
			
		}
		

	}

}
