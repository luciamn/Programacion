package Sesion04;
import java.util.Scanner;
public class Ejemplo02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Mayor de edad.");
        } else {
            System.out.println("Menor de edad");
        }
        System.out.println("Ya esta");
    }
}

