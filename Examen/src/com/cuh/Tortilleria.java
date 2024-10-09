package com.cuh;
import java.util.Stack;
public class Tortilleria{

public static void main(String[] args) {
	        String[] nombres = {"Cris", "Mario", "Sebas", "David", "Pablo", "Santi"};
	        String[] horas = {"08:00", "09:00", "07:30", "11:15", "10:45", "08:30"};
	        int[] gramos = {50, 120, 80, 150, 90, 200};
	     
	        Stack<String> pilaMenos = new Stack<>();
	        Stack<String> pilaMas = new Stack<>();
	        
	        for (int i = 0; i < nombres.length; i++) {
	            String persona = "Nombre: " + nombres[i] + ", Hora: " + horas[i] + ", Gramos de tortilla: " + gramos[i];
	            if (gramos[i] <= 100) {
	                pilaMenos.push(persona);
	            } else {
	                pilaMas.push(persona);
	            }
	        }
	        
	        System.out.println("Persona que necesitan menos de 100 gramos de tortilla:");
	        while (!pilaMenos.isEmpty()) {
	            System.out.println(pilaMenos.pop());
	        }
	        
	        System.out.println("Personas que necesitan más de 100 gramos de tortilla:");
	        while (!pilaMas.isEmpty()) {
	            System.out.println(pilaMas.pop());
	        }
	    }
	}




