package com.cuh;
import java.util.Stack;

	
	

	public class PilaParEimpar {
		
		double gramos;
		String turno;
		
		public void Tortilla(double gramos, String turno) {
			this.gramos = gramos; 	
			this.turno = turno;
		}

		// Método para encontrar el menor de la pila
		public static Tortilla findMin(Stack<Tortilla> tortilleria) {
			Tortilla minTortilla = tortilleria.peek(); // Asignamos el primer elemento como el menor
			for (Tortilla t : tortilleria) {
				if (t.gramos < minTortilla.gramos) {
					minTortilla = t;
				}
			}
			return minTortilla;
		}

		public static void main(String[] args) {
			Stack<Tortilla> tortilleria = new Stack<>();
			// Objetos "tortilla" agregados a la pila tortilleria
			tortilleria.push(new Tortilla(1400, "11:00 am"));
			tortilleria.push(new Tortilla(8.5, "11:01 am"));
			tortilleria.push(new Tortilla(200, "11:10 am"));
			tortilleria.push(new Tortilla(2.5, "11:05 am"));
			tortilleria.push(new Tortilla(800, "11:00 am"));
			tortilleria.push(new Tortilla(255, "11:20 am"));
			tortilleria.push(new Tortilla(125, "11:21 am"));
			tortilleria.push(new Tortilla(310, "11:22 am"));
			tortilleria.push(new Tortilla(1000, "11:23 am"));
			tortilleria.push(new Tortilla(2.5, "11:25 am"));
			
			Stack<Tortilla> sortedTortilleria = new Stack<>();

			// Ordenar manualmente las tortillas de menor a mayor según los gramos
			while (!tortilleria.isEmpty()) {
				Tortilla min = findMin(tortilleria); // Encontramos la tortilla con menos gramos
				Stack<Tortilla> tempStack = new Stack<>(); // Pila temporal para reconstruir la pila original sin el mínimo

				// Pasamos todos los elementos a la pila temporal, excepto el mínimo
				while (!tortilleria.isEmpty()) {
					Tortilla actual = tortilleria.pop();
					if (actual != min) {
						tempStack.push(actual);
					}
				}

				// Restauramos la pila original, pero sin el mínimo
				while (!tempStack.isEmpty()) {
					tortilleria.push(tempStack.pop());
				}

				// Agregamos el mínimo a la pila ordenada (primero los menores)
				sortedTortilleria.push(min);
			}

			// Mostrar las tortillas ordenadas de menor a mayor según gramos
			while (!sortedTortilleria.isEmpty()) {
				Tortilla actual = sortedTortilleria.pop();
				System.out.println("Prioridad dependiendo gramos: " + actual.gramos + " gramos, " + actual.turno);
			}
		}
	}
