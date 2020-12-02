package Sesion04;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sueldo anual: ");
        int sueldo = sc.nextInt();
        if (sueldo > 9000){
            System.out.println("Debe pagar impuestos");
        } else {
            System.out.println("No Debe pagar impuestos");
        }

    }

}
