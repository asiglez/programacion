/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Articulo {
    
    int codigo;
    String descripcion;
    int existencias;

    public Articulo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el codigo: ");
        this.codigo = s.nextInt();
        System.out.println("Introduce la descripcion: ");
        this.descripcion = s.next();
        System.out.println("Introduce las existencias: ");
        this.existencias = s.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

}
