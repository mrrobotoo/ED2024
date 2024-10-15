package com.cuh;

import java.util.Stack;


public class Parimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
		  public static Stack<Integer> separarParImpar(Stack<Integer> pila) {
		        Stack<Integer> pares = new Stack<>();
		        Stack<Integer> impares = new Stack<>();
		        

		        Stack<Integer>pila1 = new Stack<>();
		    		        
		    	pila1.push(2);
		    	pila1.push(3);
		    	pila1.push(6);
		    	pila1.push(8);
		    	pila1.push(11);
		    	pila1.push(13);
		    	pila1.push(18);
		    	pila1.push(21);
		    	System.out.println("Pila" + pila1);
		         Stack<Integer> paresEimpaers = separarParImpar(pila1);
		        System.out.println("Pila con pares e impares" + paresEimpaers);

		    	
		        while (!pila.isEmpty()) {
		            int num = pila.pop();
		            if (num % 2 == 0) {
		                pares.push(num);
		            } else {
		                impares.push(num);
		            }
		        }
		        while (!pares.isEmpty()) {
		            pila.push(pares.pop());
		        }
		        
		        while (!impares.isEmpty()) {
		            pila.push(impares.pop());
		        }

		        return pila;
		    }
		   public static void main1(String[] args) {

		}
}
		   
