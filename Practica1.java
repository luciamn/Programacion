import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Momento Inicial:");
        System.out.println("=============");
        System.out.println("Introduce la hora");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos = sc.nextInt();
        int segundostotales = ((hora * 3600) + (minutos *60) +(segundos));



        System. out.println("Momento final:");
        System.out.println("=============");
        System.out.println("Introduce la hora");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos2 = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos3 = sc.nextInt();
        int segundostotales2 = ((hora1 * 3600) + (minutos2 * 60) + (segundos3));


        int SegundosTotales = ((segundostotales2 - segundostotales));

        int segundosFinales = (SegundosTotales % 60);
        int segundosEntreSesenta = (SegundosTotales / 60);
        int minutosFinales = (segundosEntreSesenta % 60);
        int horasFinales = (segundosEntreSesenta / 60);

        System.out.println("Datos introducidos: momento inicial: " + hora + ":" + minutos + ":" + segundos + "   " + "momento final: " + hora1 + ":" + minutos2 + ":" + segundos3);
        System.out.println( "La diferencia entre los dos momentos es de " + horasFinales + ":" + minutosFinales + ":" + segundosFinales);

    }



}

