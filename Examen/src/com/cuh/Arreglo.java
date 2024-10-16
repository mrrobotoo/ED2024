package com.cuh;

public class Arreglo {
	public static void main(String[] args) {
		float renglon1[] = new float[4];
		float renglon2[] = new float[4];
		float renglon3[] = new float[4];

		
		renglon1[0]=5;
		renglon1[1]=2;
		renglon1[2]=1;
		renglon1[3]=20;
		
		renglon2[0]=2;
		renglon2[1]=1;
		renglon2[2]=2;
		renglon2[3]=10;
		
		renglon3[0]=4;
		renglon3[1]=1;
		renglon3[2]=3;
		renglon3[3]=17;

		
		//renglon2 - n*reglon1
		float pivoteRenglo1 = renglon1[0];
		float pivoteRenglo2 = renglon2[0];
		float pivoteRenglo3 = renglon3[0];

		//String renglon1bonito;
		//Divide todo el primer renglón entre la componente a11 para poder sacar 
		for(int i = 0; i < renglon1.length ;i++) {
			renglon1[i] = renglon1[i]/pivoteRenglo1;
			//renglon1bonito = String.valueOf(renglon1[i]) ;
			System.out.print(renglon1[i] + "   ");
		}
		
		System.out.println("");
		for(int i = 0; i < renglon2.length ;i++) {
			renglon2[i] = 
					renglon2[i] - pivoteRenglo2*renglon1[i] ;
			System.out.print(renglon2[i] + "   ");
		}
		//System.out.println("");

		// renglon3 - n*reglon1
        /*for (int i = 0; i < renglon3.length; i++) {
            renglon3[i] = renglon3[i] - renglon3[0] * renglon1[i];
            System.out.print(renglon3[i] + "   ");
        }*/

        System.out.println("");

        // Division del segundo renglon
        pivoteRenglo3 = renglon2[1]; 
        for (int i = 0; i < renglon2.length; i++) {
            renglon2[i] = renglon2[i] / pivoteRenglo3;
            System.out.print(renglon2[i] + "   ");
        }
}
}
