package com.cuh;

public class Arreglo {
	public static void main(String[] args) {
		Double renglon[][] = new Double[4][4];
		int p1 = 0;
		int p2 = 0;
		double pivote;
		int entradaDivision = 1;
		
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
		
		
		for(int i = 0; i < renglon.length-1 ;i++) {
			pivote = renglon [p1][p2];
			for(int j = 0; j < renglon.length; j++) {
				if(i < entradaDivision) {
					renglon[i][j] /= pivote;
					System.out.print(renglon[i][j] + " ");
				} else {
					renglon[i][j] -= pivote * renglon[i-p1][j];
					System.out.print(renglon[i][j] + " ");
				}
			}
			p1++;
			if(p1 == 3) {
				p2++;
				p1 = 0;
			}
			System.out.println();
		}
		
	}
	
}
