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
    public void menu(){
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Crear empleado");
            System.out.println("2)- Mostrar empleado");
            System.out.println("3)- Calcular aumento");
            System.out.println("0)- Salir");
            this.opcion = entrada.nextInt();
            switch(this.opcion){
                case 1:{
                    crearEmpleado();
                    break;
                }
                case 2:{
                    mostrarEmpleado();
                    break;
                }
                case 3:{
                    mostrarAumento();
                    break;
                }
                case 0:{
                    salirMenu();
                    break;
                }
                default: {
                    System.out.println("Debe ingresar una opción correcta");
                    break;
                }
            }
        }while(this.opcion != 0);
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
        empleado.setEmpleado(true);
    }
    
    public void mostrarEmpleado(){
        if(empleado.getEmpleado()){
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("El empleado se llama: " + empleado.getNombre() + " tiene " + empleado.getEdad() + " años y tiene " + empleado.getSalario() + "$.");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("");
        }else {
            System.out.println("");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Debe ingresar un empleado");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("");
        }
    }
    
    public void mostrarAumento(){
        if(empleado.getEmpleado()){
            System.out.println("");
            System.out.println("------------------------------------------------------");
            System.out.println("El aumento para " + empleado.getNombre() + " es de: " + empleado.calcular_aumento() + "$");
            System.out.println("------------------------------------------------------");
            System.out.println("");
        }else {
            System.out.println("");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Debe ingresar un empleado");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("");
        }
    }
    
    public void salirMenu(){
        System.out.println("¿Seguro que quiere salir?");
        System.out.println("1)- Si");
        System.out.println("2)- No");
        this.opcion = entrada.nextInt();
        if(opcion == 1){
            this.opcion = 0;
        }
    }
}
