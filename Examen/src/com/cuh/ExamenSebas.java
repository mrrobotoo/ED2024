package com.cuh;
import java.util.Stack;
public class ExamenSebas {

	public static void main(String[] args) {
	    Stack<Integer> pila1 = new Stack<>();
	    Stack<Integer> pila2 = new Stack<>();
	    Stack<Integer> pila3 = new Stack<>();


	        for (int i = 1; i <= 7; i++) {
	            pila1.push(i * 2);
	            pila2.push(i * 3); 
	        }

	        while (!pila1.isEmpty() && !pila2.isEmpty()) {
	            int top1 = pila1.pop();
	            int top2 = pila2.pop();

	            if (top1 % 5 == 0 || top2 % 5 == 0) {
	                if (top1 % 5 == 0) {
	                	pila3.push(top1);
	                }
	                if (top2 % 5 == 0) {
	                	pila3.push(top2);
	                }
	            } else {
	            	pila3.push(top1 * top2);
	            }
	        }
	        System.out.println("numeros en pla 3:");
	        while(!pila3.isEmpty()) {
	        	System.out.println(pila3.pop());
	        }
	}
}

	        













