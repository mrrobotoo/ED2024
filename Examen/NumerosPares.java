package com.cuh;
import java.util.Stack;
public class NumerosPares {

	public static void main(String[] args) {
		 Stack<Integer> pilaNumeros = new Stack<>();

	        
	        pilaNumeros.push(2);
	        pilaNumeros.push(3);
	        pilaNumeros.push(4);
	        pilaNumeros.push(5);
	        pilaNumeros.push(6);
	        pilaNumeros.push(7);
	        pilaNumeros.push(8);
	        pilaNumeros.push(9);

	       
	        System.out.print("Números pares: ");
	        for (int numero : pilaNumeros) {
	            if (numero % 2 == 0) {
	                System.out.print(numero + " "); 
	            }
	        }

	        System.out.println();  

	        System.out.print("Números impares: ");
	        for (int numero : pilaNumeros) {
	            if (numero % 2 != 0) {
	                System.out.print(numero + " "); 
	            }
	        }

	}

}
