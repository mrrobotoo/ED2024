package com.cuh;

public class Clientes {
	
	
	String tiempo;
    int gramos;
    

    public Clientes( String tiempo, int gramos) {
        
        this.gramos = gramos;
        this.tiempo = tiempo;
    }


	public String getTiempo() {
		return tiempo;
	}


	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}


	public int getGramos() {
		return gramos;
	}


	public void setGramos(int gramos) {
		this.gramos = gramos;
	}

}
