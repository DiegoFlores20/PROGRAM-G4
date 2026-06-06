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
            
        } while (opcion != 16); 
    }
    
}
