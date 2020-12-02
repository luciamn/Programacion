package Sesion05;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que lenguaje de programacion estas etudiando?");
        System.out.println("Java");
        int java = 1;
        System.out.println("Koltin");
        int koltin = 2;
        System.out.println("Scala");
        int Scala = 3;
        System.out.println("Python");
        int Python = 4;
        int val = sc.nextInt();

        if (val==1){
            System.out.println("Si");
        } else {
            System.out.println("No");
        }



    }
}