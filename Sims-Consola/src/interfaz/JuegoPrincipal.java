package interfaz;

import entidades.Jugador;
import util.Utilidades;

public class JuegoPrincipal {
	private Jugador jugador;
	
	public JuegoPrincipal(Jugador jugador) {
		this.jugador = jugador;
	}

	public void Juego() {
		boolean continuar = true;
		int i = 0;
		
		while(continuar) {
			
			if(jugador.getVida() <= 0) {
				System.out.println("Te moriste. Fin de la partida.");
				continuar = false;
				System.exit(0);
			}
			
			System.out.println("--------TURNO: " + i + "--------");
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
			}

			
			i++;
		}
		
		
	}
	
}
