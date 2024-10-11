package com.cuh;

import java.util.Stack;

public class examenSebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> numeros1 = new Stack<Integer>();
		Stack<Integer> numeros2 = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();
	int suma1;
	int suma2;
		numeros1.push(1);
		numeros1.push(2);
		numeros1.push(3);
		numeros1.push(4);
		numeros1.push(5);
		numeros1.push(6);
		numeros1.push(7);
	
		numeros2.push(4);
		numeros2.push(10);
		numeros2.push(1);
		numeros2.push(4);
		numeros2.push(12);
		numeros2.push(9);
		numeros2.push(3);
		 
	for (int i = 0; i < 7 ; i++) {
	
		suma1 = numeros1.pop();
		suma2 = numeros2.pop();
		
		auxiliar.push(suma1 + suma2);
	
	
	if (suma1 >= 10 || suma2 >= 10 ) {
		 
		
	}
	
	}
	
		while (!auxiliar.isEmpty()) {
			System.out.println(auxiliar.pop());
		}
		
		
		
		
		
		
		
		
		
		 }
	}

