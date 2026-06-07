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

        System.out.println("Ingrese números enteros positivos.");
        System.out.println("Para finalizar ingrese un número negativo.");

        do {
            System.out.print("Ingrese un número: ");
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

        System.out.println("\nRESULTADOS");
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        teclado.close();
    }
}
    
    

