import java.util.Scanner;

public class programa_par {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = lector.nextInt();

        // Lógica del "si es par"
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        lector.close(); 
    }
}
