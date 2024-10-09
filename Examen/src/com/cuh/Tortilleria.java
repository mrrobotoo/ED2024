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
     Stack<Persona> auxPila = new Stack<>();
     Stack<Persona> pilaOrdenada = new Stack<>();
    
     
  System.out.print("¿Cuántas personas deseas ingresar?");
   cantidadPersonas = scanner.nextInt();		       
for (int i = 0; i < cantidadPersonas; i++) {

System.out.println("Persona " + (i + 1));

		           
System.out.print("Ingresa el tiempo en minutos");
 tiempoIngresado = scanner.nextInt();

System.out.print("Ingresa los gramos");
	kilosIngresados = scanner.nextDouble();
	            
Persona persona = new Persona(tiempoIngresado, kilosIngresados);
     pilaPersonas.push(persona);
		        }
		       
while (!pilaPersonas.isEmpty()) {
    Persona actual = pilaPersonas.pop(); //Saco a la persona que esta en el inicio de la pila
    
   while (!pilaOrdenada.isEmpty()) { // Mientras la pilaOrdenada no este vacia 
  Persona personaOrdenada = pilaOrdenada.peek();
        
        // Si la persona actual llego antes o necesita menos gramos se  sale del if
  if (personaOrdenada.getTiempo() > actual.getTiempo() && (personaOrdenada.getTiempo() == actual.getTiempo() && personaOrdenada.getKilos() > actual.getKilos())) {
      break;
    }
    else {
      // Si no, movemos la persona de pilaOrdenada a la pila auxiliar
   auxPila.push(pilaOrdenada.pop());
     }
    }

    
    pilaOrdenada.push(actual);  //Apilamos la persona actual en pilaOrdenada

    
    while (!auxPila.isEmpty()) {  // Devolvemos las personas de auxPila a pilaOrdenada
        pilaOrdenada.push(auxPila.pop());
    }
}


System.out.println("\nPersonas en orden de atención:");
while (!pilaOrdenada.isEmpty()) {
    Persona persona = pilaOrdenada.pop();
    persona.Personas();
}

		        scanner.close();
		    }
		
	}


