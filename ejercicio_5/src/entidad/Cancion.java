/*
  Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
  Se deberá́ definir además dos constructores: 
  uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
  Se deberán además definir los métodos getters y setters correspondientes.
*/
package entidad;
public class Cancion {
    
    //Atributos
    private String titulo;
    private String autor;
    
    //Constructores
    public Cancion(){
        this.titulo = "";
        this.autor = "";
    }
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Métodos
    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void crearCancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public void mostrarCancion(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("El titulo de la canción es " + this.titulo + " y el auto es " + this.autor);
        System.out.println("-------------------------------------------------------------------------");
    }
    public void mensajeError(){
        System.out.println("--------------------------");
        System.out.println("Debe ingresar una cancion");
        System.out.println("--------------------------");
    }
}
