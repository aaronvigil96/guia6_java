/*
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
    Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
    Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 
    Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
    http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
package ejercicio_6;
import java.util.Scanner;

public class Puntos {
    
    //Atributos
    private Scanner entrada = new Scanner(System.in);
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    //Constructor
    Puntos(){
    }
    Puntos(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    //Métodos
    //Getters
    public double getX1(){
        return this.x1;
    }
    public double getX2(){
        return this.x2;
    }
    public double getY1(){
        return this.y1;
    }
    public double getY2(){
        return this.y2;
    }
    //Setters
    public void setX1(double x1){
        this.x1 = x1;
    }
    public void setX2(double x2){
        this.x2 = x2;
    }
    public void setY1(double y1){
        this.y1 = y1;
    }
    public void setY2(double y2){
        this.y2 = y2;
    }
    
    public double distancia(){
       double cateto1 = this.x1 - this.x2;
       double cateto2 = this.y1 - this.y2;
       return Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
    }
}
