/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema1hoja1.ejercicio4;

/**
 *
 * @author Asier
 */
enum meses {
    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE,
    NOVIEMBRE, DICIEMBRE}
public class Ejercicio4 {

    public static void main(String[] args) {
        meses m = meses.MARZO;
        m=meses.valueOf("MARZO"); //asigno a esta variable la seleccion enum marzo
        //a atraves de un string, es lo mismo que lo anterior pero en forma de texto
        System.out.println(m);
    }
}
