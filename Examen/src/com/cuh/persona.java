package com.cuh;

public class persona {

	public int tiempo;  
    public double kilos;  

   
    public persona(int tiempo, double kilos) {
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
	
	  public void mostrar() {
	        System.out.println("Tiempo: " + tiempo + " minutos");
	        System.out.println("Kilos: " + kilos + " kg");
	    }
	
	
	}


