/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja5.ejercicio2;

/**
 *
 * @author Asier
 */
public class Gato extends Mamifero implements Felino, Domestico {

    public String nombre;

    public Gato(String nombre, String raza, int npatas, String alimento) {
        super(raza, npatas, alimento);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + '}';
    }

    @Override
    public String arañar() {
        return "Araña";
    }

    @Override
    public String obedecer() {
        return "Obedece";
    }

}
