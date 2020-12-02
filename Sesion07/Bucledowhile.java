package Sesion07;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class Bucledowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Introduce un numero:");
            valor = sc.nextInt();
            System.out.println("Has introducido un: " + valor);
        } while(valor !=0 );
        System.out.println("Despues del bucle: " + valor);
    }
}
