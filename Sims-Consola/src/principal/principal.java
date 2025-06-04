package principal;

import entidades.Jugador;
import entidades.Nombres;
import interfaz.JuegoPrincipal;
import util.Utilidades;

public class principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido al SIMS consola");
		
		System.out.println("Deseas darle un nombre a tu PJ o quieres que sea aleatorio");
		System.out.println("1. Personalizado.");
		System.out.println("2. Aleatorio.");
		int opc = Utilidades.ingresarEntero(1, 2);
		String nombre;
		
		if (opc == 1) {
			nombre = Utilidades.ingresarString();
		} else {
			nombre = Nombres.nombreAleatorio();
		}
		
		System.out.println("Bien " + nombre + ", que empiece la aventura.");
		
		Jugador jugador = new Jugador(nombre);
		
		JuegoPrincipal juego = new JuegoPrincipal(jugador);
		juego.juego();
	}
}
