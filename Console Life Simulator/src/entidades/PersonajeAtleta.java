package entidades;

public class PersonajeAtleta extends Personaje {
	 public PersonajeAtleta(String nombre) {
	        super(nombre, "Atleta");
	        this.vida = 120; 
	        this.felicidad = 90;
	    }
	    
	    @Override
	    public void habilidadEspecial() {
	        System.out.println("🏃‍♂️ ¡HABILIDAD ATLETA: Entrenamiento Intensivo!");
	        System.out.println("Ganas mucha más condición física y felicidad.");
	        this.vida = limitarValor(this.vida + 15);
	        this.felicidad = limitarValor(this.felicidad + 20);
	        this.hambre = limitarValor(this.hambre + 25);
	        this.sueno = limitarValor(this.sueno + 15);
	        this.suciedad = limitarValor(this.suciedad + 35);
	    }
	    
	    @Override
	    public void ejercitarse() {
	        System.out.println("💪 ¡Entrenamiento de atleta profesional!");
	        this.vida = limitarValor(this.vida + 8); // Más beneficios
	        this.felicidad = limitarValor(this.felicidad + 25);
	        this.hambre = limitarValor(this.hambre + 15); // Menos hambre
	        this.sueno = limitarValor(this.sueno + 10); // Menos cansancio
	        this.suciedad = limitarValor(this.suciedad + 30);
	    }
	    
	    @Override
	    public void degradarStatsPorTurno() {
	        this.hambre = limitarValor(this.hambre + 3); // Más hambre (metabolismo rápido)
	        this.sueno = limitarValor(this.sueno + 1); // Menos cansancio
	        this.suciedad = limitarValor(this.suciedad + 1.5);
	        this.felicidad = limitarValor(this.felicidad - 0.2); // Menos pérdida de felicidad
	    }
	    
	    @Override
	    public String getDescripcionTipo() {
	        return "Atleta profesional con gran resistencia física y amor por el ejercicio.";
	    }

}
