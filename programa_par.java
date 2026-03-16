import java.util.Scanner; // Importamos la herramienta para leer datos

public class programa_par {
    public static void main(String[] args) {
        // Creamos el lector de consola
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = lector.nextInt(); // Guardamos lo que el usuario escribe

        // Lógica del "si es par"
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        lector.close(); // Cerramos el lector
    }
}
