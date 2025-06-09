package interfaz;

import java.util.Random;

public enum CaraCruz {
	CARA, CRUZ;
	
	public static Random r = new Random();
	
	public static boolean jugar(int opc) {
		CaraCruz resultado = r.nextBoolean() ? CARA : CRUZ;
		
		System.out.println("Salio: " + resultado);
		
		if ((resultado == CARA && opc == 1) || (resultado == CRUZ && opc == 2)) {
			return true;
		} else {
			return false;
		}
		  
	}
	
}
