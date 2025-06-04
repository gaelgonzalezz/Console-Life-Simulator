package interfaz;

import entidades.Jugador;
import util.Utilidades;

public class JuegoPrincipal {
	private Jugador jugador;
	
	public JuegoPrincipal(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public boolean continuarJuego() {
		if(jugador.getVida() <= 0) {
			System.out.println("Te moriste. Fin de la partida.");
			System.exit(0);
			return false;
		} else {
			return true;
		}
	}
	
	public void disminuirVida() {
		if(jugador.getFelicidad() = 100) {
			System.out.println("Tu PJ esta triste, ");
		}
	}
	public void juego() {
		boolean continuar = true;
		int turno = 0;
		
		while(continuar) {	
			
			System.out.println("--------TURNO: " + turno + "--------");
			jugador.mostrarStats();
			
			System.out.println("""
					--- MENÚ PRINCIPAL ---
					1. Ver estado
					2. Comer
					3. Dormir
					4. Bañarse
					5. Trabajar
					6. Estudiar
					7. Ejercitarse
					8. Apostar
					9. Salir a pasear
					10. Ver TV
					11. Jugar videojuegos
					12. Salir del juego
					""");
			
			int opcionAccion = Utilidades.ingresarEntero(1, 12);
			
			switch(opcionAccion) {
			case 1:
				jugador.mostrarStats();
				break;
			case 2:
				jugador.comer();
				break;
			case 3:
				jugador.dormir();
				break;
			case 4:
				jugador.banio();
				break;
			case 5:
				jugador.trabajar();
				break;
			case 6:
				jugador.estudiar();
				break;
			case 7:
				jugador.ejercitarse();
				break;
			case 8:
				jugador.apostar();
				break;
			case 9:
				jugador.pasear();
				break;
			case 10:
				jugador.robarTienda();
				break;
			case 11:
				jugador.jugarVideojuegos();
				break;
			case 12:
				System.out.println("Hasta luego!");
				continuar = false;
				break;
			}
					
			jugador.limitarTodo();
			continuar = continuarJuego();
			
			turno++;
		}
		
		
	}
	
}
