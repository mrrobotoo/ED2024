package com.cuh;
import java.util.Stack;

public class Persona {

	public class Tortilleria {
	    // Pilas para almacenar los gramos y los turnos
	    private Stack<Integer> pilaGramos;
	    private Stack<Integer> pilaTurnos;

	    // Constructor
	    public Tortilleria() {
	        pilaGramos = new Stack<>();
	        pilaTurnos = new Stack<>();
	    }
	}

	
	public static void main(String[] args) {
    Stack<Double>masGramos = new Stack<Double>();
    masGramos.push(5.5);
    masGramos.push(7.23);
    masGramos.push(8.5);
    masGramos.push(4.5);
    masGramos.push(10.5);
    
    
    Stack<Double>menosGramos = new Stack<Double>();
    menosGramos.push(5.5);
    menosGramos.push(7.23);
    menosGramos.push(8.5);
    menosGramos.push(4.5);
    menosGramos.push(10.5);
    
    Stack<String>turnoOHoraDeLlegada = new Stack<String>();
    turnoOHoraDeLlegada.push("10:00 am");
    turnoOHoraDeLlegada.push("10:00 am");
    turnoOHoraDeLlegada.push("10:00 am");
    turnoOHoraDeLlegada.push("10:00 am");
    turnoOHoraDeLlegada.push("10:00 am");
}
}