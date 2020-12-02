package Sesion03;
import java.util.Scanner;
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        boolean enRango = num1 < 10 && num1 > 0;
        System.out.println(enRango);
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        int num3 = sc.nextInt();


    }

    }
