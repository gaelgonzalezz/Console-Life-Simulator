package interfaz;

import java.util.Random;

public enum CaraCruz {
	CARA, CRUZ;
	
	public static Random r = new Random();
	
	public static boolean jugar(int opc) {
		CaraCruz resultado = r.nextBoolean() ? CARA : CRUZ;
		
		System.out.println("Salio: " + resultado);
		
		if((opc == 1 && resultado == CARA) || (opc == 2 && resultado == CRUZ)){
			 return true;
		  } else {
			  return false;
		  }
		  
	}
	
}
