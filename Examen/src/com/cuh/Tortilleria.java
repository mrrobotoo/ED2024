package com.cuh;
import java.util.Stack;
public class Tortilleria{

	 public static void main(String[] args) {
	  Stack<Persona> pila = new Stack<>();

	     pila.push(new Persona("Cris", "08:00", 50));
	     pila.push(new Persona("Mario", "09:00", 120));
	     pila.push(new Persona("Sebas", "07:30", 80));
         pila.push(new Persona("David", "11:15", 150));
         pila.push(new Persona("Pablo", "10:45", 90));
	     pila.push(new Persona("Santi", "08:30", 200));

	        pilaOrdenada(pila);


	        System.out.println("Ordenes de tortilla:");
	        while (!pila.isEmpty()) {
	            System.out.println(pila.pop());
	        }
	    }

	 public static void pilaOrdenada(Stack<Persona> pila) {
	        Stack<Persona> pilaTemp = new Stack<>();

	        while (!pila.isEmpty()) {
	            Persona actual = pila.pop();

	            while (!pilaTemp.isEmpty()) {
	                Persona top = pilaTemp.peek();
	                if (top.gramosTortilla > actual.gramosTortilla) {
	                    pila.push(pilaTemp.pop());
	                } else if (top.gramosTortilla == actual.gramosTortilla && top.horaLlegada.compareTo(actual.horaLlegada) > 0) {
	                    pila.push(pilaTemp.pop());
	                } else {
	                    break;
	                }
	            }

	            pilaTemp.push(actual);
	        }

	        while (!pilaTemp.isEmpty()) {
	            pila.push(pilaTemp.pop());
	        }
	    }
	}


	class Persona {
	    String nombre;
	    String horaLlegada;
	    int gramosTortilla;

	    public Persona(String nombre, String horaLlegada, int gramosTortilla) {
	        this.nombre = nombre;
	        this.horaLlegada = horaLlegada;
	        this.gramosTortilla = gramosTortilla;
	    }

	    public String toString() {
	        return "Nombre: " + nombre + ", Hora en la que llego: " + horaLlegada + ", Gramos de tortilla: " + gramosTortilla;
	    }
	}
	