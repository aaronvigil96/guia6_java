/*
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
    El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
package ejercicio_10.entidades;

public class Empleado {
    
    //Atributos
    private String nombre;
    private int edad;
    private int salario;
    private double aumento;
    
    //Constructores
    Empleado(){
        
    }
    Empleado(String nombre, int edad, int salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public double calcular_aumento(){
        if(this.edad > 30){
            this.aumento = this.salario * 0.1;
        }else {
            this.aumento = this.salario * 0.05;
        }
        return aumento;
    }
}