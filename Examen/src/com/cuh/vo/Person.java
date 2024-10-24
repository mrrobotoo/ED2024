package com.cuh.vo;

public class Person {
	private String nombre;
	private Integer[] cuentas;
	
	public Person() {
		
	}
	
	public Person(String nombre, Integer[] cuentas) {
		super();
		this.nombre = nombre;
		this.cuentas = cuentas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(Integer[] cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
