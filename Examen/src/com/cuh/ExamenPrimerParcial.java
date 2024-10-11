package com.cuh;

import java.util.Scanner;
import java.util.Stack;

public class ExamenPrimerParcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		Stack <Integer> numEnteros1= new Stack <Integer>();
		Stack <Integer> numEnteros2= new Stack <Integer>();
		Stack <Integer> resultado= new Stack <Integer>();
		
		int numIngresar1;
		int numIngresar2;
		int veces = 6;
		int resultadoMult = 0;
		
		
		for (int i = 0; i <= veces; i++) {
			
			System.out.print("Ingresa un numero: ");
			numIngresar1 = scanner.nextInt();
			numEnteros1.push(numIngresar1);
			
			
			System.out.print("Ingresa otro numero: ");
			numIngresar2 = scanner.nextInt();
			numEnteros2.push(numIngresar2);
			
			resultadoMult = numIngresar1 * numIngresar2;
			
			if (numIngresar1 %5 == 0 || numIngresar2 %5 == 0) {
				resultado.pop();
            	System.out.println("5");
			}
			
//			if (resultadoMult % 5 == 0) {
//				resultado.pop();
//            	System.out.println("5");
//            	
//            } 
			else {
            	System.out.println(resultado.push(resultadoMult));
            }
			
			
			
		}
		
		while(!resultado.isEmpty()){
			
			System.out.println(resultado.pop());
			
		}
		

	}

}
