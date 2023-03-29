package ejercicio_7;
import ejercicio_7.Juego;
import java.util.Scanner;


public class Ejercicio_7 {
    public static void main(String[] args) {
        int opcion;
        Juego juego = new Juego();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a adivina, adivinador...");
        do{ 
            System.out.println("1)- Iniciar juego...");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingresá el nombre del jugador 1(uno)");
                    entrada.skip("\n");
                    juego.setJugador1(entrada.nextLine());
                    System.out.println("Ingresa el nombre del jugador 2(dos)");
                    juego.setJugador2(entrada.nextLine());
                    System.out.println("Ingresa el numero que debe adivinar el jugador 2");
                    juego.setNumero(entrada.nextInt());
                    System.out.println("Ingresá el numero de intentos permitidos");
                    juego.setIntentos(entrada.nextInt());
                    juego.iniciar_juego();
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("------------------------------------------------");
                    System.out.println("Error, el numero " + opcion + " no es una opción");
                    System.out.println("------------------------------------------------");
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("--------------------");
        System.out.println("Te esperamos pronto.");
        System.out.println("--------------------");
    }
    
}
