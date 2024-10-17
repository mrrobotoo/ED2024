package com.cuh;
public class Arreglo {
	    public static void main(String[] args) {
	        Double renglon1[] = new Double[4];
	        Double renglon2[] = new Double[4];
	        Double renglon3[] = new Double[4];

	        renglon1[0] = 5.0;
	        renglon1[1] = 2.0;
	        renglon1[2] = 1.0;
	        renglon1[3] = 20.0;

	        renglon2[0] = 2.0;
	        renglon2[1] = 1.0;
	        renglon2[2] = 2.0;
	        renglon2[3] = 10.0;

	        renglon3[0] = 1.0;
	        renglon3[1] = 1.0;
	        renglon3[2] = 1.0;
	        renglon3[3] = 7.0;

	        // Normalizar el primer renglón
	        Double pivoteRenglon1 = renglon1[0];
	        for (int i = 0; i < renglon1.length; i++) {
	            renglon1[i] = renglon1[i] / pivoteRenglon1;
	            System.out.print(renglon1[i] + " ");
	        }
	        System.out.println("");

	        // Hacer ceros en la primera columna para el segundo renglón
	        Double pivoteRenglon2 = renglon2[0];
	        for (int i = 0; i < renglon2.length; i++) {
	            renglon2[i] = renglon2[i] - pivoteRenglon2 * renglon1[i];
	            System.out.print(renglon2[i] + " ");
	        }
	        System.out.println("");

	        // Hacer ceros en la primera columna para el tercer renglón
	        Double pivoteRenglon3 = renglon3[0];
	        for (int i = 0; i < renglon3.length; i++) {
	            renglon3[i] = renglon3[i] - pivoteRenglon3 * renglon1[i];
	            System.out.print(renglon3[i] + " ");
	        }
	        System.out.println("");

	        // Normalizar el segundo renglón
	        pivoteRenglon2 = renglon2[1];
	        for (int i = 0; i < renglon2.length; i++) {
	            renglon2[i] = renglon2[i] / pivoteRenglon2;
	            System.out.print(renglon2[i] + " ");
	        }
	        System.out.println("");

	        // Hacer ceros en la segunda columna para el primer renglón
	        for (int i = 0; i < renglon1.length; i++) {
	            renglon1[i] = renglon1[i] - renglon1[1] * renglon2[i];
	            System.out.print(renglon1[i] + " ");
	        }
	        System.out.println("");

	        // Hacer ceros en la segunda columna para el tercer renglón
	        for (int i = 0; i < renglon3.length; i++) {
	            renglon3[i] = renglon3[i] - renglon3[1] * renglon2[i];
	            System.out.print(renglon3[i] + " ");
	        }
	        System.out.println("");

	        // Normalizar el tercer renglón
	        pivoteRenglon3 = renglon3[2];
	        for (int i = 0; i < renglon3.length; i++) {
	            renglon3[i] = renglon3[i] / pivoteRenglon3;
	            System.out.print(renglon3[i] + " ");
	        }
	        System.out.println("");

	        // Hacer ceros en la tercera columna para el primer renglón
	        for (int i = 0; i < renglon1.length; i++) {
	            renglon1[i] = renglon1[i] - renglon1[2] * renglon3[i];
	            System.out.print(renglon1[i] + " ");
	        }
	        System.out.println("");

	        // Hacer ceros en la tercera columna para el segundo renglón
	        for (int i = 0; i < renglon2.length; i++) {
	            renglon2[i] = renglon2[i] - renglon2[2] * renglon3[i];
	            System.out.print(renglon2[i] + " ");
	        }
	        System.out.println("");
	    }
	}

  