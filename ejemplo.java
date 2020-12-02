import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un numero del 1 al 100");
        int numIntroducido = sc.nextInt();
        int numAleatorio = ((int) (Math.random() * 100 + 1));
        //variables
        boolean encontrado = false;
        boolean seguir = true;
        while (encontrado == false && seguir == true) {

            if (numIntroducido == 0) {
                System.out.println("Te has rendido el numero introducido era: " + numAleatorio);
                seguir = false;
                System.exit(0);
            }

            if (numIntroducido < 1 || numIntroducido > 100) {
                System.out.println("Fuera de rango");
                numIntroducido = sc.nextInt();
            }

            if (numIntroducido < numAleatorio) {
                System.out.println("El numero a encontar es mayor que " + numIntroducido);
                numIntroducido = sc.nextInt();
            } else {
                System.out.println("El numero a encontar es menor que " + numIntroducido);
                numIntroducido = sc.nextInt();
            }


            if (numIntroducido == numAleatorio) {
                System.out.println("Felicidades has encontrado el numero");
                encontrado = true;
            }

        }
    }
}
