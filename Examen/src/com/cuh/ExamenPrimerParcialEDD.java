package com.cuh;

import java.util.Stack;

public class ExamenPrimerParcialEDD {

	public static void main(String[] args) {
		Stack<Integer> pila1 = new Stack<Integer>();
		Stack<Integer> pila2 = new Stack<Integer>();
		Stack<Integer> resultado = new Stack<Integer>();
		
		pila1.push(3);
		pila1.push(5);
		pila1.push(2);
		pila1.push(9);
		pila1.push(4);
		pila1.push(2);
		pila1.push(1);
		
		pila2.push(3);
		pila2.push(9);
		pila2.push(12);
		pila2.push(4);
		pila2.push(1);
		pila2.push(10);
		pila2.push(4);
		
		
		for(int i = 0; i < 7; i++) {
			if(pila1.peek() <= 9 && pila2.peek() <= 9) {
				resultado.push(pila1.pop() + pila2.pop());
			} else if (pila1.peek() <= 9) {
				resultado.push(pila2.pop());
				pila1.pop();
			} else {
				resultado.push(pila1.pop());
				pila2.pop();			}
		}
		
			System.out.println(resultado);
			
	}

}
