package com.cuh;

public class examenDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]  numeros1 = {3,4,20,30,31,8,9,6,4};
		int[]  numeros2 = {3,5,10,15,20,7,8,9,1};
		
		int coincidencias=-1;
		for (int i = 0; i < numeros2.length; i++) {
			
		
		}
		for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] == numeros2[i]) { 
                coincidencias++; 
            }
        }

        if (coincidencias >=0 & coincidencias <=2) {
            System.out.println("el cable esta orrecto  Hay al menos"+coincidencias +"coincidencias");
        } else {
            System.out.println("cable incorrecto No hay suficientes coincidencias.");
        }
	}

}
