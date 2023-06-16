/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja7.ejercicio3;

/**
 *
 * @author Asier
 */
public class ImprimeNumeros {

    public static String imprimeNumeros(int n) {
        String numero= String.valueOf(n);
        if(n==1){
            return "1";
        }else{
            return numero+imprimeNumeros(n-1);
        }
    }
}

