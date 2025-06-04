package entidades;

import java.util.Random;

public enum Nombres {
	Martin, Gael, Roman, Santi, Abhay;
	
	private static Random r = new Random();
	
	public static String nombreAleatorio() {
		Nombres[] nombres = Nombres.values();
		int indiceAleatorio = r.nextInt(nombres.length);
		return nombres[indiceAleatorio].name();
	}
	
}