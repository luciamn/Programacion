package Sesion07;
import java.util.Scanner;
public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int contador = 0;
        while (contador < 50) {
            if (num % 5 == 0) {
                System.out.print(num + " ");
                contador++;
                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
            num = num + 1;

        }
    }
}
