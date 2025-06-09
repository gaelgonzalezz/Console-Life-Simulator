package principal;

import entidades.Nombres; 
import entidades.Personaje;
import entidades.PersonajeFactory;
import interfaz.JuegoPrincipal;
import util.Utilidades;
import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println(" Bienvenido al Console Life Simulator");
        System.out.println("=====================================");
        
        System.out.println("¿Deseas darle un nombre a tu PJ o quieres que sea aleatorio?");
        System.out.println("1. Personalizado.");
        System.out.println("2. Aleatorio.");
        int opc = Utilidades.ingresarEntero(1, 2, null);
        String nombre;
        
        if (opc == 1) {
            System.out.println("Ingresa tu nombre: ");
            scanner.nextLine(); // Clear the buffer
            nombre = scanner.nextLine();
        } else {
            nombre = Nombres.nombreAleatorio();
        }
        
        PersonajeFactory.mostrarTiposDisponibles();
        System.out.println("Elige el tipo de personaje (1-4): ");
        int tipoPersonaje = Utilidades.ingresarEntero(1, 4, null);
        
        Personaje personaje = PersonajeFactory.crearPersonaje(nombre, tipoPersonaje);
        
        System.out.println("¡Perfecto! Has creado a " + nombre + " como " + personaje.getTipo());
        System.out.println(personaje.getDescripcionTipo());
        System.out.println("===================================");
        
        JuegoPrincipal juego = new JuegoPrincipal(personaje);
        juego.juego();
    }
}