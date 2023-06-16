/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja8.ejercicio2;

/**
 *
 * @author Asier
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setActor(String actor) {
        this.autor = autor;
    }

    public boolean esEspanol() {
        boolean espanol;
        int numeros= Integer.parseInt(isbn.substring(3,5));
        if(numeros==84){
            espanol=true;
        }else{
            espanol=false;
        }
        return espanol;
    }
    public void mostrar(){
        String ntitulo= titulo.toUpperCase();
        String nautor= autor.substring(0,1).toUpperCase()+autor.substring(1).toLowerCase();
        System.out.println(ntitulo+" "+nautor);
    }
}
