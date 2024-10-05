package com.cuh;
import java.util.Stack;
public class PilaParEimpar {
	
		public static void  main (String[] args) {
		Stack<Integer> numerosIngresadosPorElSistema = new Stack<Integer>();
		
		numerosIngresadosPorElSistema.push(445);
		numerosIngresadosPorElSistema.push(444);
		numerosIngresadosPorElSistema.push(221);
		numerosIngresadosPorElSistema.push(875);
		numerosIngresadosPorElSistema.push(12);
		numerosIngresadosPorElSistema.push(75);
		numerosIngresadosPorElSistema.push(14);
		numerosIngresadosPorElSistema.push(90);
		numerosIngresadosPorElSistema.push(888);
		numerosIngresadosPorElSistema.push(2);
		
			//Se llama al metodo parEImpar
			Stack<Integer> pilaFinal = parEImpar(numerosIngresadosPorElSistema);		
    }
			private static Stack<Integer> parEImpar(Stack<Integer> numerosIngresadosPorElSistema) {
			Stack<Integer> numerosPares = new Stack<Integer>();
			Stack<Integer> numerosImpares = new Stack<Integer>();
			Stack<Integer> pilaFinal = new Stack<Integer>();
			
			
				while (!numerosIngresadosPorElSistema.isEmpty()) {
					int numero = numerosIngresadosPorElSistema.pop(); 
		            if (numero % 2 == 0) { 
		                numerosPares.push(numero);  
		            } else {
		                numerosImpares.push(numero); 
		            }
		            //En este while se duardaran primero los pares en la pila final
		        }
				while (!numerosPares.isEmpty()) {
		            pilaFinal.push(numerosPares.pop());
		        }

		        //En este fuardaremos los impares en la pila final
		        while (!numerosImpares.isEmpty()) {
		            pilaFinal.push(numerosImpares.pop());
		        
		        
		        }
		        //Imprimí el metodo final
		        System.out.println("Pila en orden de acuerdo al ejercicio ; " + "\n"+ pilaFinal);

		        return pilaFinal; 
		    }		
		}
	