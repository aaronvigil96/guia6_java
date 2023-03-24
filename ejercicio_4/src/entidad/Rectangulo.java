/*
    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
    La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
    También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
    Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    Se deberán además definir los métodos getters, setters y constructores correspondientes.
    Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package entidad;

public class Rectangulo {
    //Atributos
    private int base;
    private int altura;
    
    //Constructor
    public Rectangulo(){
    }
    
    //Métodos
    public int getBase(){
        return this.base;
    }
    public int getAltura(){
        return this.altura;
    }
    public void setBase (int base) {
        this.base = base;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void crearRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int superficie(){
        return this.base * this.altura;
    }
    public int perimetro(){
        return (this.base + this.altura) * 2;
    }
    public void dibujarRectangulo(){
        int base = this.base;
        int altura = this.altura;
        for (int i = 0; i < altura; i++) {
            System.out.println("");
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
        }
    }
    public void mensajeError(){
        System.out.println("------------------------------------------------");
        System.out.println("Lo siento, primero tiene que crear el rectangulo");
        System.out.println("------------------------------------------------");
    }
}
