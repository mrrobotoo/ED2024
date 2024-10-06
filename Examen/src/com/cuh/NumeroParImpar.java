package cuh.com.mx;

import java.util.Stack;

public class NumeroParImpar {
	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<>();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.push(6);
		pila.push(7);
		pila.push(8);
		pila.push(9);
		pila.push(10);
		
		Stack<Integer> pilaPar = new Stack<>();
		Stack<Integer> pilaImpar = new Stack<>();
		
		while (!pila.isEmpty()) {
			int numero = pila.pop();
			
			if (numero % 2 == 0) {
				pilaPar.push(numero);
			} else {
				pilaImpar.push(numero);
			}
		}
		
		System.out.println("Los numeros pares son: " + pilaPar);
		System.out.println("Los numeros pares son: " + pilaImpar);
		
     
}

}