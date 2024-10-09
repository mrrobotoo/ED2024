package com.cuh.vo;

public class Persona {
	int tiempo;
	float gramos;
	int cuantasPersonas;
	String nombre;
	float horaDeLlegada;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getHoraDeLlegada() {
		return horaDeLlegada;
	}

	public void setHoraDeLlegada(float horaDeLlegada) {
		this.horaDeLlegada = horaDeLlegada;
	}

	public Persona (int tiempo, float gramos, int cuantasPersonas, String nombre, float horaDeLlegada) {
		this.tiempo = tiempo;
		this.gramos = gramos;
		this.cuantasPersonas = cuantasPersonas;
		this.nombre = nombre;
		this.horaDeLlegada = horaDeLlegada;
	}

	public Persona(String nombre2) {
		// TODO Auto-generated constructor stub
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public float getGramos() {
		return gramos;
	}

	public void setGramos(float gramos) {
		this.gramos = gramos;
	}

	public int getCuantasPersonas() {
		return cuantasPersonas;
	}

	public void setCuantasPersonas(int cuantasPersonas) {
		this.cuantasPersonas = cuantasPersonas;
	}

	public void push(Persona todasLasPersonas) {
		// TODO Auto-generated method stub
		
	}

}
