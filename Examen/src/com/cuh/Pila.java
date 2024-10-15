package com.cuh;
import java.util.Stack;

public class Pila {
	static Stack<String> navHistorial = new Stack<String>();
	static Stack<String> navHistorialFuturo = new Stack<String>();
	
	
	private static void paTras() {
		if(!navHistorial.isEmpty()) {
			navHistorialFuturo.push(navHistorial.pop());
			System.out.println("Estas regresando a "
			+ navHistorial.peek());	
		}else {
			System.out.println("No hay paginas para irte pa tras");
		}
		
	}
	private static void paDelante() {
		if(!navHistorialFuturo.isEmpty()) {
			navHistorial.push(navHistorialFuturo.pop());
			System.out.println("Estas avanzando a "
					+ navHistorial.peek());
			
		}else {
			System.out.println("No hay paginas para irte pa delante");
		}
	}
	
	private static void navegar() {
		navHistorial.push("pagina1");
		navHistorial.push("pagina2");
		navHistorial.push("pagina3");
		
		navHistorialFuturo.clear();
		navHistorial.push("pagina4");
		System.out.println("Estas navegando en "
				+ navHistorial.peek());
	}
	
	public static void main(String[] args) {

		//operacion para meter paginas
		navegar();

		//pa tras pagina2
		paTras();
	
		
		//pa tras pagina1
		paTras();
		
		
		
		//pagina siguiente   pagina2
		
		paDelante();
		
		//Mi primer commit
		
		/*navHistorialFuturo.clear();
		navHistorial.push("pagina4");
		System.out.println("Estas navegando en "
				+ navHistorial.peek());*/
		
	}

}
