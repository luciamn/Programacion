package Sesion07;

public class Ejemplo {
    public static void main(String[] args){
       for (int i = 10; i>=0; i--){
           for (int j = 0; j <=10; j++){
               System.out.print("# ");
              if(i == j){
                  break;
              }
           }
           System.out.println();
       }
    }
}
