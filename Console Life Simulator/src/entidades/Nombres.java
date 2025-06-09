package entidades;

import java.util.Random;

public enum Nombres {
	Martin, Gael, Roman, Santiago, Abhay,
	Alvaro, Mateo, Lucas, Leo, Bruno,
	Vito, Ramiro, Thiago, Maximo, Juan,
	Diego, Samuel, Benjamin, Nicolas,
	Agustin, Lorenzo, william, Liam, Oliver,
	Elian, Elias, Ian;
	
	private static Random r = new Random();
	
	public static String nombreAleatorio() {
		Nombres[] nombres = Nombres.values();
		int indiceAleatorio = r.nextInt(nombres.length);
		return nombres[indiceAleatorio].name();
	}
	
}