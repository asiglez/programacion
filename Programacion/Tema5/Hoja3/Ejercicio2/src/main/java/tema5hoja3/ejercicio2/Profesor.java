/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja3.ejercicio2;

/**
 *
 * @author Asier
 */
public class Profesor extends Persona {

    private String[] asignaturas;

    public Profesor(int nAsignaturas) {
        super();
        this.asignaturas = new String[nAsignaturas];
        for (int i = 0; i < asignaturas.length; i++) {
            int a = i + 1;
            System.out.println("Introduce la " + a + " asignatura");
            asignaturas[i] = s.next();
        }
    }

    @Override
    public String mostrar() {
        String cadena = "";
        for (int i = 1; i < asignaturas.length; i++) {
            cadena = cadena.concat(asignaturas[i].toUpperCase()+", ");

        }
        return "DNI: " + super.getDni() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Dirección: " + super.getDireccion() + "\n"
                + "Asignaturas: " + cadena;

    }
}
