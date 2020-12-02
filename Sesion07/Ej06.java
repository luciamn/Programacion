package Sesion07;
import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num = 1;
        while(suma<125){
            suma = suma + num;
            num++;
        }
        System.out.println(num);

    }
}
