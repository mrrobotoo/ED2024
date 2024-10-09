package com.cuh;

public class Persona {

		
		private String	llegada;
		private int		gramos;
		
		
		public Persona(String llegada, int gramos) {
			super();
			this.llegada = llegada;
			this.gramos = gramos;
		}
		
		public String getHoraLlegada() {
			return llegada;
		}
		public void setHoraLlegada(String llegada) {
			this.llegada = llegada;
		}
		
		public int getGramosSolicitados() {
			return gramos;
		}
		public void setGramosSolicitados(int gramos) {
			this.gramos = gramos;
		}
		
		@Override
		public String toString() {
			return "Persona [llegada=" + llegada + ", gramos=" + gramos + "]";
		}
		
		
	}


   