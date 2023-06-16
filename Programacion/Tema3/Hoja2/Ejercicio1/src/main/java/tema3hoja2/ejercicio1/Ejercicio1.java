/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3hoja2.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int diasemana = 4;
        String texto = null;
        switch (diasemana) {
            case 1:
                texto = "Lunes";
                break;
            case 2:
                texto = "Martes";
                break;
            case 3:
                texto = "Miercoles";
                break;
            case 4:
                texto = "Jueves";
                break;
            case 5:
                texto = "Viernes";
                break;
            case 6:
                texto = "Sabado";
                break;
            case 7:
                texto = "Domingo";
                break;
            default:
                System.out.println("No has introducido un numero entre 1 y 7");
        }
        System.out.println(texto);
    }
}
