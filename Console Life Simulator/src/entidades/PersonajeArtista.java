package entidades;

import util.Utilidades;

public class PersonajeArtista extends Personaje {
    
    public PersonajeArtista(String nombre) {
        super(nombre, "Artista");
        this.felicidad = 120; 
        this.dinero = 300; 
    }
    
    @Override
    public void habilidadEspecial() {
        System.out.println("🎨 ¡HABILIDAD ARTISTA: Inspiración Creativa!");
        System.out.println("Creas una obra maestra que te llena de alegría y puede generar dinero.");
        this.felicidad = limitarValor(this.felicidad + 40);
        
        boolean exitoComercial = Utilidades.generarAleatorioBooleano();
        if(exitoComercial) {
            System.out.println("¡Tu obra fue un éxito comercial!");
            this.dinero += 500;
        } else {
            System.out.println("No vendiste la obra, pero te sientes realizado.");
        }
        
        this.sueno = limitarValor(this.sueno + 10);
    }
    
    @Override
    public void jugarVideojuegos() {
        System.out.println("🎮 ¡Jugando por inspiración artística!");
        this.felicidad = limitarValor(this.felicidad + 30);
        this.inteligencia += 1;
        this.hambre = limitarValor(this.hambre + 5);
        this.sueno = limitarValor(this.sueno + 8);
        this.suciedad = limitarValor(this.suciedad + 3);
    }
    
    @Override
    public void pasear() {
        System.out.println("🚶 ¡Paseando en busca de inspiración!");
        this.felicidad = limitarValor(this.felicidad + 15);
        this.hambre = limitarValor(this.hambre + 2);
        this.sueno = limitarValor(this.sueno + 3);
        
        System.out.println("✨ El paseo te inspiró para tu próxima creación.");
        this.inteligencia += 1;
    }
    
    
    @Override
    public String getDescripcionTipo() {
        return "Artista creativo que encuentra belleza en todo y vive por la inspiración.";
    }
}
