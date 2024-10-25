package com.cuh;

public class datosEstudiantes {
	
	private String nombreAlumno;
	private Double[] calificaciones;


	 public void DatosEstudiantes(String nombreAlumno, Double[] calificaciones) {
	        this.nombreAlumno = nombreAlumno;
	        this.calificaciones = calificaciones;
	    
}


	public String getNombreAlumno() {
		return nombreAlumno;
	}


	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}


	public Double[] getCalificaciones() {
		return calificaciones;
	}


	public void setCalificaciones(Double[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	  public double calcularPromedio() {
	        double suma = 0;
	        for (Double calificacion : calificaciones) {
	            suma += calificacion;
	            
	        }
	        return suma / calificaciones.length;
	    }

	
}