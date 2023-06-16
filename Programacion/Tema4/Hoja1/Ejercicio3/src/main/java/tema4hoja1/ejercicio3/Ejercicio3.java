/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja1.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n=s.nextInt();
        int[]a= {1,2,3,4,5,6,7,8,9,10};
        boolean encontrado = false;
        for(int i=0;i<=9;i++){
           if(a[i]==n){
               System.out.println("El numero esta en la posicion: "+i);
               encontrado=true;
           }if(encontrado=false){
               System.out.println("Número no encontrado");
           }
        }
    }
}
