package entidades;

import interfaz.CaraCruz;
import util.Utilidades;

public abstract class Personaje {
	 protected String nombre;
	    protected double vida = 100;
	    protected int dinero = 500;
	    protected int inteligencia = 100;
	    protected double felicidad = 100;
	    protected double hambre = 0;
	    protected double sueno = 0;
	    protected double suciedad = 0;
	    protected int comerCount = 0;
	    protected String tipo; 
	    
	    public Personaje(String nombre, String tipo) {
	        this.nombre = nombre;
	        this.tipo = tipo;
	    }
	    
	    public abstract void habilidadEspecial();
	    public abstract String getDescripcionTipo();
	    
	    public String getNombre() { return nombre; }
	    public double getVida() { return vida; }
	    public int getDinero() { return dinero; }
	    public int getInteligencia() { return inteligencia; }
	    public double getFelicidad() { return felicidad; }
	    public double getHambre() { return hambre; }
	    public double getSueno() { return sueno; }
	    public double getSuciedad() { return suciedad; }
	    public String getTipo() { return tipo; }
	    
	    public void setVida(double vida) { this.vida = limitarValor(vida); }
	    public void setDinero(int dinero) { this.dinero = limitar0(dinero); }
	    public void setFelicidad(double felicidad) { this.felicidad = limitarValor(felicidad); }
	    public void setHambre(double hambre) { this.hambre = limitarValor(hambre); }
	    public void setSueno(double sueno) { this.sueno = limitarValor(sueno); }
	    public void setSuciedad(double suciedad) { this.suciedad = limitarValor(suciedad); }
	    public void setInteligencia(int inteligencia) { this.inteligencia = limitar0(inteligencia); }
	    
	    protected int comerCounter = 0;
	 	protected int dormirCounter = 0;
	 	protected int banioCounter = 0;
	    protected int trabajarCounter = 0;
	    protected int estudiarCounter = 0;
	    protected int ejercitarseCounter = 0;
	    protected int apostarCounter = 0;
	    protected int robarTiendaCounter = 0;
	    protected int pasearCounter = 0;
	    protected int jugarVideojuegosCounter = 0;
	    protected int tocarInstrumentoCounter = 0;
	    
	    public void mostrarStats() {
	        System.out.println("--- STATS DE " + this.nombre.toUpperCase() + " (" + tipo + ") ---");
	        System.out.println("Vida: " + String.format("%.1f", this.vida) + "%");
	        System.out.println("Dinero: $" + this.dinero);
	        System.out.println("Inteligencia: " + this.inteligencia);
	        System.out.println("Felicidad: " + String.format("%.1f", this.felicidad) + "%");
	        System.out.println("Hambre: " + String.format("%.1f", this.hambre) + "%");
	        System.out.println("Sueño: " + String.format("%.1f", this.sueno) + "%");
	        System.out.println("Suciedad: " + String.format("%.1f", this.suciedad) + "%");
	        System.out.println("--------------------------------");
	    }
	    
	    public void mostrarCantidadAccionesRealizadas() {
	        System.out.println("--- CANTIDAD DE ACCIONES ---");
	        System.out.println("Comer: " + comerCounter);
	        System.out.println("Dormir: " + dormirCounter);
	        System.out.println("Baños: " + banioCounter);
	        System.out.println("Trabajo: " + trabajarCounter);
	        System.out.println("Estudio: " + estudiarCounter);
	        System.out.println("Ejercicio: " + ejercitarseCounter);
	        System.out.println("Apuestas: " + apostarCounter);
	        System.out.println("Robos a tiendas: " + robarTiendaCounter);
	        System.out.println("Paseos: " + pasearCounter);
	        System.out.println("Jugar videojuegos: " + jugarVideojuegosCounter);
	        System.out.println("Tocar instrumentos: " + tocarInstrumentoCounter);
	    }
	    
	    public void disminuirVida() {
	        if(getFelicidad() <= 5) {
	            System.out.println("⚠️  Tu personaje está muy triste, entreténelo o perderá vida.");
	            this.vida = limitarValor(this.vida - 15);
	        }
	        if(getSueno() >= 95) {
	            System.out.println("⚠️  Tu personaje está demasiado cansado, hazlo descansar o perderá vida.");
	            this.vida = limitarValor(this.vida - 15);
	        }
	        if(getHambre() >= 95) {
	            System.out.println("⚠️  Tu personaje está desnutrido, aliméntalo o perderá vida.");
	            this.vida = limitarValor(this.vida - 15);
	        }
	        if(getSuciedad() >= 95) {
	            System.out.println("⚠️  Tu personaje está demasiado sucio, bañalo o perderá vida.");
	            this.vida = limitarValor(this.vida - 15);
	        }
	    }
	    
	    
	    public void comer() {
	        if(getHambre() <= 10 && comerCounter == 0) {
	            System.out.println("No puedes comer más, no tienes hambre. La proxima vez que comas sin hambre perdés vida.");
	            comerCounter++;
	            return;
	        } else if(getHambre() <= 10 && comerCounter > 0) {
	            System.out.println("La gula es un pecado");
	            this.hambre = limitarValor(this.hambre - 25);
	            this.vida = limitarValor(this.vida - 7.5);
	            return;
	        }
	        
	        System.out.println("🍽️  ¡Hora de comer!");
	        this.vida = limitarValor(this.vida + 7.5);
	        this.felicidad = limitarValor(this.felicidad + 10);
	        this.sueno = limitarValor(this.sueno + 5);
	        this.hambre = limitarValor(this.hambre - 20);
	        comerCounter++;
	    }
	    
	    public void dormir() {
	        if(sueno <= 20) {
	            System.out.println("No tienes sueño todavía.");
	            return;
	        }
	        System.out.println("😴 Buenas noches...");
	        this.vida = limitarValor(this.vida + 20);
	        this.felicidad = limitarValor(this.felicidad + 15);
	        this.hambre = limitarValor(this.hambre + 5);
	        this.sueno = 0;
	        this.suciedad = limitarValor(this.suciedad + 5);
	        
	        dormirCounter++;
	    }
	    
	    public void banio() {
	        if(suciedad <= 10) {
	            System.out.println("Ya estás limpio, no puedes bañarte.");
	        } else {
	            System.out.println("🛁 ¡Qué refrescante!");
	            this.vida = limitarValor(this.vida + 5);
	            this.felicidad = limitarValor(this.felicidad + 20);
	            this.sueno = limitarValor(this.sueno + 5);
	            this.suciedad = 0;
	        }
	        
	        banioCounter++;
	    }
	    
	    public void trabajar() {
	        System.out.println("💼 ¡A trabajar se ha dicho!");
	        this.dinero += 50;
	        if(tipo == "Trabajador") {
	        	this.felicidad = limitarValor(this.felicidad + 5);
	        } else {
	        	this.felicidad = limitarValor(this.felicidad - 10);
	        }
	        this.hambre = limitarValor(this.hambre + 15);
	        this.sueno = limitarValor(this.sueno + 20);
	        this.suciedad = limitarValor(this.suciedad + 10);
	        
	        trabajarCounter++;
	    }
	    
	    public void estudiar() {
	        System.out.println("📚 ¡A estudiar!");
	        this.inteligencia += 5;
	        this.felicidad = limitarValor(this.felicidad + 5);
	        this.sueno = limitarValor(this.sueno + 12);
	        this.hambre = limitarValor(this.hambre + 5);
	        this.suciedad = limitarValor(this.suciedad + 3);
	        
	        dormirCounter++;  
	    }
	    
	    public void ejercitarse() {
	        System.out.println("💪 ¡A moverse!");
	        this.vida = limitarValor(this.vida + 3);
	        this.felicidad = limitarValor(this.felicidad + 15);
	        this.hambre = limitarValor(this.hambre + 20);
	        this.sueno = limitarValor(this.sueno + 15);
	        this.suciedad = limitarValor(this.suciedad + 25);
	        
	        ejercitarseCounter++;
	    }
	    
	    public void apostar() {
	    	System.out.println("A que juego queres jugar?");
	    	System.out.println("1. Cara o Cruz 🪙⚡");
	    	System.out.println("2. Ruleta 🎡");
	    	
	    	int opcionJuego = Utilidades.ingresarEntero(1, 2, null);
	    	
	    	if(opcionJuego == 1) {
	    		System.out.println("🎲 ¿Cuánto vas a apostar?");
	    		int apuesta = Utilidades.ingresarEntero(1, this.dinero, null);
	    		System.out.println("Elige: 1. Cara 🪙  2. Cruz ⚡");
	    		int opc = Utilidades.ingresarEntero(1, 2, null);
	        
	    		boolean victoria = CaraCruz.jugar(opc);
	    		
	    		if(victoria) {
	    			System.out.println("🎉 ¡Ganaste!");
	    			this.dinero += apuesta;
	    			this.felicidad = limitarValor(this.felicidad + 15);
	    		} else {
	    			System.out.println("😞 Perdiste...");
	    			this.dinero -= apuesta;
	    			this.felicidad = limitarValor(this.felicidad - 15);
	    		}
	    		
	    		
	    	} else if(opcionJuego == 2) {
	    		  System.out.println("🎡 ¿A cuántos números vas a apostar? Puedes apostar de 1 a 12 números por tirada.");
	    		    int cantidadNumeros = Utilidades.ingresarEntero(1, 12, null);
	    		    int[] numerosApostados = new int[cantidadNumeros];
	    		    int[] apuestasPorNumero = new int[cantidadNumeros];
	    		    int totalApostado = 0;

	    		    for(int i = 0; i < cantidadNumeros; i++) {
	    		        System.out.println("Elige el número " + (i+1) + " (0 a 36):");
	    		        numerosApostados[i] = Utilidades.ingresarEntero(0, 36, null);
	    		        System.out.println("¿Cuánto quieres apostar a este número? (Dinero restante: $" + (this.dinero - totalApostado) + ")");
	    		        int apuesta = Utilidades.ingresarEntero(1, this.dinero - totalApostado, null);
	    		        apuestasPorNumero[i] = apuesta;
	    		        totalApostado += apuesta;
	    		    }

	    		    int numeroGanador = Utilidades.generarAleatorioInt(0, 36);
	    		    int indiceGanador = -1;
	    		    for(int i = 0; i < cantidadNumeros; i++) {
	    		        if(numerosApostados[i] == numeroGanador) {
	    		            indiceGanador = i;
	    		            break;
	    		        }
	    		    }

	    		    System.out.println("Salió el número " + numeroGanador);
	    		    if(indiceGanador != -1) {
	    		        int ganancia = (apuestasPorNumero[indiceGanador] * 36);
	    		        int perdida = totalApostado - apuestasPorNumero[indiceGanador];
	    		        int neto = ganancia - perdida;
	    		        System.out.println("🎉 ¡Ganaste! Ganancia neta: $" + neto);
	    		        this.dinero += neto;
	    		        this.felicidad = limitarValor(this.felicidad + 25);
	    		    } else {
	    		        System.out.println("😞 Perdiste...");
	    		        this.dinero -= totalApostado;
	    		        this.felicidad = limitarValor(this.felicidad - 25);
	    		    }
	    		}
	    	
	    	apostarCounter++;
	    }
	    
	    public void robarTienda() {
			System.out.println("😈 Chico malo... Veamos si te atrapan");
			boolean atrapado = Utilidades.generarAleatorioBooleano();
			
			if(atrapado) {
				System.out.println("🚨 Te agarraron con las manos en la masa.");
				this.dinero = 0;
				this.felicidad = limitarValor(this.felicidad - 40);
				this.vida = limitarValor(this.vida - 30);
			} else {
				System.out.println("😎 Fuiste astuto y robaste con éxito");
				this.dinero = limitar0(this.dinero + 300);
				this.felicidad = limitarValor(this.felicidad + 15);
			}
			
			robarTiendaCounter++;
		}
	    
	    public void pasear() {
	        System.out.println("🚶 ¡Aire fresco!");
	        this.felicidad = limitarValor(this.felicidad + 8);
	        this.hambre = limitarValor(this.hambre + 3);
	        this.sueno = limitarValor(this.sueno + 5);
	        
	        boolean peligro = Utilidades.generarAleatorioBooleano();
	        if(peligro) {
	            System.out.println("⚠️  Algo malo pasó en el camino...");
	            this.vida = limitarValor(this.vida - 8);
	        } else {
	            System.out.println("✨ Fue un paseo muy relajante.");
	            this.felicidad = limitarValor(this.felicidad + 5);
	        }
	        
	        pasearCounter++;
	    }
	    
	    public void jugarVideojuegos() {
	        System.out.println("🎮 ¡Vamo' a jugá'!");
	        this.felicidad = limitarValor(this.felicidad + 20);
	        this.hambre = limitarValor(this.hambre + 8);
	        this.suciedad = limitarValor(this.suciedad + 5);
	        this.sueno = limitarValor(this.sueno + 10);
	        
	        jugarVideojuegosCounter++;
	    }
	    
	    public void tocarInstrumento() {
	        System.out.println("🎸 ¡A tocar música!");
	        this.felicidad = limitarValor(this.felicidad + 25);
	        this.inteligencia += 2;
	        this.hambre = limitarValor(this.hambre + 5);
	        this.sueno = limitarValor(this.sueno + 5);
	        this.suciedad = limitarValor(this.suciedad + 3);
	        
	        tocarInstrumentoCounter++;
	    }
	    
	    protected int contadorAccionFavorita = 0;
	    protected void sumarAccionFavorita() {
	        contadorAccionFavorita++;
	        if (contadorAccionFavorita >= 5) {
	            System.out.println("🔥 ¡HABILIDAD ESPECIAL ACTIVADA!");
	            this.habilidadEspecial();
	            contadorAccionFavorita = 0; 
	        }
	    }

	
	
	    
	    public void degradarStatsPorTurno() {
	        this.hambre = limitarValor(this.hambre + 3);
	        this.sueno = limitarValor(this.sueno + 1); 
	        this.suciedad = limitarValor(this.suciedad + 1.5);
	        this.felicidad = limitarValor(this.felicidad - 0.2); 
	    }
	    
	    public double limitarValor(double d) {
	        if (d < 0) return 0;
	        if (d > 100) return 100;
	        return d;
	    }
	    
	    public int limitar0(int di) {
	        if (di < 0) return 0;
	        return di;
	    }
	    
	    public void limitarTodo() {
	        this.vida = limitarValor(this.vida);
	        this.dinero = limitar0(this.dinero);
	        this.inteligencia = limitar0(this.inteligencia);
	        this.felicidad = limitarValor(this.felicidad);
	        this.hambre = limitarValor(this.hambre);
	        this.sueno = limitarValor(this.sueno);
	        this.suciedad = limitarValor(this.suciedad);
	    }
}


