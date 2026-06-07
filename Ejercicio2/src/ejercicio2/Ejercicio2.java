/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
//Sistema para ingtresar numeros enteros positivos se termina cuando se ingresa un negativo
        int numero;
        int cantidad = 0;
        int suma = 0;
        double promedio;
//proceso
        System.out.println("Por favor ingresar solo numeros enteros positivos.");
        System.out.println("cuando vaya a finalizar ingrese solo un numero negativo para no tener fallos en el sistema.");

        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = teclado.nextInt();

            if (numero >= 0) {
                cantidad++;
                suma += numero;
            }

        } while (numero >= 0);

        if (cantidad > 0) {
            promedio = (double) suma / cantidad;
        } else {
            promedio = 0;
        }

        System.out.println("\nRESULTADOS OBTENIDOS");
        System.out.println("Cantidad/total de números ingresados: " + cantidad);
        System.out.println("Sumatoria total: " + suma);
        System.out.println("Promedio: " + promedio);

        teclado.close();
        //salda. Este programa se termina aqui muchas gracias:)
    }
}
    
    

