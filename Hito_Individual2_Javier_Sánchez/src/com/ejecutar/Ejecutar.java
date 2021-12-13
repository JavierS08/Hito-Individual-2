package com.ejecutar;

import com.info.Aguila;
import com.info.Animal;
import com.info.Hija;
import com.info.Padre;
import com.info.Tiburón;
import com.info.Viajeros;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Cuestión 1-----");
		Viajeros viajero1=new Viajeros("Rafael",5000,true);
		viajero1.setPrecio(1000);
		System.out.println(viajero1.getNombre());
		System.out.println(viajero1.toString());
		System.out.println(viajero1.descuento(viajero1.getPrecio()));
		
		System.out.println("-----Cuestión 2-----");
		Padre.saludar();
		Hija.saludar();
		
		System.out.println("-----Cuestión 3-----");
		/*El polimorfismo es la propiedad por la cuál es posible enviar mensajes sintácticamente iguales a objetos de tipos distintos, siempre que estos sepan como reponder a dicho mensaje.*/
		Tiburón tiburón = new Tiburón();
		tiburón.cazar();
		Aguila aguila=new Aguila();
		aguila.cazar();
		/*El polimorfismo se aplica a la creación de un array de tal manera que creando un array o lista al introducir un número correspondiente a un animal del array nos sacará el animal de dicha lista que ocupe esa posición junto con el método que le hayamos atribuido, en este caso con cazar.*/
		Animal[] salvajes= {tiburón,aguila};
		salvajes[0].cazar();
	}

}
 