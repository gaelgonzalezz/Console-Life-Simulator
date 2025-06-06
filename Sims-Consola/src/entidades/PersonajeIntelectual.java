package entidades;

public class PersonajeIntelectual extends Personaje {
    
    public PersonajeIntelectual(String nombre) {
        super(nombre, "Intelectual");
        this.inteligencia = 150;
        this.dinero = 800;
        this.felicidad = 80;
    }
    
    @Override
    public void habilidadEspecial() {
        System.out.println("🧠 ¡HABILIDAD INTELECTUAL: Momento Eureka!");
        System.out.println("Tienes una idea brillante que te hace ganar dinero e inteligencia.");
        this.inteligencia += 10;
        this.dinero += 200;
        this.felicidad = limitarValor(this.felicidad + 30);
        this.sueno = limitarValor(this.sueno + 20);
    }
    
    @Override
    public void estudiar() {
        System.out.println("📚 ¡Sesión de estudio intensiva!");
        this.inteligencia += 5; // Más inteligencia
        this.felicidad = limitarValor(this.felicidad + 15); 
        this.sueno = limitarValor(this.sueno + 8); 
        this.hambre = limitarValor(this.hambre + 3);
    }
    
    @Override
    public void trabajar() {
        System.out.println("💼 ¡Trabajo intelectual de alto nivel!");
        this.dinero += 100; // Más dinero
        this.felicidad = limitarValor(this.felicidad - 5); 
        this.hambre = limitarValor(this.hambre + 10);
        this.sueno = limitarValor(this.sueno + 25);
        this.suciedad = limitarValor(this.suciedad + 5); 
    }
    
    @Override
    public void degradarStatsPorTurno() {
        this.hambre = limitarValor(this.hambre + 1.5);
        this.sueno = limitarValor(this.sueno + 2);
        this.suciedad = limitarValor(this.suciedad + 0.5);
        this.felicidad = limitarValor(this.felicidad - 0.3);
    }
    
    @Override
    public String getDescripcionTipo() {
        return "Intelectual brillante que disfruta aprender y generar ideas innovadoras.";
    }
}
