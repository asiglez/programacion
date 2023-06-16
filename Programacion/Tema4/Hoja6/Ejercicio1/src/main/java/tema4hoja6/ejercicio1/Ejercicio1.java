/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
         Almacen a = new Almacen(4);
        Articulo a1 = new Articulo();
        Articulo a2 = new Articulo();
        Articulo a3 = new Articulo();
        Articulo a4 = new Articulo();
        a.llenar(a1);
        a.llenar(a2);
        a.llenar(a3);
        a.llenar(a4);
        a.pedidos();
    }
}
