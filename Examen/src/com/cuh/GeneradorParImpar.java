package com.cuh;

import java.util.Stack;

public class GeneradorParImpar {

    public static Stack<Integer> separarParImpar(Stack<Integer> pila) {
        Stack<Integer> pilaPares = new Stack<>();
        Stack<Integer> pilaImpares = new Stack<>();
        Stack<Integer> pilaFinal = new Stack<>();

       
        while (!pila.isEmpty()) {
            int numero = pila.pop(); 

            if (numero % 2 == 0) { 
                pilaPares.push(numero);  
            } else {
                pilaImpares.push(numero); 
            }
        }

        
        while (!pilaPares.isEmpty()) {
            pilaFinal.push(pilaPares.pop());
        }

        
        while (!pilaImpares.isEmpty()) {
            pilaFinal.push(pilaImpares.pop());
        }

        return pilaFinal; 
    }

    public static void main(String[] args) {
       
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(6);
        pila.push(8);
        pila.push(11);
        pila.push(13);
        pila.push(18);
        pila.push(21);

        System.out.println("Pila original: ");
        imprimirPila(pila);

        Stack<Integer> pilaSeparada = separarParImpar(pila);

        System.out.println("\nPila separada (pares abajo, impares arriba): ");
        imprimirPila(pilaSeparada);
    }

    
    public static void imprimirPila(Stack<Integer> pila) {
        Stack<Integer> temp = new Stack<>();

        
        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            System.out.println(elemento); 
            temp.push(elemento); 
        }

        
        while (!temp.isEmpty()) {
            pila.push(temp.pop());
        }
    }
}
