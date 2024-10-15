package com.cuh;

public class Arreglos {
	public static void main(String[] args) {
		
		int [] numeros;
		numeros = new int [5];
		
		int[] meterDatos = {1,2,3,4,5}; //forma de meter datos 
		
		System.out.println(meterDatos.length);
		
		
		for (int i = 0; i < meterDatos.length; i++) {
			System.out.println(meterDatos[i]);
		}
		//Cambiarle datos
		meterDatos[0] = 10;
		System.out.println(meterDatos[0]);
		
		String[] meterTexto = {"Hola" , ""}; //forma de meter datos 
		

	
		
	}
	
	

}
