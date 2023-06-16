/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja4.ejercicio1;

/**
 *
 * @author Asier
 */
public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(int numPaginas, String titulo, String autor, int dia, int mes, int año) {
        super(titulo, autor, dia, mes, año);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+ "\n"
                + "Autor: "+autor+ "\n"
                + "Fecha: "+super.getFecha()+"\n"
                + "Numero de paginas: "+numPaginas;
    }
}
