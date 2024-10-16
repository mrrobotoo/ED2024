package com.cuh;

import java.util.Iterator;

public class Arreglo {
	    public static void main(String[] args) {
	        Double[] renglon1 = {5.0,2.0,1.0,20.0};
	        Double[] renglon2 = {2.0,1.0,2.0,10.0};
	        Double[] renglon3 = {4.0,1.0,3.0,17.0};
	
	        Double[][] renglonLoco = {renglon1, renglon2, renglon3};
	        
	        Double pivote;
	        
	        
	        for (int i = 0; i < renglonLoco.length; i++) {
	            pivote = renglonLoco[i][i];

	            for (int j = 0; j < renglonLoco[i].length; j++) {
	                renglonLoco[i][j] /= pivote;
	            }

	            for (int k = 0; k < renglonLoco.length; k++) {
	                if (k != i) {
	                    Double factor = renglonLoco[k][i];
	                    for (int j = 0; j < renglonLoco[i].length; j++) {
	                        renglonLoco[k][j] -= factor * renglonLoco[i][j];
	                    }
	                }
	            }
	        }
	        
	        imprimirRenglon(renglonLoco);
	        
	        
	    }

	    public static void imprimirRenglon(Double[][] renglon) {
	        
	    	
	    	for(Double[] fila : renglon) {
	    		for(Double valor : fila) {
		            System.out.printf("%8.2f", valor);
		        }
	    		System.out.println();
	            
	        }
	        
	    }
	}