package entidades;

import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    Rectangulo rectangulo1 = new Rectangulo();
    int opcion;
    
    public Menu(){
    }
    
    public void mostrarMenu(){
         do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Ingresar rectangulo");
            System.out.println("2)- Mostrar area");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    ingresarRectangulo();
                    break;
                }
                case 2: {
                    mostrarArea();
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Ingresa un número válido");
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("Gracias por utilizar la aplicación");
    }
    
    public void ingresarRectangulo(){
        System.out.println("Ingresa el primer lado");
        entrada.skip("\n");
        rectangulo1.setLado1(entrada.nextInt());
        System.out.println("Ingresa el segundo lado");
        rectangulo1.setLado2(entrada.nextInt());
        rectangulo1.setEstado(true);
        System.out.println("---------------------------");
        System.out.println("Rectangulo creado con éxito");
        System.out.println("---------------------------");
    }
    
    public void mostrarArea(){
        if(rectangulo1.getEstado()){
            System.out.println("------------------------------------------");
            System.out.println("El area es: " + rectangulo1.calcular_area());
            System.out.println("------------------------------------------");
        }else{
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Primero debe ingresar un rectangulo");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }
    }
}
