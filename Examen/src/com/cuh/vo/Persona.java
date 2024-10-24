package com.cuh.vo;

public class Persona {
	private String tiempo;
	private String gramos;
	
	public Persona() {
		super();
	}
	
	public Persona(String tiempo) {
		super();
		this.tiempo = tiempo;
	}
	
	public Persona(String tiempo, String gramos) {
		super();
		this.tiempo = tiempo;
		this.gramos = gramos;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String cola) {
		this.tiempo = cola;
	}
	public String getGramos() {
		return gramos;
	}
	public void setGramos(String gramos) {
		this.gramos = gramos;
	}
	
	
}
