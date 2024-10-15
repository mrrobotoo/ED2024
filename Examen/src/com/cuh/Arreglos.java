package com.cuh;

import java.util.Iterator;

public class Arreglos {

	public static void main(String[] args) {
		int [] numeros; //declaración
		
		numeros = new int [5];
		
		int [] meterDatos = {1,2,3,4,5};
		
		System.out.println(meterDatos.length);
		System.out.println(meterDatos[3]);
		for (int i = 0; i < meterDatos.length; i++) {
			System.out.println(meterDatos[i]);
			
		}
		
		meterDatos[0] = 10; //modificar los datos
		System.out.println(meterDatos[0]);

			//bandera verificar si esta o no
	}

}
