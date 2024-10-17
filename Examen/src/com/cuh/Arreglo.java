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
			renglon2[i] = 
					renglon2[i] - pivoteRenglo2*renglon1[i] ;
			System.out.print(renglon2[i] + " ");
		
		}
		System.out.println("");
		for(int i = 0; i < renglon3.length ;i++) {
			renglon3[i] = renglon3[i] - pivoteRenglo3*renglon1[i] ;
			System.out.print(renglon3[i] + " ");
		}
		
	//Matriz 2
	
		
		System.out.print("\n Matriz 2" );
		System.out.print("\n " );
		
		pivoteRenglo2 = renglon2[1];
		if (pivoteRenglo2 !=0) {
		System.out.print("\n ");
		for(int i = 0; i < renglon2.length ;i++) {
			renglon2[i] = renglon2[i]/pivoteRenglo2 ;
			System.out.print(renglon2[i] + " ");
		}
		
		pivoteRenglo1 = renglon1[1];
		System.out.print("\n ");
		for(int i = 0; i < renglon1.length ;i++) {
			renglon1[i] = renglon1[i] - renglon2[i]*renglon1[1] ;
			System.out.print(renglon3[i] + " ");
		}
		
		pivoteRenglo3 = renglon3[1];
		System.out.print("\n ");
		for(int i = 0; i < renglon3.length ;i++) {
			renglon3[i] = renglon3[i] - renglon2[i]*renglon3[1] ;
			System.out.print(renglon3[i] + " ");
		}
		
		//Matriz 3
		System.out.print("\n " );
		System.out.print("\n Matriz 3" );
		System.out.print("\n " );
		
		
		Double ultimoPivoteRenglon3 = renglon3[2];
		if (ultimoPivoteRenglon3 !=0){
			for(int i = 0; i < renglon3.length ;i++) {
				renglon3[i] = renglon3[i] / ultimoPivoteRenglon3 ;
				System.out.print(renglon3[i] + " ");
			}
			
			System.out.print("\n ");
			for(int i = 0; i < renglon1.length ;i++) {
				renglon1[i] = renglon1[i] - renglon3[i]*renglon1[2] ;
				System.out.print(renglon1[i] + " ");
			}
	
			System.out.print("\n ");
			for(int i = 0; i < renglon2.length ;i++) {
				renglon2[i] = renglon2[i] - renglon3[i]*renglon2[2] ;
				System.out.print(renglon2[i] + " ");
			}
			
			
		}
		}
		
		
		
		
		
		
		
	}
		
		
		 }
		 