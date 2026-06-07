/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
 import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese una nota entre 0 y 10: ");
        nota = teclado.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Error. La nota debe estar entre 0 y 10.");
            System.out.print("Ingrese nuevamente la nota: ");
            nota = teclado.nextDouble();
        }

        System.out.println("La nota válida registrada es: " + nota);

        teclado.close();
    }
}

   
