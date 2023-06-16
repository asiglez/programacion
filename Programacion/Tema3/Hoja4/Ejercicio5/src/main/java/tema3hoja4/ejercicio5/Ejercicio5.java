/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3hoja4.ejercicio5;

/**
 *
 * @author Asier
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int actual;
        int mayor =0;     
        int menor =100; 
        
        for (int i = 0; i < 10; i++) {
            actual =  (int) Math.floor(Math.random() * 100) + 1; //genero un numero entre 1 y 100
            
            if (actual>mayor){ //compara si el numero actual es mayor al nuevo
                mayor = actual;
            }
            
            if (actual<menor){ //compara si el numero actual es mayor al nuevo
                menor = actual;
            }
            
            System.out.println("El numero sacado es "+actual);
        }
        
        System.out.println("El mayor de todos ha sido "+mayor);
        System.out.println("El menor de todos ha sido "+menor);
    }
}
