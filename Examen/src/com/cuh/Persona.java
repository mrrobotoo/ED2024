package com.cuh;

public class Persona {

	  
	    private int tiempo; 
	    private double kilos; 

	    // Constructor tiene el mismo nombre de la clase 
	    public Persona(int tiempo, double kilos) {
	        this.tiempo = tiempo;
	        this.kilos = kilos;
	    }

	   
	    public int getTiempo() {
	        return tiempo;
	    }

	   
	    public void setTiempo(int tiempo) {
	        this.tiempo = tiempo;
	    }

	    
	    public double getKilos() {
	        return kilos;
	    }

	  
	    public void setKilos(double kilos) {
	        this.kilos = kilos;
	    }

	    // Método para mostrar la información de la persona
	    public void Personas() {
	        System.out.println("Persona " + "Tiempo " + tiempo + " minutos, gramos " + kilos + " g de tortillas");
	    }
	}

	
	
	


