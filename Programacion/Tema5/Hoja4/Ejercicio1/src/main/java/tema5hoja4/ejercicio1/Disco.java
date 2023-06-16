/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja4.ejercicio1;

/**
 *
 * @author Asier
 */
public class Disco extends Publicacion {

    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int año) {
        super(titulo, autor, dia, mes, año);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Fecha: " + super.getFecha() + "\n"
                + "Numero de paginas: " + duracionMinutos;
    }
}
