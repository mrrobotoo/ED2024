package com.cuh;
import java.util.Stack;
public class SepararParImpar {

	 public static Stack<Integer> separarParImpar(Stack<Integer> pila) {
	  Stack<Integer> pares = new Stack<>();
	  Stack<Integer> impares = new Stack<>();

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

      public static void main(String[] args) {
		  Stack<Integer> pila = new Stack<>();
		   pila.push(2);
		   pila.push(3);
		   pila.push(6);
		   pila.push(8);
		   pila.push(11);
		   pila.push(13);
		   pila.push(18);
		   pila.push(21);

		   pila = separarParImpar(pila);
		   System.out.println(pila);
}
}
