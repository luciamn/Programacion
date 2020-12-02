package Sesion07;
import java.util.Scanner;

public class EJ04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int contador = 0;
        while(contador < 20){
            if(num % 5== 0){
                System.out.print(num + " ");
                contador++;
            }
            num = num +1;

        }

    }
}
