package com.info;

public abstract class Padre {//consigo que la clase padre no este instanciada mediante el uso de la public abstract class
	private String nombre;
	private int edad;
	public Padre(String nombre, int edad) {
		super();
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.edad=edad;
	}
	public static void saludar() {
		System.out.println("Hola, soy el padre");
	}
}
