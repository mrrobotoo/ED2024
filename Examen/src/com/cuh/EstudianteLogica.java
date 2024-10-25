package com.cuh;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteLogica {

	public static void main(String[] args) {
		
		ArrayList<Estudiante>listaEstudiantes = new ArrayList<Estudiante>();
		ArrayList<Double> calificacionesEstudiante1 = new ArrayList<Double>();
		calificacionesEstudiante1.add(9.5);
		calificacionesEstudiante1.add(6.0);
		calificacionesEstudiante1.add(8.5);
		Estudiante estudiante1 = new Estudiante("Mariana", calificacionesEstudiante1);
		ArrayList<Double> calificacionesEstudiante2 = new ArrayList<Double>();
		calificacionesEstudiante2.add(6.5);
		calificacionesEstudiante2.add(8.0);
		calificacionesEstudiante2.add(9.0);
		Estudiante estudiante2 = new Estudiante("Ximena", calificacionesEstudiante2);
		ArrayList<Double> calificacionesEstudiante3 = new ArrayList<Double>();
		calificacionesEstudiante3.add(7.5);
		calificacionesEstudiante3.add(6.0);
		calificacionesEstudiante3.add(8.5);
		Estudiante estudiante3 = new Estudiante("Regina", calificacionesEstudiante3);
		ArrayList<Double> calificacionesEstudiante4 = new ArrayList<Double>();
		calificacionesEstudiante4.add(8.5);
		calificacionesEstudiante4.add(5.0);
		calificacionesEstudiante4.add(5.5);
		Estudiante estudiante4 = new Estudiante("Camila", calificacionesEstudiante4);
		ArrayList<Double> calificacionesEstudiante5 = new ArrayList<Double>();
		calificacionesEstudiante5.add(9.5);
		calificacionesEstudiante5.add(9.0);
		calificacionesEstudiante5.add(10.0);
		Estudiante estudiante5 = new Estudiante("Anna", calificacionesEstudiante5);
		
		listaEstudiantes.add(estudiante1);
		listaEstudiantes.add(estudiante2);
		listaEstudiantes.add(estudiante3);
		listaEstudiantes.add(estudiante4);
		listaEstudiantes.add(estudiante5);
		System.out.println("listaEstudiante:");
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			System.out.println("Nombre: " + listaEstudiantes.get(i).getNombre() + " Promedio: " + listaEstudiantes.get(i).getPromedio());
			
		}
		//se recorre la lista de estudiantes para obtener al estudiante con el promedio mas alto
		Estudiante estudianteMasAlto = listaEstudiantes.get(0);
		for (int i = 1; i < listaEstudiantes.size(); i++) {
			
			//se comparan los promedios de estudiante por la posicion i es mayor que el estudiante promedio mas alto 
			if(listaEstudiantes.get(i).getPromedio() >estudianteMasAlto.getPromedio()) {
				estudianteMasAlto = listaEstudiantes.get(i);
			}
		}
		
		System.out.println("Estudiante con el promedio mas alto: " + estudianteMasAlto.getNombre() + " (" + estudianteMasAlto.getPromedio()+ ")");
		
		//se recorre la lista de estudiantes para obtener al estudiante con el promedio mas bajo
		Estudiante estudianteMasBajo = listaEstudiantes.get(0);
		for (int i = 1; i < listaEstudiantes.size(); i++) {
			if(listaEstudiantes.get(i).getPromedio() <estudianteMasBajo.getPromedio()) {
				estudianteMasBajo = listaEstudiantes.get(i);
			}
		}
		
		System.out.println("Estudiante con el promedio mas bajo: " + estudianteMasBajo.getNombre() + " (" + estudianteMasBajo.getPromedio()+ ")");
		
		//los promedios sacados son mayor a 8.5 se guardan en la lista de promedio mayor
		ArrayList<Estudiante> listaPromedioMayor = new ArrayList<Estudiante>();
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			if (listaEstudiantes.get(i).getPromedio() >=8.5 ) {
				listaPromedioMayor.add(listaEstudiantes.get(i));
				
			}
			
		}
		System.out.println("Estudiantes con promedio mayor o igual a 8.5");
		for (int i = 0; i < listaPromedioMayor.size(); i++) {
			System.out.println(listaPromedioMayor.get(i).getNombre());
		}
		
		Scanner scanner = new Scanner(System.in);
		String nombreEstudiante;
		boolean existeEstudiante= false;
		System.out.println("Ingrese el nombre de un estudiante para ver sus calificaciones: ");
		nombreEstudiante= scanner.nextLine();
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			
			//compara el nombre ingresado con la lista de estudiantes 
			if (nombreEstudiante.equals(listaEstudiantes.get(i).getNombre())) {
				System.out.println("Calificaciones de " + listaEstudiantes.get(i).getNombre() + ": " + listaEstudiantes.get(i).getCalificaciones());
				existeEstudiante=true;
				
				break;
			}
			
			
		}
		if (!existeEstudiante) {
			System.out.println("No existe el estudiante perro");
		}
	}
	
	
}
