package com.ejecutar;

import com.info.Aguila;
import com.info.Animal;
import com.info.Hija;
import com.info.Padre;
import com.info.Tibur�n;
import com.info.Viajeros;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Cuesti�n 1-----");
		Viajeros viajero1=new Viajeros("Rafael",5000,true);
		viajero1.setPrecio(1000);
		System.out.println(viajero1.getNombre());
		System.out.println(viajero1.toString());
		System.out.println(viajero1.descuento(viajero1.getPrecio()));
		
		System.out.println("-----Cuesti�n 2-----");
		Padre.saludar();
		Hija.saludar();
		
		System.out.println("-----Cuesti�n 3-----");
		/*El polimorfismo es la propiedad por la cu�l es posible enviar mensajes sint�cticamente iguales a objetos de tipos distintos, siempre que estos sepan como reponder a dicho mensaje.*/
		Tibur�n tibur�n = new Tibur�n();
		tibur�n.cazar();
		Aguila aguila=new Aguila();
		aguila.cazar();
		/*El polimorfismo se aplica a la creaci�n de un array de tal manera que creando un array o lista al introducir un n�mero correspondiente a un animal del array nos sacar� el animal de dicha lista que ocupe esa posici�n junto con el m�todo que le hayamos atribuido, en este caso con cazar.*/
		Animal[] salvajes= {tibur�n,aguila};
		salvajes[0].cazar();
	}

}
 