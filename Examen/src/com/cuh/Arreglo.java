package com.cuh;

public class Arreglo {
	public static void main(String[] args) {
		Double renglon1[] = new Double[4];
		Double renglon2[] = new Double[4];
		Double renglon3[] = new Double[4];

		
		renglon1[0]=5.0;
		renglon1[1]=2.0;
		renglon1[2]=1.0;
		renglon1[3]=20.0;
		
		renglon2[0]=2.0;
		renglon2[1]=1.0;
		renglon2[2]=2.0;
		renglon2[3]=10.0;
		
		renglon3[0]=4.0;
		renglon3[1]=1.0;
		renglon3[2]=3.0;
		renglon3[3]=17.0;
		//renglon2 - n*reglon1
		Double pivoteRenglo1 = renglon1[0];
		Double pivoteRenglo2 = renglon2[0];
		Double pivoteRenglo3 = renglon3[0];
		//String renglon1bonito;
		
		for(int i = 0; i < renglon1.length ;i++) {
			renglon1[i] = renglon1[i]/pivoteRenglo1;
			//renglon1bonito = String.valueOf(renglon1[i]) ;
			System.out.print(renglon1[i] + " ");
		}
		
		System.out.println("");
		for(int i = 0; i < renglon2.length ;i++) {
			renglon2[i] = renglon2[i] - pivoteRenglo2*renglon1[i] ;
			System.out.print(renglon2[i] + " ");
		}
		System.out.println("");
		for(int i = 0; i < renglon3.length ;i++) {
			renglon3[i] = renglon3[i] - pivoteRenglo3*renglon1[i] ;
			System.out.print(renglon3[i] + " ");
		}
		//segunda matriz
		System.out.println("");
		System.out.println("Segunda");
		pivoteRenglo1 = renglon1[0];
		for(int i = 0; i < renglon1.length ;i++) {
			renglon1[i] = renglon1[i]/pivoteRenglo1;
			System.out.print(renglon1[i] + " ");
		}
		System.out.println("");
		pivoteRenglo2 = renglon2[1];
		for(int i = 0; i < renglon2.length ;i++) {
			renglon2[i] = renglon2[i]/pivoteRenglo2;
			System.out.print(renglon2[i] + " ");
		}
		System.out.println("");
		pivoteRenglo3 = renglon3[2];
		for(int i = 0; i < renglon3.length ;i++) {
			renglon3[i] = renglon3[i]/pivoteRenglo3;
			System.out.print(renglon3[i] + " ");
		}
		//tercera matriz
		System.out.println("");
		System.out.println("Tercera");
		pivoteRenglo1 = renglon1[0];
		for(int i = 0; i < renglon1.length ;i++) {
			renglon1[i] = renglon1[i]/pivoteRenglo1;
			System.out.print(renglon1[i] + " ");
		}
		System.out.println("");
		pivoteRenglo2 = renglon2[2];
		for(int i = 0; i < renglon2.length ;i++) {
			renglon2[2] = renglon2[i]/pivoteRenglo2;
			System.out.print(renglon2[i] + " ");
		}
		System.out.println("");
		pivoteRenglo3 = renglon3[3];
		for(int i = 0; i < renglon3.length ;i++) {
			renglon3[3] = renglon3[i]/pivoteRenglo3;
			System.out.print(renglon3[i] + " ");
		}
	
	}
	
}
