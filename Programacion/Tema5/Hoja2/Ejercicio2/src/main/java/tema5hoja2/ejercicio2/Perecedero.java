/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja2.ejercicio2;

/**
 *
 * @author Asier
 */
public class Perecedero extends Articulo{
    int mes;
    int año;
     public Perecedero(int mes, int año, int codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.mes = mes;
        this.año = año;
    }
    

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
