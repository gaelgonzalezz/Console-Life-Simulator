package entidades;

import util.Utilidades;

public class Jugador {
	private String nombre;
	private double vida = 100;
	private double dinero = 500;
	private double inteligencia = 100;
	private double felicidad = 100;
	private double hambre = 0;
	private double sueno = 0;
	private double suciedad = 0;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.dinero = dinero;
		this.inteligencia = inteligencia;
		this.felicidad = felicidad;
		this.hambre = hambre;
		this.sueno = sueno;
		this.suciedad = suciedad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getVida() {
		return vida;
	}

	public double getDinero() {
		return dinero;
	}

	public double getFelicidad() {
		return felicidad;
	}

	public double getHambre() {
		return hambre;
	}

	public double getSueno() {
		return sueno;
	}

	public double getSuciedad() {
		return suciedad;
	}

	public void mostrarStats() {
		System.out.println("---------------STATS------------------");
		System.out.println("Vida: " + this.vida);
		System.out.println("Dinero: " + this.dinero);
		System.out.println("Inteligencia: " + this.inteligencia);
		System.out.println("Felicidad: " + this.felicidad);
		System.out.println("Hambre: " + this.hambre);
		System.out.println("Sueno: " + this.sueno);
		System.out.println("Suciedad: " + this.suciedad);
		System.out.println("---------------------------------------");
	}
	
	public void comer() {
		this.vida = limitarValor(this.vida + (this.vida * 0.15) );
		this.felicidad = limitarValor(this.felicidad + 10);
		this.sueno = limitarValor(this.sueno + 7.5);
		this.hambre = limitarValor(this.hambre - (this.hambre * 0.35));
		
	}
	
	public double limitarValor(double d) {
	    if (d < 0) return 0;
	    if (d > 100) return 100;
	    return d;
	}

	public double limitar0alInfinito(double di) {
		if (di < 0) return 0;
		return di;
	}
	
	public void limitarTodo() {
	    this.vida = limitarValor(this.vida);
	    this.dinero = limitar0alInfinito(this.dinero);
	    this.inteligencia = limitar0alInfinito(this.dinero);
	    this.felicidad = limitarValor(this.felicidad);
	    this.hambre = limitarValor(this.hambre);
	    this.sueno = limitarValor(this.sueno);
	    this.suciedad = limitarValor(this.suciedad);
	}

	
	public void banio() {
		this.vida = limitarValor(this.vida + (this.vida * 0.75) );
		this.felicidad = limitarValor(this.felicidad + 20);
		this.sueno = limitarValor(this.sueno + 5);
		this.suciedad = 0;
		
	}

	public void dormir() {
		this.vida = 100;
	    this.felicidad = limitarValor(this.felicidad + 35);
	    this.hambre = limitarValor(this.hambre + 10);
	    this.sueno = 0;
	    this.suciedad = limitarValor(this.suciedad + 5);
		
	}

	public void trabajar() {
	    this.dinero += + 25;
	    this.felicidad = limitarValor(this.felicidad - 15);
	    this.hambre = limitarValor(this.hambre + 15);
	    this.sueno = limitarValor(this.sueno + 20);
	    this.suciedad = limitarValor(this.suciedad + 15);
	}

	public void estudiar() {
		System.out.println("Dime, realmente te gusta estudiar?");
		System.out.println("1. SI 🥸.  2. NO");
		System.out.println("2. NO");
		int leGusta = Utilidades.ingresarEntero(1, 2);
		
		if(leGusta == 1) {
			this.felicidad = limitarValor(this.felicidad + 5);
		} else {
			this.felicidad = limitarValor(this.felicidad - 5);
		}
		this.inteligencia += 1;
		this.sueno = limitarValor(this.sueno + 10);
	}

	public void ejercitarse() {
		 this.felicidad = limitarValor(this.felicidad + 7.5);
		 this.hambre = limitarValor(this.hambre + 10);
		 this.sueno = limitarValor(this.sueno + 7.5);
		 this.suciedad = limitarValor(this.suciedad + 30);
	}
	
		
}
