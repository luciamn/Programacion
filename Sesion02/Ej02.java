package Sesion02;
import java.util.Scanner;
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Introduce el primer número");
       int num1 = sc.nextInt();
       System.out.println("Introduce el segundo número");
       int num2 = sc.nextInt();
       System.out.println("Introduce el tercer número");
       int num3 = sc.nextInt();
       System.out.println("Introduce el cuarto número");
       int num4 = sc.nextInt();
       //Calculo sumo de num1 y num2
        int suma = num1 +num2;
        int producto = num3 * num4;
        //Muestro el resultado
        System.out.println("La suma de " + num1 + " y " + num2  + "es:" + suma);
        System.out.println("El producto de " + num3 + " y " + num4  + "es:" + producto);

    }


    }

