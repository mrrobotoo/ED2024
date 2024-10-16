package com.cuh;

public class Arreglo {
	    public static void main(String[] args) {
	        Double[] renglon1 = {3.0,2.0,1.0,1.0};
	        Double[] renglon2 = {5.0,3.0,4.0,2.0};
	        Double[] renglon3 = {1.0,1.0,-1.0,1.0};
	        
	        renglon1[0] = 3.0;
	        renglon1[1] = 2.0;
	        renglon1[2] = 1.0;
	        renglon1[3] = 1.0;
	        
	        renglon2[0] = 5.0;
	        renglon2[1] = 3.0;
	        renglon2[2] = 4.0;
	        renglon2[3] = 2.0;
	        
	        renglon3[0] = 1.0;
	        renglon3[1] = 1.0;
	        renglon3[2] = -1.0;
	        renglon3[3] = 1.0;

	        Double[][] renglonLoco = {renglon1, renglon2, renglon3};
	        
	        
	        
	        //paso 1
	        Double pivoteRenglon1 = renglon1[0];
	        for(int i = 0; i < renglon1.length; i++) {
	            renglon1[i] /= pivoteRenglon1;
	        }

	        // paso2
	        Double factorRenglon2 = renglon2[0];
	        for(int i = 0; i < renglon2.length; i++) {
	            renglon2[i] -= factorRenglon2 * renglon1[i];
	        }

	        Double factorRenglon3 = renglon3[0];
	        for(int i = 0; i < renglon3.length; i++) {
	            renglon3[i] -= factorRenglon3 * renglon1[i];
	        }

	        // paso 3: 
	        Double pivoteRenglon2 = renglon2[1];
	        for(int i = 1; i < renglon2.length; i++) {
	            renglon2[i] /= pivoteRenglon2;
	        }
	        // Hacer ceros  columna 1 para el renglón 1 y 3
	        Double factorRenglon1B = renglon1[1];
	        for (int i = 1; i < renglon1.length; i++) {
	            renglon1[i] -= factorRenglon1B * renglon2[i];
	        }
	        Double factorRenglon3B = renglon3[1];
	        for (int i = 1; i < renglon3.length; i++) {
	            renglon3[i] -= factorRenglon3B * renglon2[i];
	        }
	        Double pivoteRenglon3 = renglon3[2];
	        renglon3[2] /= pivoteRenglon3;
	        renglon3[3] /= pivoteRenglon3;
	        // Hacer ceros  columna 2 para el renglón 1 y 2
	        Double factorRenglon1C = renglon1[2];
	        renglon1[2] -= factorRenglon1C * renglon3[2];
	        renglon1[3] -= factorRenglon1C * renglon3[3];
	        Double factorRenglon2C = renglon2[2];
	        renglon2[2] -= factorRenglon2C * renglon3[2];
	        renglon2[3] -= factorRenglon2C * renglon3[3];
	        System.out.println("Matriz final:");
	        imprimirRenglon(renglon1);
	        imprimirRenglon(renglon2);
	        imprimirRenglon(renglon3);
	    }

	    public static void imprimirRenglon(Double[] renglon) {
	        for(Double valor : renglon) {
	            System.out.printf("%8.2f", valor);
	        }
	        System.out.println();
	    }
	}