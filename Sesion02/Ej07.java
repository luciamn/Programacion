package Sesion02;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres digitos");
        int n = sc.nextInt();
        int centenas = (n / 100);
        int decenas = (n % 100) / 10;
        int unidades = (n % 100) % 10;
        int nAlReves = (unidades * 100 + decenas  * 10 + centenas);
        System.out.println(nAlReves);




    }
}
