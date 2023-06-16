/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema5hoja9.ejercicio4;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        try{
            System.out.println("Genero la excepcion");
            throw new Miexcepcion("Esto es un error");
        }catch(Miexcepcion me){
            System.out.println(me.getMessage());
        }
    }
}
