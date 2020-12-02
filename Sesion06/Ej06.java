package Sesion06;
import java.util.Scanner;
public class Ej06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int a = sc.nextInt();
        System.out.println("introduce un numero");
        int b = sc.nextInt();

        int menor = a;
        int mayor = b;

        if(a>b){
            menor = b;
            mayor = a;
        }


        int suma = 0;
        for(int i=menor; i <=mayor; i++){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
