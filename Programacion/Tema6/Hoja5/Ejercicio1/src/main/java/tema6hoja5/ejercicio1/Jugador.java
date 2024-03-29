/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6hoja5.ejercicio1;

/**
 *
 * @author Asier
 */
public class Jugador implements Comparable<Jugador> {

    private String nombre;
    private int estatura;

    public Jugador(String nombre, int estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public Jugador() {
        this.nombre = Teclado.pedirNombreRegex("Introduce el nombre del jugador... ");
        this.estatura = Teclado.pedirIntPositivo("Introduce la estatura del jugador... ");

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.estatura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return this.estatura == other.estatura;
    }

    @Override
    public int compareTo(Jugador o) {
        return o.getEstatura() - this.estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Estatura: " + estatura + " cm \n";
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
}
