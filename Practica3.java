import java.util.Scanner;
public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Sobre que estructura quieres resolver los ejercicios");
        System.out.println("1. if");
        System.out.println("2. switch");
        int estructura = sc.nextInt();
        switch (estructura){
            default:
                System.out.println("Opcion incorrecta");
                break;

            case 1:
                System.out.println("Introduce el número de ejercicio que quieres que resulva:");
                System.out.println("1. Par-impar");
                System.out.println("2. Sueldo anual");
                System.out.println("5. Triangulo válido");
                System.out.println("6. Fiesta de marmotas");
                System.out.println("7. Notas");

                int valor = sc.nextInt();
                if (valor==1){
                    System.out.println("Introduce un número: ");
                    int n = sc.nextInt();
                    if (n%2 == 0){
                        System.out.println("El número introducido " + "(" +  n + ")" + " es par");
                    } else {
                        System.out.println("El número introducido " + "(" +  n + ")" + " es impar");
                    }
                }else if (valor==2){
                    System.out.println("Introduce el sueldo anual: ");
                    int sueldo = sc.nextInt();
                    if (sueldo > 9000){
                        System.out.println("Debe pagar impuestos");
                    } else {
                        System.out.println("No Debe pagar impuestos");
                    }
                }else if (valor==5){
                    System.out.println("Introduce el primer numero:");
                    int A = sc.nextInt();
                    System.out.println("Introduce el segundo numero:");
                    int B = sc.nextInt();
                    System.out.println("Introduce el tercer numero:");
                    int C = sc.nextInt();
                    if ((A + B > C) && (A + C > B) && (B + C > A)){
                        System.out.println("Si");
                    } else {
                        System.out.println("No");
                    }
                }else if (valor==6){
                    System.out.println("introduce el numero de tazas de mantequilla de cacahuetes: ");
                    int m = sc.nextInt();
                    System.out.println("¿Es finde semana?: ");
                    boolean findesemana=((m>=15) && (m<=25));
                    System.out.println(findesemana);
                    System.out.println("¿Tuvo exito la fiesta?: ");
                    boolean exito=(m>=10 && m<=25);
                    System.out.println(exito);
                }else if (valor==7){
                    System.out.println("Introduce la nota númerica: (entre 0 y 10) ");
                    int nota = sc.nextInt();
                    if (nota>=0 && nota<3){
                        System.out.println("MD");
                    }
                    if (3<=nota && nota<5){
                        System.out.println("INS");
                    }
                    if (5<=nota && nota<6){
                        System.out.println("SUF");
                    }
                    if (6<=nota && nota<7){
                        System.out.println("B");
                    }
                    if (7<=nota && nota<9){
                        System.out.println("N");
                    }
                    if (9<=nota && nota<=10){
                        System.out.println("SB");
                    }
                } else {
                    System.out.println("El ejercicio no forma parte de la práctica");
                }
                break;
            case 2:
                System.out.println("Introduce el número de ejercicio que quieres que resulva:");
                System.out.println("2. Que lenguaje estudia");
                System.out.println("3. Cadena de texto");
                System.out.println("4. Harry Potter");
                System.out.println("5. Dirección");
                int valor2= sc.nextInt();
                if(valor2==2){
                    System.out.println("Que lenguaje de programación estudias");
                    System.out.println("1. Java");
                    System.out.println("2. Koltin");
                    System.out.println("3. Scala");
                    System.out.println("4.Phyton");
                    int l = sc.nextInt();
                    switch (l){
                        case 1:
                            System.out.println("Si");
                            break;
                        case 2:
                            System.out.println("No");
                            break;
                        case 3:
                            System.out.println("No");
                            break;
                        case 4:
                            System.out.println("No");
                            break;

                    }
                } else if(valor2==3){
                    String a = "seis";
                    switch(a){

                        case "uno":
                            System.out.println("1");
                            break;
                        case "dos":
                            System.out.println("2");
                            break;
                        case "tres":
                            System.out.println("3");
                            break;
                        case "cuatro":
                            System.out.println("4");
                            break;
                        case "cinco":
                            System.out.println("5");
                            break;
                        case "seis":
                            System.out.println("6");
                            break;
                        case "siete":
                            System.out.println("7");
                            break;
                        case "ocho":
                            System.out.println("8");
                            break;
                        case "nueve":
                            System.out.println("9");
                            break;
                    }


                } else if(valor2==4){
                    System.out.println("Valores de la casa: ");
                    int casa = sc.nextInt();
                    int Gryffindor = 1;
                    int Hufflepuff = 2;
                    int Slytherin = 3;
                    int Ravenclaw = 4;
                    switch (casa){
                        case 1:
                            System.out.println("Gryffindor: Valentia");
                            break;
                        case 2:
                            System.out.println("Hufflepuff: Lealtad");
                            break;
                        case 3:
                            System.out.println("Slytherin: Astucia");
                            break;
                        case 4:
                            System.out.println("Ravenclaw: Intelecto");
                            break;
                        default:
                            System.out.println("no es una casa válida");
                    }


                }else if(valor2==5){
                    System.out.println("Dime el numero de dirreción");
                    int d = sc.nextInt();
                    switch (d){
                        case 0:
                            System.out.println("No mover");
                            break;
                        case 1:
                            System.out.println("Subir");
                            break;
                        case 2:
                            System.out.println("Bajar");
                            break;
                        case 3:
                            System.out.println("Mover a la izquierda");
                            break;
                        case 4:
                            System.out.println("Mover a la derecha");
                            break;
                        default:
                            System.out.println("error");
                            break;
                    }
                }else {
                    System.out.println("El ejercicio no forma parte de la práctica");
                }

        }



    }
}