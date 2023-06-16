/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Banco {

    Scanner s = new Scanner(System.in);
    Cliente a[];
    int contador = 0;

    public Banco(int n) {
        this.a = new Cliente[n];
    }

    public void ingresar() {
        if (contador < a.length) {
            Cliente usuario = new Cliente();
            usuario.setCodigo(contador + 1);
            System.out.println("Introduce el nombre del usuario: ");
            usuario.setNombre(s.next());
            System.out.println("Introduce los apellidos del usuario: ");
            usuario.setApellidos(s.next());
            System.out.println("Introduce el telefono del usuario: ");
            usuario.setTelefono(s.nextInt());
            System.out.println("Introduce el saldo del usuario: ");
            usuario.setSaldo(s.nextDouble());
            a[contador] = usuario;
            this.contador++;
        } else {
            System.out.println("Maximo de Usuarios alcanzado.");
        }
    }

    public String buscar() {
        System.out.println("Introduce el codigo del cliente que quieras buscar: ");
        int codigo = s.nextInt();
        String cadena = "";
        for (int i = 0; i < contador; i++) {
            if (a[i].codigo == codigo) {
                cadena = cadena.concat("Codigo: " + a[i].codigo + "\n"
                        + "Nombre: " + a[i].nombre + "\n"
                        + "Apellidos: " + a[i].apellidos + "\n"
                        + "Telefono: " + a[i].telefono + "\n"
                        + "Saldo: " + a[i].saldo);
            }
        }
        return cadena;
    }

    public void eliminar(int codigo) {
        int id = codigo - 1;

        for (int i = id; i < contador - 1; i++) {
            a[i] = a[i + 1];
            a[i].setCodigo(i + 1);
        }
        this.contador--;
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Codigo: " + a[i].codigo + "\n"
                    + "Nombre: " + a[i].nombre + "\n"
                    + "Apellidos: " + a[i].apellidos + "\n"
                    + "Telefono: " + a[i].telefono + "\n"
                    + "Saldo: " + a[i].saldo);
        }
    }
}
