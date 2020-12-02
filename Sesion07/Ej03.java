package Sesion07;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        int maximoTemporal = num;
        while (num != 0){
            if(num > maximoTemporal){
                maximoTemporal = num;
            }
            System.out.println("Siguiente numero");
            num = sc.nextInt();;
        }
        System.out.println("El mayor de los numeros es: " + maximoTemporal);


    }
}
