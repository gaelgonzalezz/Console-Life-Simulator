package principal;

import entidades.Nombres;
import entidades.Personaje;
import entidades.PersonajeFactory;
import interfaz.JuegoPrincipal;
import util.Utilidades;

public class Principal {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("    Bienvenido al Console Life Simulator    ");
        System.out.println("===================================");
        
        System.out.println("¿Deseas darle un nombre a tu PJ o quieres que sea aleatorio?");
        System.out.println("1. Personalizado.");
        System.out.println("2. Aleatorio.");
        int opc = Utilidades.ingresarEntero(1, 2);
        String nombre;
        
        if (opc == 1) {
            System.out.println("Ingresa tu nombre: ");
            nombre = Utilidades.ingresarString();
        } else {
            nombre = Nombres.nombreAleatorio();
        }
        
        PersonajeFactory.mostrarTiposDisponibles();
        System.out.println("Elige el tipo de personaje (1-4): ");
        int tipoPersonaje = Utilidades.ingresarEntero(1, 4);
        
        Personaje jugador = PersonajeFactory.crearPersonaje(nombre, tipoPersonaje);
        
        System.out.println("¡Perfecto! Has creado a " + nombre + " como " + jugador.getTipo());
        System.out.println(jugador.getDescripcionTipo());
        System.out.println("===================================");
        
        JuegoPrincipal juego = new JuegoPrincipal(jugador);
        juego.juego();
    }
}
