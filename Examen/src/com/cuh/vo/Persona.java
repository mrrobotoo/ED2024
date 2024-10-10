package com.cuh.vo;

public class Persona {
	int tiempo;
	int personas;
	public int getPersonas() {
		return personas;
	}
	public void setPersonas(int personas) {
		this.personas = personas;
	}
	int gramos;
	String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona (int tiempo, int gramos) {
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public int getGramos() {
		return gramos;
	}
	public void setGramos(int gramos) {
		this.gramos = gramos;
	
	
	}

}
