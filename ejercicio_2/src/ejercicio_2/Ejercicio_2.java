package ejercicio_2;

import entidad.Circunferencia;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(5);
        System.out.println("El radio es: " + circunferencia.getRadio());
        System.out.println("El area es: " + circunferencia.area(5));
        System.out.println("El perimetro es: " + circunferencia.perimetro(5));
    }
    
}
