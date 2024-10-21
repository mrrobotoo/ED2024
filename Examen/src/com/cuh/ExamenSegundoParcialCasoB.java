package com.cuh;

public class ExamenSegundoParcialCasoB {

	public static void main(String[] args) {
		int numerosComparacion[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		int numerosDesordenados[] = {0, 1, 6, 3, 2, 0, 9, 0, 8};
		int coincide = 3;
		
		for(int i = 0; i < 9; i++) {
			if(numerosDesordenados[i] == numerosComparacion[i]) {
				coincide--;
			}
			
			if (coincide == 0) {
				System.out.println("El cable no coincide");
				break;
			}
			
		}
		
		if(coincide > 0) {
			System.out.println("El cable coincide");
		}
		
		
	}

}
