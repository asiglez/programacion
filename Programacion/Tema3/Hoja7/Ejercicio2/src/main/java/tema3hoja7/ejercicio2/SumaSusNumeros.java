/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja7.ejercicio2;

/**
 *
 * @author Asier
 */
public class SumaSusNumeros {
    public static int sumasSusNumeros(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumasSusNumeros(n-1);
        }
    }
}
