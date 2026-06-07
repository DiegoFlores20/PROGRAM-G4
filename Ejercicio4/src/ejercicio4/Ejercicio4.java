/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Algoritmo que simule un cajero automatico.se solicita una clave y permite un maximo de tres intentos si la clave es correcta mustra un mensaje de bienvenida caso contrario bloquea el acceso.
        final String CLAVE_CORRECTA = "4321"; // Clave del cajero
        final int MAX_INTENTOS = 3;
        
        String claveIngresada = "";
        int intentos = 0;
        boolean accesoConcedido = false;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BIENVENIDO AL SISTEMA DEL BANCO ===");
        
        // Bucle controlado por el número de intentos y el estado de acceso
        while (intentos < MAX_INTENTOS && !accesoConcedido) {
            System.out.print("Ingrese su clave de acceso, ANTES DE HACERLO ACUERDESE BIEN: ");
            claveIngresada = scanner.nextLine();
            intentos++;
            
            // Validación de la clave ingresada
            if (claveIngresada.equals(CLAVE_CORRECTA)) {
                accesoConcedido = true;
            } else {
                int intentosRestantes = MAX_INTENTOS - intentos;
                System.out.println("Clave incorrecta.");
                if (intentosRestantes > 0) {
                    System.out.println("Le quedan " + intentosRestantes + " intentos.");
                }
            }
        }
        
        // Evaluación final fuera del bucle
        if (accesoConcedido) {
            System.out.println("\n¡Bienvenido a su cuenta bancaria!");
            System.out.println("Acceso concedido exitosamente.");
        } else {
            System.out.println("\n[ERROR] Ha superado el límite de intentos.");
            System.out.println("Acceso bloqueado por motivos de seguridad.");
        }
        
        scanner.close();
    }
}
    
   
