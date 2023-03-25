package ejercicio_4;

import java.util.Scanner;
import entidad.Rectangulo;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, base, altura;
        Rectangulo rectangulo = new Rectangulo();
        boolean estado = false;
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Crear rectangulo");
            System.out.println("2)- Calcular superficie");
            System.out.println("3)- Calcular perimetro");
            System.out.println("4)- Dibujar rectangulo");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    do{
                        System.out.println("Ingresá la base");
                        base = entrada.nextInt();
                        System.out.println("Ingresá la altura");
                        altura = entrada.nextInt();
                    }while(base <= 0 || altura <= 0);
                    rectangulo.crearRectangulo(base, altura);
                    estado = true;
                    break;
                }
                case 2: {
                    if(!estado){
                        rectangulo.mensajeError();
                    }else {
                        System.out.println("------------------------------------------------");
                        System.out.println("La superficie es: " + rectangulo.superficie());
                        System.out.println("------------------------------------------------");
                    }
                    break;
                }
                case 3: {
                    if(!estado){
                        rectangulo.mensajeError();
                    }else {
                        System.out.println("------------------------------------------------");
                        System.out.println("El perimetro es: " + rectangulo.perimetro());
                        System.out.println("------------------------------------------------");
                    }
                    break;
                }
                case 4: {
                    if(!estado){
                        rectangulo.mensajeError();
                    }else {
                        rectangulo.dibujarRectangulo();
                    }
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("Gracias por utilizar el sistema");
    }
}