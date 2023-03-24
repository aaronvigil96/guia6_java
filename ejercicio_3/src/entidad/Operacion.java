/*
    Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
    Método constructor con todos los atributos pasados por parámetro.
    Método constructor sin los atributos pasados por parámetro.
    Métodos get y set.
    Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    Método sumar(): calcular la suma de los números y devolver el resultado al main.
    Método restar(): calcular la resta de los números y devolver el resultado al main
    Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
    Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

*/
package entidad;
import java.util.Scanner;

public class Operacion {
    Scanner entrada = new Scanner(System.in);
    private int numA;
    private int numB;
    
    //Constructor vacio
    public Operacion(){
    }
    //Constructor con parametros
    public Operacion(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }
    
    public int getNumA(){
        return this.numA;
    }
    
    public int getNumB(){
        return this.numB;
    }
    
    public void setNumA(int numA){
        this.numA = numA;
    }
    
    public void setNumB(int numB){
        this.numB = numB;
    }
    
    public void crearOperacion(){
        System.out.println("Ingresá el primer numero");
        this.numA = entrada.nextInt();
        System.out.println("Ingresá el segundo numero");
        this.numB = entrada.nextInt();
    }
    
    public int sumar(){
        return this.numA + numB;
    }
    
    public int restar(){
        return this.numA - this.numB;
    }
    
    public int multiplicar(){
        if(numA == 0 || numB == 0){
            System.out.println("-------------------------------------");
            System.out.println("No se puede multiplicar por 0");
            System.out.println("-------------------------------------");
            return 0;
        }
        return numA * numB;
    }
    
    public int division(){
        if(numA == 0 || numB == 0){
            return 0;
        }
        return numA / numB;
    }
    
    public void mensajeError(){
        System.out.println("-------------------------------------");
        System.out.println("Primero debe ingresar los dos numeros");
        System.out.println("-------------------------------------");
    }
    
}
