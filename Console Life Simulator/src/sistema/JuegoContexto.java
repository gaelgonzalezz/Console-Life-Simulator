package sistema;

import entidades.Personaje;

public class JuegoContexto {

    private static Personaje personaje;

    public static void setPersonaje(Personaje p) {
        personaje = p;
    }

    public static Personaje getPersonaje() {
        return personaje;
    }
}

