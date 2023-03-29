package ejercicio_6;
import ejercicio_6.Puntos;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int opcion;
        boolean existenPuntos = false;
        boolean bucle = true;
        Puntos puntos = new Puntos();
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Ingresar puntos");
            System.out.println("2)- Mostrar distancia entre los puntos");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingrese el primer punto");
                    System.out.print("x1: ");
                    puntos.setX1(entrada.nextDouble());
                    System.out.print("y1: ");
                    puntos.setY1(entrada.nextDouble());
                    System.out.println("Ingrese el segundo punto");
                    System.out.print("x2: ");
                    puntos.setX2(entrada.nextDouble());
                    System.out.print("y2: ");
                    puntos.setY2(entrada.nextDouble());
                    existenPuntos = true;
                }
                case 2: {
                    if(!existenPuntos){
                        System.out.println("Lo siento, primero debe ingresar los puntos.");
                    }else {
                        System.out.println("La distancia entre los puntos es de: " + puntos.distancia());
                    }
                    break;
                }
                case 0: {
                    bucle = false;
                    break;
                }
                default: {
                    System.out.println("Debe ingresar una opción correcta");
                    break;
                }
            }
        }while(bucle);
    }
    
}
