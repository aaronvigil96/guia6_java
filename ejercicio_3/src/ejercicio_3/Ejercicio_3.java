
package ejercicio_3;

import java.util.Scanner;
import entidad.Operacion;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int opcion;
        boolean numeros = false;
        Scanner entrada = new Scanner(System.in);
        
        Operacion operacion = new Operacion();
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Ingresar dos numeros");
            System.out.println("2)- Sumar");
            System.out.println("3)- Restar");
            System.out.println("4)- Multiplicar");
            System.out.println("5)- Dividir");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    operacion.crearOperacion();
                    System.out.println("---------------------");
                    System.out.println("Numeros ingresados");
                    System.out.println("---------------------");
                    numeros = true;
                    break;
                }
                case 2: {
                    if(numeros){
                        System.out.println("---------------------------------------------");
                        System.out.println("La suma de " + operacion.getNumA() + " + " + operacion.getNumB() +  " es: " + operacion.sumar());
                        System.out.println("---------------------------------------------");
                    }else{
                        operacion.mensajeError();
                    }
                    break;
                }
                case 3: {
                    if(numeros){
                        System.out.println("---------------------------------------------");
                        System.out.println("La resta de " + operacion.getNumA() + " - " + operacion.getNumB() +  " es: " + operacion.restar());
                        System.out.println("---------------------------------------------");
                    }else{
                        operacion.mensajeError();            
                    }
                    break;
                }
                case 4: {
                    if(numeros){
                        int resultado = operacion.multiplicar();
                        if(resultado == 0){
                            break;
                        }else{
                        System.out.println("---------------------------------------------");
                        System.out.println("La multiplicación de " + operacion.getNumA() + " * " + operacion.getNumB() +  " es: " + operacion.multiplicar());
                        System.out.println("---------------------------------------------");
                        }
                    }else{
                        operacion.mensajeError();
                    }
                    break;
                }
                case 5: {
                    if(numeros){
                        if(operacion.division() == 0.0){
                            System.out.println("-------------------------------------");
                            System.out.println("No se puede dividir por 0");
                            System.out.println("-------------------------------------");
                        }else{
                            System.out.println("---------------------------------------------");
                            System.out.println("La division de " + operacion.getNumA() + " / " + operacion.getNumB() +  " es: " + operacion.division());
                            System.out.println("---------------------------------------------");
                        }
                    }else
                        operacion.mensajeError();
                }
            }
        }while(opcion != 0);
        System.out.println("----------------------------------------");
        System.out.println("Gracias por utilizar la calculadora 2.0");
        System.out.println("----------------------------------------");
    }
    
}
