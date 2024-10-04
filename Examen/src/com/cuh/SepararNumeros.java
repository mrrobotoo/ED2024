package com.cuh;

import java.util.Stack;

public class SepararNumeros {
    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<Integer>();

        numeros.push(21);
        numeros.push(18);
        numeros.push(13);
        numeros.push(11);
        numeros.push(8);
        numeros.push(6);
        numeros.push(3);
        numeros.push(2);

        numeros = separarParImpar(numeros);

        System.out.println(numeros);
    }

    private static Stack<Integer> separarParImpar(Stack<Integer> numeros) {
    	 Stack<Integer> noPares = new Stack<Integer>();
         Stack<Integer> pares = new Stack<Integer>();

        while (!numeros.isEmpty()) {
            int num = numeros.pop();
            if (num % 2 == 0) {
                pares.push(num);
            } else {
                noPares.push(num);
            }
        }

        for (int par : pares) {
            numeros.push(par);
        }

        for (int impar : noPares) {
            numeros.push(impar);
        }

        return numeros;
    }
}
