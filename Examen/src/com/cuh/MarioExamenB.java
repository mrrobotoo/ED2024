package com.cuh;

public class MarioExamenB {
    public static void main(String[] args) {
        int[] arreglo1 = {8, 1, 4, 5, 9, 2, 6, 3, 7};
        int[] arreglo2 = {8, 1, 5, 5, 7, 2, 6, 3, 7};

        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] == arreglo2[i]) {
                int temporal = arreglo2[i];
                arreglo2[i] = arreglo2[(i + 1) % arreglo2.length];
                arreglo2[(i + 1) % arreglo2.length] = temporal;
            }
        }
        
        System.out.println("primer areglo:");
        imprimirArreglo(arreglo1);
        System.out.println("segumdo arreglo:");
        imprimirArreglo(arreglo2);
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i);
        }
    }
}

    
	
        
 