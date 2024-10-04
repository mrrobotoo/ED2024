package com.cuh;
import java.util.Random;
import java.util.Stack;



public class separarParImpar {

	public static void main(String[] args) {
		
		
		Random randomNumeros = new Random();
		Stack<Integer> Pila = new Stack<Integer>();
		Stack<Integer> Pila2 = new Stack<Integer>();
		Stack<Integer> Pila3 = new Stack<Integer>();
		
		for (int i = 0; i < 10; i++) { //se utiliza el ciclo para generar 10 numeros
	    int numero = randomNumeros.nextInt(30);// creo numeros random del 1 al 30 
	    Pila.push(numero);// los numeros generados se guardan en pilas 
		                    
			if (numero % 2 == 0) {
				Pila2.push(numero);// los numeros que cumplen se guarndan en la pila2
				
			} else {
		
		    Pila3.push(numero); // los numeros que quedan se guardan en la pila 3 
		
			}
		}
		 System.out.println("Numeros Entrada:");
	        while (!Pila.isEmpty()) //verifica si la pila tiene datos
	        	{
	            System.out.println(Pila.pop());
	        }
		
	     System.out.println("Numeros pares:");
		 while (!Pila2.isEmpty()) {
		            System.out.println(Pila2.pop());
		        }
System.out.println("Numeros impares");
		  while (!Pila3.isEmpty()) {
		   System.out.println(Pila3.pop());
		        }
			
		}
	
}





