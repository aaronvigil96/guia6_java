/*
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
    El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/

package ejercicio_10.entidades;

import java.util.Scanner;

public class Menu {
    //Atributos
    Scanner entrada = new Scanner(System.in);
    Empleado empleado = new Empleado();
    private int opcion;
    
    //Constructores
    public Menu(){  
    }
    
    //Método
    public void mostrarMenu(){
        System.out.println("¿Que desea hacer?");
        System.out.println("1)- Crear empleado");
        System.out.println("2)- Mostrar empleado");
        System.out.println("3)- Calcular aumento");
        System.out.println("0)- Salir");
        this.opcion = entrada.nextInt();
    }
    
    public void opcionMenu(){
        switch(this.opcion){
            case 1:{
                crearEmpleado();
            }
            case 2:{
                
            }
            case 3:{
                
            }
            case 0:{
                break;
            }
            default: {
                System.out.println("Debe ingresar una opción correcta");
                break;
            }
        }
        if(this.opcion != 0){
            mostrarMenu();
        }else {
            System.out.println("¿Está seguro que desea salir?");
            System.out.println("1)- Si");
            System.out.println("2)- No");
            opcion = entrada.nextInt();
            if(this.opcion == 2){
                mostrarMenu();
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Gracias por utilizar el programa");
        System.out.println("--------------------------------");
    }
    
    public void crearEmpleado(){
        System.out.println("Ingresá el nombre del empleado");
        entrada.skip("\n");
        empleado.setNombre(entrada.nextLine());
        System.out.println("Ingresá la edad del empleado");
        empleado.setEdad(entrada.nextInt());
        System.out.println("Ingresá el salario del empleado");
        empleado.setSalario(entrada.nextInt());
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Empleado creado con éxito");
        System.out.println("-------------------------");
        System.out.println("");
    }
}
