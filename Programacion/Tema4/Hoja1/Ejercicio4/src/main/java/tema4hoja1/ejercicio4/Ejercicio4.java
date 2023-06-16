/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema4hoja1.ejercicio4;

/**
 *
 * @author Asier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[10];
        for (int i=a.length-1,c=0; i>=0; i--,c++) {
            b[c] = a[i];
        }
        for (int i =0; i <= a.length-1; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
        for (int c =0; c <= b.length-1; c++) {
            System.out.print(b[c]+",");
        }
        }
    }
