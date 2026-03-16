import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números de la serie quieres ver?: ");
        int n = sc.nextInt();
        
        int a = 0; // Primer número
        int b = 1; // Segundo número
        
        System.out.println("Serie Fibonacci de " + n + " términos:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // Calculamos el siguiente número sumando los dos anteriores
            int siguiente = a + b;
            // Actualizamos las variables para la próxima iteración
            a = b;
            b = siguiente;
        }
        
        sc.close();
    }
}
