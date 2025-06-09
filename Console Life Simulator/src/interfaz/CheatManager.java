package interfaz;

import entidades.Personaje;

public class CheatManager {
    private Personaje personaje;
    private int supermanCounter = 0;
    private int hesoyamCounter = 0;

    public CheatManager(Personaje personaje) {
        this.personaje = personaje;
    }

    public boolean ejecutarCheat(String comando) {
        switch (comando.toLowerCase()) {
            case "superman" -> {
                superman();
                return true;
            }
            case "hesoyam" -> {
                hesoyam();
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    private void superman() {
        if (supermanCounter >= 1) {
            System.out.println("⚠️ Ya activaste el cheat 'superman'. Solo puede usarse una vez.");
            return;
        }
        System.out.println("🦸‍♂️ Cheat activado: ¡Superman!");
        System.out.println("¡Tu personaje restaura su salud, hambre y sueño al máximo!");
        personaje.setVida(100);
        personaje.setHambre(0);
        personaje.setSueno(0);
        supermanCounter++;
    }

    private void hesoyam() {
        if (hesoyamCounter >= 1) {
            System.out.println("⚠️ Ya usaste 'hesoyam'. No podés usarlo otra vez.");
            return;
        }
        System.out.println("💸 Cheat activado: Hesoyam");
        System.out.println("¡Tu personaje recibe 500$ y su salud se restablece!");
        personaje.setVida(100);
        personaje.setDinero(personaje.getDinero() + 500);
        hesoyamCounter++;
    }
}

