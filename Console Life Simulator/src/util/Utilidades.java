package util;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import interfaz.CheatManager;

public class Utilidades {
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    
    public static int ingresarEntero(int MIN, int MAX, CheatManager cheatManager) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println("Ingrese un número entre " + MIN + " y " + MAX + ":");
            try {
                numero = s.nextInt();
                if (numero >= MIN && numero <= MAX) {
                    valido = true;
                } else {
                    System.out.println("Número fuera de rango.");
                }
            } catch (InputMismatchException e) {
                String texto = s.next(); 
                if (cheatManager != null && cheatManager.ejecutarCheat(texto)) {
                    continue;
                }
                System.out.println("Entrada inválida. Ingrese un número o un comando válido.");
            }
        }
        return numero;
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
        return r.nextInt(max - min + 1) + min;
    }
    
    public static boolean generarAleatorioBooleano() {
        return r.nextBoolean();
    }
}
