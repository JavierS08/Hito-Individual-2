package com.info;

public class Hija extends Padre {

	public Hija(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public static void saludar() {//el concepto con el cuál puedo llamar a un método igual en una clase hija que en una padre y que me saque un mensaje distinto es la sobreescritura (override)
		System.out.println("Hola,soy la hija");
	}
}
