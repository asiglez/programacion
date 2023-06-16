/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public abstract class Persona {

    Scanner s = new Scanner(System.in);
    private String dni;
    private String nombre;
    private String direccion;

    public Persona() {
        System.out.println("Introduce el DNI: ");
        this.dni = s.next();
        System.out.println("Introduce el nombre: ");
        this.nombre = s.next();
        System.out.println("Introduce la direccion: ");
        this.direccion = s.next();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String mostrar() {

        return "Nombre: " + nombre + "\n"
                + "Dirección: " + direccion;

    }
}
