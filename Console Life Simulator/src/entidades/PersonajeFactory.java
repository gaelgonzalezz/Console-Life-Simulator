package entidades;

public class PersonajeFactory {
    
    public static Personaje crearPersonaje(String nombre, int tipo) {
        switch(tipo) {
            case 1:
                return new PersonajeAtleta(nombre);
            case 2:
                return new PersonajeIntelectual(nombre);
            case 3:
                return new PersonajeArtista(nombre);
            case 4:
                return new PersonajeTrabajador(nombre);
            default:
                return new PersonajeAtleta(nombre);
        }
    }
    
    public static void mostrarTiposDisponibles() {
        System.out.println("=== TIPOS DE PERSONAJE ===");
        System.out.println("1. 🏃‍♂️ ATLETA - Excelente condición física y resistencia (Aumenta: energía, salud)");
        System.out.println("2. 🧠 INTELECTUAL - Alta inteligencia y buenos ingresos (Aumenta: inteligencia, dinero)");
        System.out.println("3. 🎨 ARTISTA - Creatividad y felicidad natural (Aumenta: creatividad, felicidad)");
        System.out.println("4. ⚒️ TRABAJADOR - Dedicación laboral y estabilidad (Aumenta: trabajo, estabilidad)");
        System.out.println("==========================");
    }
}

