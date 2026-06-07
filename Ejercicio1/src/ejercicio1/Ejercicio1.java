/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Algoritmo que solicite una contraseña
        String contrasenaCorrecta = "Secreta123";
        String contrasenaIngresada;
        int intentos = 0;

        // El try-with-resources gestiona la apertura y cierre automático del Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- Sistema para ingreso ---");

            // Estructura ideal: primero ejecuta la acción, luego evalúa si repite
            do {
                System.out.print("Ingrese su contraseña: ");
                contrasenaIngresada = scanner.nextLine();
                intentos++;

                if (!contrasenaIngresada.equals(contrasenaCorrecta)) {
                    System.out.println("La contraseña no es la correcta. Vuelva cuando se haya acordado.");
                }
                
            } while (!contrasenaIngresada.equals(contrasenaCorrecta));

            // Mensaje de éxito al ingresar correctamente
            System.out.println("\n¡Acceso concedido!");
            System.out.println("Número total de intentos necesitados: " + intentos);
            
           //salida
        }
    }
}
    
    

