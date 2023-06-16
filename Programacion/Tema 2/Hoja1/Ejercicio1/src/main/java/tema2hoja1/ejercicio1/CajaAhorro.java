/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2hoja1.ejercicio1;

/**
 *
 * @author Asier
 */
public class CajaAhorro {
    private int saldo;
    private int transacciones;
    
    public CajaAhorro(){
        saldo=0;
        transacciones=0;
    }
    public CajaAhorro(int saldo){
        this.saldo=saldo;
        transacciones=1;
    }
    public void depositar(int cantidad){
        this.saldo +=cantidad;
        transacciones++;
    }
    
    public void girar(int cantidad) {
        this.saldo -=cantidad;
        transacciones++;
    }
    
    public int obtenerSaldo(){
        return saldo;
    }
    
    public int obtenerTransacciones(){
        return transacciones;
    }
}
