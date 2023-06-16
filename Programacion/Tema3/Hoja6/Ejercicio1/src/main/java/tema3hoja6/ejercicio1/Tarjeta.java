/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3hoja6.ejercicio1;

/**
 *
 * @author Asier
 */
public class Tarjeta {

    String nombre;
    int numero;
    int pin;
    String estado;
    double saldo;

    public Tarjeta(String nombre, int numero, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
        this.pin = (int) Math.floor(Math.random() + (9999 - 0 + 1));
        this.estado = "bloqueada";
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public int getPin() {
        return pin;
    }

    public String getEstado() {
        return estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void desbloquea(int pin) {
        if (this.pin == pin) {
            this.estado = "habilitada";
        }
    }

    public void pagar(double compra, int pin, String descripcion, String propina) {
        String comparacion = "habilitada";
        String comparacionPropina = "si";
        if (this.estado.equals(comparacion)) {
            if (pin == this.pin) {
                if (saldo - compra >= 0) {
                    if (propina.equals(comparacionPropina)) {
                        double aumento = compra * 0.05;
                        double calculo = compra + aumento;
                        this.saldo -= calculo;
                        System.out.println(imprimirTicket(descripcion, compra, aumento));
                    } else {
                        this.saldo -= compra;
                        System.out.println(imprimirTicket(descripcion, compra, 0));
                    }
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                System.out.println("PIN incorrecto");
            }
        } else {
            System.out.println("Tarjeta bloqueada");
        }
    }

    private String imprimirTicket(String descripcion, double valor, double cargos) {
        String pCuenta = String.valueOf(numero).substring(0, 4);
        String sCuenta = String.valueOf(numero).substring(4);
        String nCuenta = pCuenta + sCuenta.replace("0","*").replace("1","*").replace("2","*").replace("3","*").replace("4","*").replace("5","*").replace("6","*").replace("7","*").replace("8","*").replace("9","*");
        double total = valor + cargos;
        return "Nombre del titular: " + nombre + "\n"
                + "Numero de cuenta: " + nCuenta + "\n"
                + "Descripcion de la compra: " + descripcion.substring(0, 8) + "\n"
                + "Valor de la compra: " + valor + "\n"
                + "Cargos: " + cargos + "\n"
                + "Total cargado a la tarjeta: " + total;
    }
}
