package Sesion07;
import java.io.OutputStream;
import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 100");
        int numIntroducido = sc.nextInt();
        int numAleatorio = ((int) (Math.random() * 100 +1));
        //variables
        boolean encontrado = false;
        boolean seguir = true;
        while(encontrado == false && seguir==true){

            if(numIntroducido == 0){
                System.out.println("Te has rendido el numero introducido era: " + numAleatorio);
                seguir = false;
            }

            if(numIntroducido <1 || numIntroducido >100){
                System.out.println("Fuera de rango");
                numIntroducido = sc.nextInt();
            }

            if (numIntroducido < numAleatorio){
                System.out.println("El numero a encontar es mayor");
                numIntroducido = sc.nextInt();
            } else {
                System.out.println("El numero a encontar es menor");
                numIntroducido = sc.nextInt();
            }


            if(numIntroducido == numAleatorio){
                System.out.println("Felicidades has encontrado el numero");
                encontrado = true;
            }



        }

        //mientras no encontrado=false y seguir=true seguir preguntando
            //comprobar casos con numIntroducido
                //si me rindo
                    //"Te has rendido" y seguir = false
                //si estoy fuera del rango (<1 0 >100)
                    //"Fuera de rango" y seguir preguntando
                //si el numero es menor que el aleatorio
                    //"menor" y seguir preguntando
                //si el nunmero es mayor que el aleatorio
                    //"Mayor" y seguir preguntando
                //si son iguales
                    //"Has acertado" , encontrado=true
    }

    }
