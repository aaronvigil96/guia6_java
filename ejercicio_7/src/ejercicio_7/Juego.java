/*
    Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
    El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
    El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
    El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
    Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
*/
package ejercicio_7;
import java.util.Scanner;

public class Juego {
    
    //Atributos
    private Scanner entrada = new Scanner(System.in);
    private String jugador1;
    private String jugador2;
    private int numero;
    private int intentos;
    
    //Constructor
    Juego(){
     
    //Métodos
    }
    public String getJugador1(){
        return jugador1;
    }
    public String getJugador2(){
        return jugador2;
    }
    public int getNumero(){
        return numero;
    }
    public int getIntentos(){
        return intentos;
    }
    
    public void setJugador1(String jugador){
        this.jugador1 = jugador;
    }
    public void setJugador2(String jugador){
        this.jugador2 = jugador;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setIntentos(int intentos){
        this.intentos = intentos;
    }
    public String iniciar_juego(){
        int numeroJugador;
        boolean gano = false;
        do{
            System.out.println("Ingresa el numero a adivinar");
            numeroJugador = entrada.nextInt();
            if(numeroJugador == this.numero){
                gano = true;
                break;
            }else {
                intentos--;
                System.out.println("Intentos disponibles: " + intentos);   
            }
        }while(this.intentos > 0);
        if(gano){
            return "Felicitaciones el jugador " + jugador2 + ", ganó";
        }else {
            return "El jugador " + jugador2 + ", perdió";
        }
    }
}
