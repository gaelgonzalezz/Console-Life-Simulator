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
        this.hambre = limitarValor(this.hambre + 10);
        this.sueno = limitarValor(this.sueno + 5);
        this.suciedad = limitarValor(this.suciedad + 10);
    }
    
    @Override
    public void trabajar() {
        System.out.println("💼 ¡Trabajando con dedicación profesional!");
        this.dinero += 80;
        this.hambre = limitarValor(this.hambre + 12);
        this.sueno = limitarValor(this.sueno + 15);
        this.suciedad = limitarValor(this.suciedad + 15);
        sumarAccionFavorita();
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
    public String getDescripcionTipo() {
        return "Trabajador dedicado que encuentra satisfacción en el trabajo bien hecho.";
    }
}