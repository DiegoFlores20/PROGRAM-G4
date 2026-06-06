package jiji;
import java.util.Scanner;
public class Jiji {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
        
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Contraseña ilimitada");
            System.out.println("2. Positivos, suma y promedio");
            System.out.println("3. Validar nota");
            System.out.println("4. Cajero automático");
            System.out.println("5. Pares e impares");
            System.out.println("6. Ventas diarias");
            System.out.println("7. Números hasta negativo");
            System.out.println("8. Tabla de multiplicar");
            System.out.println("9. Factorial");
            System.out.println("10. Positivos, negativos y ceros");
            System.out.println("11. Promedio de 20 estudiantes");
            System.out.println("12. Fibonacci");
            System.out.println("13. Mayor y menor");
            System.out.println("14. Suma pares 1-200");
            System.out.println("15. Número primo");
            System.out.println("16. Salir");
            
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;

                case 2:
                    ejercicio2();
                    break;

                case 3:
                    ejercicio3();
                    break;

                case 4:
                    ejercicio4();
                    break;

                case 5:
                    ejercicio5();
                    break;

                case 6:
                    ejercicio6();
                    break;

                case 7:
                    ejercicio7();
                    break;

                case 8:
                    ejercicio8();
                    break;

                case 9:
                    ejercicio9();
                    break;

                case 10:
                    ejercicio10();
                    break;

                case 11:
                    ejercicio11();
                    break;

                case 12:
                    ejercicio12();
                    break;

                case 13:
                    ejercicio13();
                    break;

                case 14:
                    ejercicio14();
                    break;

                case 15:
                    ejercicio15();
                    break;                    

                case 16:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
            
        } while (opcion != 16); 
    }
    
}
public static void ejercicio13() {
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int numero;
    for (int i = 1; i <= 10; i++) {
}
