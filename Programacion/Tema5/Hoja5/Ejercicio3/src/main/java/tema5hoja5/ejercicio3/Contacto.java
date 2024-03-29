/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja5.ejercicio3;

/**
 *
 * @author Asier
 */
public class Contacto implements Comparable<Contacto>{
    private String nombre;
    private String apellidos;
    private String email;
    private int telefono;

    public Contacto(String nombre, String apellidos, String email, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }
    
    @Override
    public int compareTo(Contacto o) {
        return this.apellidos.compareToIgnoreCase(o.getApellidos());
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono + '}';
    }
}
