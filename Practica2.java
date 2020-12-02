import java.util.Scanner;
public class Practica2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int n2 = sc.nextInt();
        if (n1>0 && n2>0){
            System.out.println("");
        } else {
            System.out.println("No se puede realizar la operacion");
            System.exit(0);
        }
        System.out.println("Introduce la operación");
        int n3 = sc.next().charAt(0);
        if (n3 != '+' && n3 != '-' && n3 != '*' && n3 != '/'){
            System.out.println("No se puede realizar la operacion");
            System.exit(0);
        } else {
            System.out.println("");
        }

        if (n3 =='+'){
            System.out.println("El resultado de la operación es: " + (n1+n2));
        } else if (n3 == '-'){
            if (n1 > n2){
                System.out.println("El resultado de la operación es: " + (n1-n2));
            } else {
                System.out.println("El resultado de la operación es: " + (n2-n1));
            }
        } else if (n3 == '*'){
            System.out.println("El resultado de la operación es: " + n1*n2);
        } else if (n3 == '/'){
            if (n1>n2){
                System.out.println("El resultado de la operación es: " + n1/n2);
            } else {
                System.out.println("El resultado de la operación es: " + n2/n1);
            }
        }


    }
}
