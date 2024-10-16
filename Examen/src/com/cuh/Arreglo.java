package com.cuh;

public class Arreglo {
	public static void main(String[] args) {
		Double renglon[][] = new Double[3][4];
		int p2 = 0;
		double pivoteVertical;
		double pivoteHaciaAbajo;
		int ejeY = 0;
		int ejeX = 0;
		int menos = 1;
		int uno = 1;

		renglon[0][0] = 5.0;
		renglon[0][1] = 2.0;
		renglon[0][2] = 1.0;
		renglon[0][3] = 20.0;

		renglon[1][0] = 2.0;
		renglon[1][1] = 1.0;
		renglon[1][2] = 2.0;
		renglon[1][3] = 10.0;

		renglon[2][0] = 4.0;
		renglon[2][1] = 1.0;
		renglon[2][2] = 3.0;
		renglon[2][3] = 17.0;

		for (int iteracionesEjeY = 0; iteracionesEjeY < renglon.length; iteracionesEjeY++) {

			for (int i = ejeY; i < uno; i++) {
				pivoteVertical = renglon[i][ejeX];
				for (int j = ejeX; j <= renglon.length; j++) {
					renglon[i][j] /= pivoteVertical;
					System.out.print(renglon[i][j] + " ");
				}

			}
			
			uno++;
			ejeY++;
			ejeX++;

			for (int i = ejeY; i < renglon.length; i++) {
				pivoteHaciaAbajo = renglon[i][ejeX-1];
				for (int j = 0; j < renglon.length+1; j++) {
					renglon[i][j] -= pivoteHaciaAbajo * renglon[menos-i][j];
				}
				menos++;
			}

			System.out.println();
		}

	}
		
	}


