package entidades;

public class PersonajeTrabajador extends Personaje {
    
    public PersonajeTrabajador(String nombre) {
        super(nombre, "Trabajador");
        this.dinero = 700;
        this.vida = 110;
        this.felicidad = 85;
    }
    
    @Override
    public void habilidadEspecial() {
        System.out.println("⚒️ ¡HABILIDAD TRABAJADOR: Día Productivo!");
        System.out.println("Trabajas extra duro y obtienes excelentes resultados.");
        this.dinero += 150;
        this.felicidad = limitarValor(this.felicidad + 20);
        this.hambre = limitarValor(this.hambre + 20);
        this.sueno = limitarValor(this.sueno + 30);
        this.suciedad = limitarValor(this.suciedad + 25);
    }
    
    @Override
    public void trabajar() {
        System.out.println("💼 ¡Trabajando con dedicación profesional!");
        this.dinero += 80;
        this.felicidad = limitarValor(this.felicidad - 5);
        this.hambre = limitarValor(this.hambre + 12);
        this.sueno = limitarValor(this.sueno + 15);
        this.suciedad = limitarValor(this.suciedad + 15);
    }
    
    @Override
    public void dormir() {
        System.out.println("😴 ¡Descanso bien merecido!");
        this.vida = limitarValor(this.vida + 25);
        this.felicidad = limitarValor(this.felicidad + 20);
        this.hambre = limitarValor(this.hambre + 3);
        this.sueno = 0;
        this.suciedad = limitarValor(this.suciedad + 2);
        this.comerCount = 0;
    }
    
    @Override
    public void degradarStatsPorTurno() {
        this.hambre = limitarValor(this.hambre + 2.5);
        this.sueno = limitarValor(this.sueno + 2);
        this.suciedad = limitarValor(this.suciedad + 1.5);
        this.felicidad = limitarValor(this.felicidad - 0.3);
    }
    
    @Override
    public String getDescripcionTipo() {
        return "Trabajador dedicado que encuentra satisfacción en el trabajo bien hecho.";
    }
}