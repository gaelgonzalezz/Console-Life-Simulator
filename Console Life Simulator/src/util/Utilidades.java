package util;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	
	public static  int ingresarEntero(final int MIN, final int MAX) {
		int num = 0;
		boolean error = false;
		
		if (MIN > MAX) {
			System.out.println("El minimo no debe ser mayor al maximo");
			error = true;
		}
		
		do {
			error = false;
			
			try {
				num = s.nextInt();
				
				if(num < MIN || num > MAX) {
					System.out.println("El valor ingresado esta fuera de los limites");
					error = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("El valor ingresado no es un entero");
				error = true;
			} catch (Exception e) {
				System.out.println("Error no contemplado." + e);
				error = true;
				System.exit(1);
			} finally {
				s.nextLine();
			}
			
			if(error == true) {
				System.out.println("Intente de vuelta");
			}
			
		} while(error);
		
		return num;
	}
	
	public static int esperarMilisegundos(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			System.out.println("Error al esperar: " + e.getMessage());
		}
		return milisegundos;
	}
	
	
	public static String ingresarString() {
		return s.nextLine();
	}
	
	public static int generarAleatorioInt(int min, int max) {
		int a = r.nextInt(min, max);
		return a;
	}
	
	
	public static boolean generarAleatorioBooleano() {
		boolean a = r.nextBoolean();
		return a;
	}
	
}
