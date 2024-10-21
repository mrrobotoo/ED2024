package com.cuh;

public class ExamenA {

	public static void main(String[] args) {
		int arreglo1 [] = new int[9];
		int arreglo2 [] = new int[9];
		
		arreglo1[0]=5;
		arreglo1[1]=2;
		arreglo1[2]=1;
		arreglo1[3]=3;
		arreglo1[4]=0;
		arreglo1[5]=9;
		arreglo1[6]=20;
		arreglo1[7]=8;
		arreglo1[8]=57;
		//arreglo1[9]=17;
		
		arreglo2[0]=5;
		arreglo2[1]=2;
		arreglo2[2]=1;
		arreglo2[3]=3;
		arreglo2[4]=5;
		arreglo2[5]=9;
		arreglo2[6]=20;
		arreglo2[7]=8;
		arreglo2[8]=45;
		//arreglo1[9]=17;
		
		boolean noCoinciden ;
		boolean coinciden = false ;
		for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != arreglo2[i]) {
                coinciden = true;
                System.out.println("el cable no conicide  en la posicin " + i);
                //break;  
            }
        }
        if (coinciden) {
           // System.out.println("los cacbles coniciden ");
        }
		
	}

}





