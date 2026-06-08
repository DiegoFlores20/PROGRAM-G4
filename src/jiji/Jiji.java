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
    
public static int sumarDosNumeros(int a, int b) {
    return a + b;
}
public static int restarDosNumeros(int a, int b) {
    return a - b;
}
public static int multiplicarDosNumeros(int a, int b) {
    return a * b;
}
public static double dividirDosNumeros(double a, double b) {
    if (b == 0) return 0;
    return a / b;
}
public static int calcularCuadrado(int numero) {
    return numero * numero;
}

// 1
public static void ejercicio1() {

    String contrasenaCorrecta = "Secreta123";
    String contrasenaIngresada;
    int intentos = 0;

    System.out.println("--- Sistema para ingreso ---");

    do {
        System.out.print("Ingrese su contraseña correctamente: ");
        contrasenaIngresada = leer.next();
        intentos++;

        if (!contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.println("La contraseña no es la correcta. Vuelva cuando se haya acordado.");
        }

    } while (!contrasenaIngresada.equals(contrasenaCorrecta));

    System.out.println("\n¡Acceso concedido, al fin te acordaste!");
    System.out.println("Número total de intentos necesitados: " + intentos);
}

// 2
public static void ejercicio2() {

    int numero;
    int cantidad = 0;
    int suma = 0;
    double promedio;

    System.out.println("Por favor ingresar solo números enteros positivos.");
    System.out.println("Ingrese un número negativo para finalizar.");

    do {
        System.out.print("Ingrese un número entero positivo: ");
        numero = leer.nextInt();

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
    System.out.println("Cantidad de números ingresados: " + cantidad);
    System.out.println("Sumatoria total: " + suma);
    System.out.println("Promedio: " + promedio);
}

// 3
public static void ejercicio3() {

    double nota;

    System.out.print("Ingrese una nota entre 0 y 10: ");
    nota = leer.nextDouble();

    while (nota < 0 || nota > 10) {

        System.out.println("Error. La nota debe estar entre 0 y 10.");
        System.out.print("Ingrese nuevamente una nota válida: ");
        nota = leer.nextDouble();
    }

    System.out.println("Excelente, la nota válida registrada es: " + nota);
}

// 4
public static void ejercicio4() {

    final String CLAVE_CORRECTA = "4321";
    final int MAX_INTENTOS = 3;

    String claveIngresada;
    int intentos = 0;
    boolean accesoConcedido = false;

    System.out.println("=== BIENVENIDO AL SISTEMA DEL BANCO ===");

    while (intentos < MAX_INTENTOS && !accesoConcedido) {

        System.out.print("Ingrese su clave de acceso: ");
        claveIngresada = leer.next();

        intentos++;

        if (claveIngresada.equals(CLAVE_CORRECTA)) {
            accesoConcedido = true;
        } else {

            int intentosRestantes = MAX_INTENTOS - intentos;

            System.out.println("La clave ingresada es incorrecta.");

            if (intentosRestantes > 0) {
                System.out.println("Le quedan " + intentosRestantes + " intentos.");
            }
        }
    }

    if (accesoConcedido) {
        System.out.println("\n¡Bienvenido a tu cuenta bancaria!");
        System.out.println("Acceso concedido exitosamente.");
    } else {
        System.out.println("\nHa superado el límite de intentos.");
        System.out.println("Acceso bloqueado por seguridad.");
    }
}
public static void ejercicio5() {
        int numero, pares = 0, impares = 0, total = 0, ultimoPar = 0;
        System.out.println("Numeros pares e impares ");
        do {
            System.out.println("Ingrese un numero (0 para terminar): ");
            numero = leer.nextInt(); 
            if (numero != 0) {
                total++;
                if (numero % 2 == 0) {
                    pares++;
                    ultimoPar = numero;
                } else impares++;
            }
        } while (numero != 0);
        System.out.println("pares: " + pares + " ; impares: " + impares);
        System.out.println("total ingresados: " + total);
        if (total > 0) { 
            System.out.println("% pares: " + (pares * 100 / total) + "%");
            System.out.println("% impares: " + (impares * 100 / total) + "%");
        }
        System.out.println("Ultimo par ingresado: " + ultimoPar);
        
        
    }
public static void ejercicio6() {
    double venta, total = 0, ventaMaxima = 0, ventaMinima = Double.MAX_VALUE;
    int cantidad = 0;
    System.out.println("Ventas diarias");
    do {
        System.out.println("Ingrese una venta (0 para terminar): ");
        venta = leer.nextDouble();
        if (venta != 0) {
            total += venta;
            cantidad++;
            if (venta > ventaMaxima)
                ventaMaxima = venta;
            if (venta < ventaMinima)
                ventaMinima = venta;
        }

    } while (venta != 0);
    System.out.println("Total: " + total + " ; Ventas: " + cantidad);
    if (cantidad > 0)
        System.out.println("Promedio de ventas: " + (total / cantidad));
    System.out.println("Venta mas alta:" + ventaMaxima);
    System.out.println("Venta mas baja: " + (cantidad == 0 ? 0 : ventaMinima));
    
}
public static void ejercicio7() {
        int numero, cantidad = 0, suma = 0, mayor = Integer.MIN_VALUE;
        System.out.println("Hasta numero negativo");
        do {
            System.out.println("Ingrese un numero (negativo para terminar): ");
            numero = leer.nextInt();
            if (numero >= 0){
                cantidad++;
                suma += numero;
                if (numero > mayor) 
                    mayor = numero;
                
            }
        } while (numero >= 0);
        System.out.println("cantidad de numeros : " + cantidad + " ; suma total: " + suma);
        if (cantidad > 0)
            System.out.println("Promedio general:" + ((double) suma / cantidad));
        System.out.println("numero mayor ingresado: " + (cantidad == 0 ? 0 : mayor));
        System.out.println("Poceso terminado por numero negativo: ");
        System.out.println("suma de los numeros");
        }

public static void ejercicio8() {
        int n, limite, sumaTotal = 0;
        System.out.println("Tabla de multiplicar");
        System.out.println("Ingrese un numero positivo: ");
        n = leer.nextInt();
        System.out.println("Ingrese hasta que numero desea la tabla: ");
        limite = leer.nextInt();
        for (int i = 1; i <= limite; i++) {
            int resultado = n * i;
            sumaTotal += resultado;
            System.out.println(n + " x " + i + " = " + resultado);
        }
        System.out.println("Suma de todos los resultados: " + sumaTotal);
        System.out.println("resultados impares de la tabla");
        for (int i = 1; i <= limite; i++) {
            if ((n*i)%2 !=0)
                System.out.println(n + " x " + i + " = " + (n*i));
        }
}

public static void ejercicio9() {
    int num;
        long factorial = 1;
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
         for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
}       

public static void ejercicio10() {
    int numero;
    int positivos = 0, negativos = 0, ceros = 0;
    for (int i = 1; i <= 15; i++){
        System.out.println("Ingrese un numero"+i+":");
        numero = leer.nextInt();
        if (numero > 0){
            positivos++;  
        }else if (numero < 0){
            negativos++;
        }else{
            ceros++;
        }
    }
    System.out.println("Positivos: " + positivos);
    System.out.println("Negativos: " + negativos);
    System.out.println("Ceros: " + ceros);
}

public static void ejercicio11() {
    double nota, suma=0;
    double promedio;
    for (int i =1;i <=20; i++){
        System.out.println("Ingrese la calificacion del estudiante"+i+":");
        nota = leer.nextDouble();
        suma += nota;      
    }
    promedio=suma/20;
    System.out.println("El promedio general del curso es: "+promedio);
}

public static void ejercicio12() {
    int n;
    int a = 0, b= 1, siguiente;
    
    System.out.println("Ingrese la cantidad de terminos: ");
    n = leer.nextInt();
    
    System.out.println("Secuencia Fibonacci: ");
    for (int i = 1; i <= n; i++){
        System.out.println(a+"");
        
        siguiente=a+b;
        a=b;
        b=siguiente;
    }
}

public static void ejercicio13() {
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int numero;
    for (int i = 1; i <= 10; i++) {
        System.out.print("Ingrese número: ");
        numero = leer.nextInt();
        
        if (numero > mayor)
        mayor = numero;
        
        if (numero < menor)
        menor = numero;
    }
    System.out.println("Mayor: " + mayor);
    System.out.println("Menor: " + menor);
}

public static void ejercicio14() {
    int suma = 0;
    for (int i = 1; i <= 200; i++) {
        if (i % 2 == 0)
            suma += i;
    }
    System.out.println("Suma pares: " + suma);
}

public static void ejercicio15() {
        int numero;
        int divisores = 0;

        System.out.print("Ingrese número: ");
        numero = leer.nextInt();
        
        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0)
                divisores++;         
        }
        if (divisores == 2)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");        
}
}
