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
		float pivoteRenglon1 = renglon1[0];
		float pivoteRenglon2 = renglon2[0];
		float pivoteRenglon3 = renglon3[0];

		//String renglon1bonito;
		//Divide todo el primer renglón entre la componente a11 para poder sacar 
		for(int i = 0; i < renglon1.length ;i++) {
			renglon1[i] = renglon1[i]/pivoteRenglon1;
			//renglon1bonito = String.valueOf(renglon1[i]) ;
			System.out.print(renglon1[i] + "   ");
		}
		
		System.out.println("");
		for(int i = 0; i < renglon2.length ;i++) {
			renglon2[i]= - pivoteRenglon2*renglon1[i] ;
			System.out.print(renglon2[i] + "   ");
		}
		System.out.println("");

		// renglon3 - n*reglon1
        for (int j = 0; j < renglon3.length; j++) {
            renglon3[j] = renglon3[j] - pivoteRenglon3*renglon1[j];
            System.out.print(renglon3[j] + "   ");
        }

        System.out.println("");
        System.out.println("resultados de matriz");
        
//jalamos el renglon uno, para iniciar otra nmatriz
        for (int k = 0; k < renglon2.length; k++) {
           // renglon2[k] = renglon2[k] / pivoteRenglon3;
             System.out.print(renglon1[k] + "   ");
        }
        System.out.println(" ");
//otro forcito para el pivote de la segunda m// pivoteRenglon3=renglon3[2];
        for(int l= 0; l <renglon2.length; l++) {
        	renglon2[l]= renglon2[l]/pivoteRenglon2;
         System.out.print(renglon2[l] + "  ");   
}
        
        System.out.println("");
		for(int m = 0; m < renglon2.length ;m++) {
			renglon3[m]=  renglon3[m]-pivoteRenglon3*renglon2[m] ;
			System.out.print(renglon3[m] + "   ");
		}
		
	       System.out.println(" ");
		System.out.println("Inicia la matriz 3");
		//jalamos el renglon uno de la segunda matriz, para iniciar otra nmatriz
		        for (int n = 0; n < renglon3.length; n++) {
		           renglon3[n] = renglon3[n] / pivoteRenglon3;
		             System.out.print(renglon3[n] + "   ");
		        }
		        System.out.println(" ");
		        
		        for(int ñ= 0; ñ <renglon2.length; ñ++) {
		        	renglon2[ñ]= renglon2[ñ]-pivoteRenglon2*renglon3[ñ];
		         System.out.print(renglon2[ñ] + "  ");   
		}
		        
		        System.out.println("");
				for(int m = 0; m < renglon2.length ;m++) {
					renglon1[m]=  renglon1[m]-pivoteRenglon1*renglon3[m] ;
					System.out.print(renglon1[m] + "   ");
				}
		
		
	}
	}
