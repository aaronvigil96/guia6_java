package ejercicio_5;

import java.util.Scanner;
import entidad.Cancion;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cancion cancion = new Cancion();
        int opcion, subopcion;
        String titulo, autor;
        boolean estado = false;
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Ingresar cancion");
            System.out.println("2)- Mostrar cancion");
            System.out.println("3)- Ingresar...");
            System.out.println("4)- Mostrar...");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingresá el titulo de la canción");
                    entrada.skip("\n");
                    titulo = entrada.nextLine();
                    System.out.println("Ingresá el autor de la canción");
                    autor = entrada.nextLine();
                    cancion.crearCancion(titulo, autor);
                    System.out.println("------------------------------");
                    System.out.println("Canción agregada correctamente");
                    System.out.println("------------------------------");
                    estado = true;
                    break;
                }
                case 2: {
                    if(!estado){
                        cancion.mensajeError();
                    }else {
                        cancion.mostrarCancion();
                    }
                    break;
                }
                case 3: {
                    do{
                        System.out.println("Ingresar...");
                        System.out.println("1)- Ingresar titulo");
                        System.out.println("2)- Ingresar autor");
                        System.out.println("0)- Salir");
                        subopcion = entrada.nextInt();
                        switch(subopcion){
                            case 1: {
                                System.out.println("Ingresa el titulo...");
                                entrada.skip("\n");
                                titulo = entrada.nextLine();
                                cancion.setTitulo(titulo);
                                System.out.println("-------------------------");
                                System.out.println("Titulo agregado con éxito");
                                System.out.println("-------------------------");
                                break;
                            }
                            case 2: {
                                System.out.println("Ingresa el autor...");
                                entrada.skip("\n");
                                autor = entrada.nextLine();
                                cancion.setAutor(autor);
                                System.out.println("-------------------------");
                                System.out.println("Autor agregado con éxito");
                                System.out.println("-------------------------");
                                break;
                            }
                            case 0: {
                                break;
                            }
                        }
                    }while(subopcion != 0);
                    if(!"".equals(cancion.getAutor()) && !"".equals(cancion.getAutor())){
                        estado = true;
                    }
                    break;
                }
                case 4: {
                    do{
                        System.out.println("Mostrar...");
                        System.out.println("1)- Mostrar titulo");
                        System.out.println("2)- Mostrar autor");
                        System.out.println("0)- Salir");
                        subopcion = entrada.nextInt();
                        switch(subopcion){
                            case 1: {
                                if(cancion.getTitulo().equals("")){
                                    System.out.println("--------------------------------");
                                    System.out.println("Debe ingresar un titulo, primero");
                                    System.out.println("--------------------------------");
                                }else{
                                    System.out.println("-----------------------------------");
                                    System.out.println("El titulo es " + cancion.getTitulo());
                                    System.out.println("-----------------------------------");
                                }
                                break;
                            }
                            case 2: {
                                if(cancion.getAutor().equals("")){
                                    System.out.println("--------------------------------");
                                    System.out.println("Debe ingresar un autor, primero");
                                    System.out.println("--------------------------------");
                                }else{
                                    System.out.println("-----------------------------------");
                                    System.out.println("El autor es " + cancion.getAutor());
                                    System.out.println("-----------------------------------");
                                }
                                break;
                            }
                            case 0: {
                                break;
                            }
                        }
                    }while(subopcion != 0);
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("Gracias por utilizar la aplicación");
    }
    
}
