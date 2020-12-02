package Sesion07;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 0;
        do {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            contador++;
        }while (num != 0);
        System.out.println("Has introducido " + (contador - 1) + " numeros");

    }
}

