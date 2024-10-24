package com.cuh;

import java.util.Iterator;

public class HablarEnF {
	public static void main(String[] args) {
		
		String palabra = " PeRrO";
		
		String palabraLimpia = palabra.toLowerCase().trim();
		char[] vocales = {'a','e','i','u','o'};
		
		char[] palabraFinal = 
			new char[calcularTamano(palabra, vocales)];
		
		char[] palabraChars = palabra.toCharArray();

	//		int indice = 0;
//		for(char letra : palabra.toCharArray()) {
//			palabraFinal[indice++] = letra;
//			if(esVocaloNel(letra,vocales)) {
//				palabraFinal[indice++] = 'f';
//				palabraFinal[indice++] = letra;
//			}
//		}
		
				int indice = 0;
		for (int i = 0; i < palabraChars.length; i++) {
		

			palabraFinal[indice++] = palabraChars[i];
			if(esVocaloNel(palabraChars[i],vocales)) {
				palabraFinal[indice++] = 'f';
				palabraFinal[indice++] = palabraChars[i];
			}
		}
		
		
		for (char c : palabraFinal) {
			System.out.println(c);
		}
	
		
	}
	
	private static int calcularTamano( String palabra, char[] vocales) {
		int tamano = palabra.length();
		for(char letra :palabra.toCharArray()) {
			if(esVocaloNel(letra,vocales)) {
				tamano+= 2;
			}
		}
		
		return tamano;
	}
	private static boolean esVocaloNel(char letra, char[] vocales){
		for (char vocal : vocales) {
			if(letra == vocal) {
				return true;
			}

		}
		
		return false;
	}
	
	
	
}
