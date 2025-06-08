package util;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import entidades.Personaje;
import sistema.JuegoContexto;

public class Utilidades {
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	public static int ingresarEntero(final int MIN, final int MAX) {
	    int num = 0;
	    boolean valido = false;
	    
	    while (!valido) {
	        System.out.println("Ingrese un número entre " + MIN + " y " + MAX + ": ");
	        String entrada = s.nextLine();

	        if (entrada.equalsIgnoreCase("superman")) {
	            JuegoContexto.getPersonaje().superman();
	            continue; 
	        }
	        if (entrada.equalsIgnoreCase("hesoyam")) {
	            JuegoContexto.getPersonaje().hesoyam();
	            continue; 
	        }
	        
	        try {
	            num = Integer.parseInt(entrada);

	            if (num < MIN || num > MAX) {
	                System.out.println("El número está fuera del rango permitido.");
	            } else {
	                valido = true;
	            }

	        } catch (NumberFormatException e) {
	            System.out.println("Entrada inválida. Ingrese un número válido.");
	        }
	    }

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
