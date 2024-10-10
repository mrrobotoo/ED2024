package com.cuh;
import java.util.Stack;

//objeto con dos atributos
class Pedido {
public int kilogramos;
public int tiempo;


public Pedido(int kilogramos, int tiempo) {
   this.kilogramos = kilogramos;
   this.tiempo = tiempo;
}
}

public class Tortilleria {

public static void main(String[] args) {
   Stack<Pedido> pilaPedidos = new Stack<>();
   Stack<Pedido> pilaMenorTiempo = new Stack<>();
   Stack<Pedido> pilaMayorTiempo = new Stack<>();

   
   pilaPedidos.push(new Pedido(2, 6));   
   pilaPedidos.push(new Pedido(3, 8));   
   pilaPedidos.push(new Pedido(5, 10));  
   pilaPedidos.push(new Pedido(7, 12));  
   pilaPedidos.push(new Pedido(10, 14)); 
   pilaPedidos.push(new Pedido(12, 16)); 
   pilaPedidos.push(new Pedido(15, 18)); 
   pilaPedidos.push(new Pedido(1, 5));   
   pilaPedidos.push(new Pedido(6, 11));  
   pilaPedidos.push(new Pedido(8, 13));  

   
   while (!pilaPedidos.isEmpty()) {
       Pedido pedido = pilaPedidos.pop();

       if (pedido.tiempo > 12) {
           pilaMayorTiempo.push(pedido); // mas de 12 min
       } else {
           pilaMenorTiempo.push(pedido); //menos de 12 min
       }
   }

   // menos tiempo
   System.out.println("Pedidos de menor tiempo (12 minutos o menos):");
   while (!pilaMenorTiempo.isEmpty()) {
       Pedido pedido = pilaMenorTiempo.pop();
       System.out.println("Kilogramos: " + pedido.kilogramos + ", Tiempo: " + pedido.tiempo + " minutos");
   }

   // mas tiempo
   System.out.println("\nPedidos de mayor tiempo (más de 12 minutos):");
   while (!pilaMayorTiempo.isEmpty()) {
       Pedido pedido = pilaMayorTiempo.pop();
       System.out.println("Kilogramos: " + pedido.kilogramos + ", Tiempo: " + pedido.tiempo + " minutos");
   }
}
}


