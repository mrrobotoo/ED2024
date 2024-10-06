package com.cuh;

import java.util.Stack;

public class ParImpar {

	
	static Stack<Integer> numPar = new Stack<Integer>();
	static Stack<Integer> numImpar = new Stack<Integer>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = {1, 6, 4, 8, 7, 10, 2, 15, 4, 3, 31, 60};
		int paresTotales = 0;
		int num;
		
		 for (int i = 0; i < numeros.length; i++) {
	            num = numeros[i];  
	            numPar.push(num);  
	            
	            if (num % 2 == 0) {
	            	paresTotales++;
	            } else {
	            	numImpar.push(num);
	            }
	        }
		 
		
		 System.out.println("Pila de números impares: " + numImpar);
	     System.out.println("Pila de números pares: " + numPar);
	       


	}

}
