/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class Almacen {
    
    private Articulo a[];
    int contador = 0;

    public Almacen(int b) {
        this.a = new Articulo[b];
    }

    public void llenar(Articulo objeto) {
        if (contador < a.length) {
            a[contador] = objeto;
            this.contador++;
        } else {
            System.out.println("Array completo");
        }
    }

    public void pedidos() {
        for (int i = 0; i < contador; i++) {
            if (a[i].existencias < 10) {
                System.out.println("Codigo: " + a[i].codigo + "\n"
                        + "Descripcion: " + a[i].descripcion + "\n"
                        + "Existencias:" + a[i].existencias);
            }
        }
    }
}
