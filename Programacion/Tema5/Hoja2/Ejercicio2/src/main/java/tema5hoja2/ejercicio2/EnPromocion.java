/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5hoja2.ejercicio2;

/**
 *
 * @author Asier
 */
public class EnPromocion extends Articulo{
    int descuento;

    public EnPromocion(int descuento, int codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
}
