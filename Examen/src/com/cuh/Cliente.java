package com.cuh;

import java.util.Stack;
import java.util.Scanner;

public class Cliente {
	
	
	 float horaLlegada;
	 double gramos;
	 int turno;
	
	 public Cliente (float horaLlegada, double gramos, int turno) {
		 this.horaLlegada = horaLlegada;
		 this.gramos = gramos;
		 this.turno = turno;
	 }
	
	public float getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(float horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public double getGramos() {
		return gramos;
	}
	public void setGramos(double gramos) {
		this.gramos = gramos;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
			
	}
	
	public void mostrarDatos() {
		System.out.println("Hora de llegada: " + getHoraLlegada());
		System.out.println("Cantidad de tortillas en gramos: " + getGramos());
		System.out.println("Tu turno es: " + getTurno());
	}
	public static void main(String[] args) {
		
		
		Stack<Cliente> pilaClientes = new Stack<>();
		
		Scanner scanner = new Scanner(System.in);
		
		int cantidadClientes = 0;
		for (int i = 0; i < cantidadClientes; i++) {
			System.out.println("Cliente " + (i + 1) + ":");
			
			System.out.println("Registre su hora de llegada: ");
			float horaLlegada = scanner.nextFloat();
			
			System.out.println("Cantidad de tortillas que necesita: ");
			double gramos = scanner.nextDouble();
			
			System.out.println("Tu turno es: ");
			int turno = scanner.nextInt();
			
			Cliente cliente = new Cliente(horaLlegada, gramos, turno);
			pilaClientes.push(cliente);
			
		}
		
		while (!pilaClientes.isEmpty()) {
			Cliente cliente = pilaClientes.pop();
			cliente.mostrarDatos();
			System.out.println();
		}
		scanner.close();
	}
	}

