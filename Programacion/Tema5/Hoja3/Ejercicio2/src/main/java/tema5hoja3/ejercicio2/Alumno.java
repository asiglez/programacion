/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja3.ejercicio2;

/**
 *
 * @author Asier
 */
public class Alumno extends Persona {

    private int[] notas;

    public Alumno(int nNotas) {
        super();
        this.notas = new int[nNotas];
        for (int i = 0; i < notas.length; i++) {
            int a = i + 1;
            System.out.println("Introduce la " + a + " nota");
            notas[i] = s.nextInt();
        }
    }

    @Override
    public String mostrar() {
        int suma = 0;
        int contador = 0;
        for (int i = 1; i < notas.length; i++) {
            suma = notas[i];
            contador++;
        }
        double media = suma / contador;
        return "DNI: " + super.getDni() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Dirección: " + super.getDireccion() + "\n"
                + "Nota media: "+media;

    }
}
