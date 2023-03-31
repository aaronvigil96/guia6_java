/*
    Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
    Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
*/
package entidades;

public class Rectangulo {
    
    //Atributos
    private int lado1;
    private int lado2;
    private boolean estado;
    
    //Constructores
    public Rectangulo(){
        
    }
    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.estado = true;
    }
    
    //Métodos
    public int getLado1() {
        return lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public int calcular_area(){
        return lado1 * lado2;
    }
}
