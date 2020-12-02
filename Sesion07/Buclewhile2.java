package Sesion07;

public class Buclewhile2 {
    public static void main(String[] args) {
        char letra = 'A';
        while (letra < 'Z') {
            System.out.print(letra + " ");
            letra++; // num = num -1;
        }
        System.out.println("Despues del bucle: " + letra);

    }
}
