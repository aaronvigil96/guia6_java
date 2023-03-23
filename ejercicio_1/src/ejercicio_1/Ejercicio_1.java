package ejercicio_1;

import java.util.Scanner;
import Entidad.Libro;

public class Ejercicio_1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String titulo, autor;
       int paginas, opcion, isbn;
       
       Libro libro = new Libro();
       
       do{
           System.out.println("¿Que desea hacer?");
           System.out.println("1)- Crear Libro");
           System.out.println("2)- Mostrar Libro");
           System.out.println("0)- Salir");
           opcion = entrada.nextInt();
           switch(opcion){
               case 1: {
                   System.out.println("Ingresá el numero del ISBN");
                   isbn = entrada.nextInt();
                   System.out.println("Ingresá el titulo del libro:");
                   entrada.skip("\n");
                   titulo = entrada.nextLine();
                   System.out.println("Ingresá el autor del libro");
                   autor = entrada.nextLine();
                   System.out.println("Ingresá la cantidad de número de páginas");
                   paginas = entrada.nextInt();
                   libro.setLibro(isbn, titulo, autor, paginas);
                   System.out.println("-----------------------");
                   System.out.println("Libro creado con éxito");
                   System.out.println("-----------------------");
                   break;
                }
               case 2: {
                   System.out.println("---------------------------");
                   System.out.println("ISBN: " + libro.getIsbn());
                   System.out.println("Titulo: " + libro.getTitulo());
                   System.out.println("Autor: " + libro.getAutor());
                   System.out.println("Paginas: " + libro.getPaginas());
                   System.out.println("----------------------------");
                   break;
               }
        }
       }while(opcion != 0);
       System.out.println("Gracias por utilizar la aplicación");
    }
    
}
