package jiji;
import java.util.Scanner;
public class Jiji {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
        
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
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
        } while (opcion != 16); 
    }
    
}
