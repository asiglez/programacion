/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3hoja6.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Cartas c1= new Cartas();
        Cartas c2= new Cartas();
        System.out.println(c1.mostrar());
        System.out.println(c2.mostrar());
        if(c1.numero>c2.numero){
            System.out.println(c1.mostrar()+" es mayor que "+c2.mostrar());
        }else{
            System.out.println(c2.mostrar()+" es mayor que "+c1.mostrar());
        }
    }
}
