import java.util.Scanner;

public class Semana2edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita nombre
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        //Solicitar año de nacimiento
        System.out.println("Ingresa tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        //Calcular edad aproximada
        int anioActual = 2025;
        int edad =anioActual - anioNacimiento;

        //Mostrar resultado
        System.out.println("Hola " + nombre + ", tu edad aproximada es: " + edad + " años.");

        scanner.close();
    }
}
