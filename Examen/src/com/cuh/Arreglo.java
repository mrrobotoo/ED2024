package com.cuh;

public class Arreglo {


			public static void main(String[] args) {
				float[] primerRenglon	= {5, 2, 1, 20};
				float[] segundoRenglon	= {2, 1, 2, 10};
				float[] tercerRenglon	= {4, 1, 3, 17};
				
				float pivotito = primerRenglon[0];
				
				for (int i = 0; i < primerRenglon.length; i++) {
					primerRenglon[i] = primerRenglon[i]/pivotito;
					System.out.print(primerRenglon[i] + " ");
				}
				
				System.out.println();
				System.out.println();
				
				pivotito = segundoRenglon[0];
				
				for (int i = 0; i < segundoRenglon.length; i++) {
				
					segundoRenglon[i] = segundoRenglon[i] - (pivotito*primerRenglon[i]);
					
					System.out.print(segundoRenglon[i] + " ");
				}
				
				System.out.println();
				System.out.println();
				
				pivotito = tercerRenglon[0];
				
				for (int i = 0; i < tercerRenglon.length; i++) {
				
					tercerRenglon[i] = tercerRenglon[i] - (pivotito*primerRenglon[i]);
					
					System.out.print(tercerRenglon[i] + " ");
				}
				
				System.out.println();
				System.out.println();
				System.out.println("Segunda matriz");
				System.out.println();
				System.out.println();
				
				for (int i = 0; i < primerRenglon.length; i++) {
					System.out.print(primerRenglon[i] + " ");
				}
				
				System.out.println();
				System.out.println();
				
				pivotito = segundoRenglon[1];
				
				
				for (int i = 0; i < segundoRenglon.length; i++) {
					
					if (i==0) {
						System.out.print(segundoRenglon[i] + " ");
					} else {
						segundoRenglon[i] = segundoRenglon[i]/pivotito;
						
						System.out.print(segundoRenglon[i] + " ");
					}
					
				}
				
				System.out.println();
				System.out.println();
				
				pivotito = tercerRenglon[1];
				
				for (int i = 0; i < tercerRenglon.length; i++) {
					
					if (i!=0) {
						tercerRenglon[i] = tercerRenglon[i] - (pivotito*segundoRenglon[i]);
						
					}
					
					
				}
			
				
				pivotito = tercerRenglon[2];
				
				
				for (int i = 0; i < tercerRenglon.length; i++) {
					
					if (i<2) {
						System.out.print(tercerRenglon[i] + " ");
					} else {
						tercerRenglon[i] = tercerRenglon[i]/pivotito;
						
						System.out.print(tercerRenglon[i] + " ");
					}
					
				}
				
			}

		}



