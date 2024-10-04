package com.cuh;

import java.util.Stack;

public class GeneradorParesImpares {
	
	public static Stack<String> separarParImpar(Stack<String> pila) {
        Stack<String> pilaPares = new Stack<>();
        Stack<String> pilaImpares = new Stack<>();
        Stack<String> pilaFinal = new Stack<>();
        
        Stack<String> pilaOriginal = new Stack<>();
        		
        while (!pila.isEmpty()) {
            pilaOriginal.push(pila.pop());
        }
        
        
     
        for (int i = 0; i < pilaOriginal.size(); i++) {
            String numeroStr = pilaOriginal.get(i);
            int numero = Integer.parseInt(numeroStr); 

            if ((numero & 1) == 0) { 
                pilaPares.push(numeroStr);  
            } else {
                pilaImpares.push(numeroStr);
            }
        }

        while (!pilaPares.isEmpty()) {
            pilaFinal.push(pilaPares.pop());
        
     }
        
        while (!pilaImpares.isEmpty()) {
            pilaFinal.push(pilaImpares.pop());

   }
        return pilaFinal; 
}

	  public static void main(String[] args) {
	     
	        Stack<String> pila = new Stack<>();
	        pila.push("3");
	        pila.push("5");
	        pila.push("6");
	        pila.push("8");
	        pila.push("11");
	        pila.push("13");
	        pila.push("20");
	        pila.push("31");
	        pila.push("24");
	        pila.push("17");
	        
	        System.out.println("Pila original: ");
	        imprimirPila(pila);

	        Stack<String> pilaSeparada = separarParImpar(pila);

	        System.out.println("\nPila separada (pares abajo, impares arriba): ");
	        imprimirPila(pilaSeparada);
	    }

	  public static void imprimirPila(Stack<String> pila) {
	        Stack<String> temp = new Stack<>();

	       
	        while (!pila.isEmpty()) {
	            String elemento = pila.pop();
	            System.out.println(elemento); 
	            temp.push(elemento); 
	        }

	        
	        while (!temp.isEmpty()) {
	            pila.push(temp.pop());
	        }
	    }
	
	}

	

	

   
