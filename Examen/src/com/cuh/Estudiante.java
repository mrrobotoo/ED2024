package com.cuh;
import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;



public class Estudiante {

	public static void main(String[] args) {
		 
		List<datosEstudiantes> Alumnos = new ArrayList<>();
		List<String> estudiantesConPromedioAlto = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		String nombreConPromedioMasAlto = "";
		double promedioMasAlto = 0.0;
		double promedioMasBajo = 11.0;
		String nombreConPromedioMasBajo = "";
		
		
		 datosEstudiantes alumno1 = new datosEstudiantes();
		 alumno1.setNombreAlumno("Santiago");
		 alumno1.setCalificaciones(new Double[] {10.0,10.0,10.0});
		 
		 datosEstudiantes alumno2 = new datosEstudiantes();
		 alumno2.setNombreAlumno("Linette");
		 alumno2.setCalificaciones(new Double[] {10.10,10.0,6.0});
		 
		 datosEstudiantes alumno3 = new datosEstudiantes();
		 alumno3.setNombreAlumno("jonathan");
		 alumno3.setCalificaciones(new Double[] {6.0,6.0,7.0});
		 
		 datosEstudiantes alumno4 = new datosEstudiantes();
		 alumno4.setNombreAlumno("Evelyn");
		 alumno4.setCalificaciones(new Double[] {8.1,9.0,8.0});
		 
		 datosEstudiantes alumno5 = new datosEstudiantes();
		 alumno5.setNombreAlumno("Pablo");
		 alumno5.setCalificaciones(new Double[] {10.0,0.0,10.0});
		
		 Alumnos.add(alumno1);
		 Alumnos.add(alumno2);
		 Alumnos.add(alumno3);
		 Alumnos.add(alumno4);
		 Alumnos.add(alumno5);
		
		 for (datosEstudiantes datosEstudiantes : Alumnos) {
	            System.out.println("Nombre: " + datosEstudiantes.getNombreAlumno());
	            for (Double calificacion : datosEstudiantes.getCalificaciones()) {
	            	 //System.out.println("calificaciones "+calificacion);
	          }
	    double promedio = datosEstudiantes.calcularPromedio();
	    System.out.println("promedio "+promedio);

	            
	    if (promedio > promedioMasAlto) {
	    promedioMasAlto = promedio; 
	    nombreConPromedioMasAlto = datosEstudiantes.getNombreAlumno(); 
	            }
	    if (promedio < promedioMasBajo) {
		    promedioMasBajo = promedio; 
		    nombreConPromedioMasBajo = datosEstudiantes.getNombreAlumno(); 
		    }
	    if (promedio >= 8.5) {
            estudiantesConPromedioAlto.add(datosEstudiantes.getNombreAlumno());
        }
	   
	    
	        }
	        System.out.println("El promedio mas alto es de " + nombreConPromedioMasAlto + ": " + promedioMasAlto);
	        System.out.println("El promedio mas bajo es de " + nombreConPromedioMasBajo + ": " + promedioMasBajo);
	        System.out.println("estudiantes con mayor o igual a 8.5 " + estudiantesConPromedioAlto);
	        
	        System.out.println(" ");
	        
	        System.out.print("Ingresa el nombre del estudiante para ver sus calificaciones ");
	    
	        String nombreBusqueda = scanner.nextLine();
	        for (datosEstudiantes datosEstudiantes2 : Alumnos)
	        	if (datosEstudiantes2.getNombreAlumno().equals(nombreBusqueda)) {
	        for (Double calificacion : datosEstudiantes2.getCalificaciones()) {
	        System.out.println("Calificaciones"+ calificacion);
	                }
	               
	            }
	
	
	
	        }
	}


	
	


