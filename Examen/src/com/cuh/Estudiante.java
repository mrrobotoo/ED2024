package com.cuh;

import java.util.ArrayList;

public class Estudiante {


	private String nombre;
	private ArrayList<Double> calificaciones;
	private double promedio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Double> getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(ArrayList<Double> calificaciones) {
		this.calificaciones = calificaciones;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public Estudiante(String nombre, ArrayList<Double> calificaciones) {
		super();
		this.nombre = nombre;
		this.calificaciones = calificaciones;
		calcularPromedio();
	}
	//se crea metodo para calcular el promedio al momento de crear un objeto	
	private void calcularPromedio() {
		double sumatoria=0;
		for (int i = 0; i < calificaciones.size() ; i++) {
			sumatoria= sumatoria+calificaciones.get(i);
			
		}
		this.promedio= sumatoria/calificaciones.size();
		
	}
	
	
}
