package com.cuh;

import java.util.Stack;

public class PilaParEimpar {
	
     public static Stack<Integer> separarParImpar(Stack<Integer> pila) {
		
			Stack<Integer>numPares=new Stack<Integer>();
			Stack<Integer>numImpares=new Stack<Integer>();
			
			
			while(!pila.isEmpty()) {
				int numeros=pila.pop();
				if (numeros % 2 ==0 ) {
				numImpares.push(numeros);
				}
				System.out.println(pila);
		}
			return numImpares;
     }		
     
}

		
		
	


