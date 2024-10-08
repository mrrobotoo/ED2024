package com.cuh;
import java.util.Scanner;
import java.util.Stack;
public class Tortilleria {

	public static void main(String[] args) {
		
     Scanner scanner = new Scanner(System.in);
     int cantidadPersonas;
     double kilosIngresados;
     int tiempoIngresado;
     Stack<Persona> pilaPersonas = new Stack<Persona>();   //ndica que la pila esta diseñada para almacenar objetos de tipo Persona    
     Persona persona;  
    
     
     System.out.print("¿Cuántas personas deseas ingresar?");
     cantidadPersonas = scanner.nextInt();		       
for (int i = 0; i < cantidadPersonas; i++) {

System.out.println("Persona " + (i + 1));

		           
System.out.print("Ingresa el tiempo en minutos");
 tiempoIngresado = scanner.nextInt();

System.out.print("Ingresa los gramos");
	kilosIngresados = scanner.nextDouble();
	            
persona = new Persona(tiempoIngresado, kilosIngresados);
     pilaPersonas.push(persona);
		        }
		       
System.out.println("Fila");
while (!pilaPersonas.isEmpty()) {
    persona = pilaPersonas.pop(); // Desapilar y mostrar la información
    persona.Personas();
}

		        scanner.close();
		    }
		
	}


