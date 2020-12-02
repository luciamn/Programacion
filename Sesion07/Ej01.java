package Sesion07;
import java.util.Scanner;
public class Ej01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Introduce un numero entre 1 y 100");
            valor = sc.nextInt();
            System.out.println("Has introducido: " + valor);
        } while (valor > 100 || valor < 1 );


    }
}
