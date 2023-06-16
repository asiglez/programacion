/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja2.ejercicio2;

/**
 *
 * @author Asier
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int dia = 18;
        String texto = null;
        switch (dia) {
            case 1,8,15,22,29:
                texto = "Lunes";
                break;
            case 2,9,16,23,30:
                texto = "Martes";
                break;
            case 3,10,17,24,31:
                texto = "Miercoles";
                break;
            case 4,11,18,25:
                texto = "Jueves";
                break;
            case 5,12,19,26:
                texto = "Viernes";
                break;
            case 6,13,20,27:
                texto = "Sabado";
                break;
            case 7,14,21,28:
                texto = "Domingo";
                break;
            default:
                texto = "No has introducido un numero entre 1 y 31";
        }
        System.out.println(texto);
    }
}
