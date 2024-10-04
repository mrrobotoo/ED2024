package com.cuh;

import java.util.Stack;

public class PilaParEimpar {

	
     
     public static Stack<Integer> separarParImpar(Stack<Integer> pila) {
		
			Stack<Integer>numPares=new Stack<Integer>();
			Stack<Integer>numImpares=new Stack<Integer>();
			
			
			while(!pila.isEmpty()) {
				int numeros=pila.pop();
				if (numeros % 2 ==0 ) {
				}
				System.out.println(pila);
		}
			return numImpares;
     }		
	public static void main(String[] args) {
	 Stack<Integer> pila = new Stack<>();
     pila.push(222);
     pila.push(324);
     pila.push(675);
     pila.push(835);
     pila.push(110);
     pila.push(444);
     pila.push(22);
     pila.push(2);
	}
		
		
	

}
