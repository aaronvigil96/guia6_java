/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
    y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
    Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número
    de ISBN, el título, el autor del libro y el número de páginas.
*/

package Entidad;

public class Libro {
    //Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;
    //Constructor vacio
    public Libro(){
        
    }
    //Constructor parametro
    public Libro(int isbn, String titulo, String autor, int paginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void setLibro(int isbn,String titulo,String autor,int paginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public int getIsbn(){
        return this.isbn;
    }
    
    public int getPaginas(){
        return this.paginas;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
}
