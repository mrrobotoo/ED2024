package com.cuh;

import java.util.ArrayList;
import java.util.List;

import com.cuh.vo.Person;

public class Listas {
	public static void main(String[] args) {
		List<Person> listaPersonas = new ArrayList<>();
		
		String nombrePersona1 = "juan";
		Integer[] cuentasPersona1 = {1231,4324,43242};
		
		Person persona1 = 
				new Person();
		persona1.setCuentas(cuentasPersona1);
		persona1.setNombre(nombrePersona1);
		
		Person persona2 = 
				new Person("pedro",new Integer[]{3243,2});
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		
	   List<Integer> listasCuentasTotales = new ArrayList<Integer>(); 
	   
	   for (Person persona : listaPersonas) {
		
			for (Integer cuentasPersonas : persona.getCuentas()) {
				listasCuentasTotales.add(cuentasPersonas);
				
			}
			
		}
	   
	   
	   for (Integer integer : listasCuentasTotales) {
		   System.out.println(integer);
	   }
	   
	   
		
		
		
		
	}
}
