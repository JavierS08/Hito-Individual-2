package com.info;
//He decidido cambiar el ejercicio 1 debido a que ya lo hicimos en clase, por lo tanto he hecho uno que tenga que ver con viajeros
//Este archivo tiene privada las variables nombre, precio y Adulto, con su respectiva clase de variable, este ejercicio es igual al propuesto en el hito pero modificando los datos.
public class Viajeros {
	private String nombre;
	private float precio;
	private boolean Adulto;
public Viajeros(String nombre, float precio, boolean Adulto) {
	super();
	// TODO Auto-generated constructor stub
	this.nombre = nombre;
	this.precio = precio;
	this.Adulto = Adulto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public boolean isAdulto() {
	return Adulto;
}
public void setAdulto(boolean adulto) {
	Adulto = adulto;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Viajero -> [nombre="+ nombre + " precio="+ precio + " Adulto="+ Adulto +"]";
}
public float descuento(float importe){
	float descuento;
	if(importe>8000) {
		System.out.println("Tenemos una promoción para usted");  
	descuento=50.05f;
	}
	else {
		System.out.println("Lo siento, no hay descuentos para usted");
		descuento=0.0f;
	}
	return descuento;	
}

}
