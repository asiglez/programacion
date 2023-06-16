/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4hoja1fechas.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Letra {

    Scanner s = new Scanner(System.in);
    int numLetra;
    String titular;
    double importe;
    LocalDate fechaVencimiento;

    public Letra() {
        System.out.println("Introduce el numLetra");
        this.numLetra = s.nextInt();
        System.out.println("Introduce el nombre del titular");
        this.titular = s.next();
        System.out.println("Introduce el importe");
        this.importe = s.nextDouble();
        System.out.println("Introduce la fecha de vencimiento(dd-mm-yyyy)");
        DateTimeFormatter fechaformateada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaVencimiento = LocalDate.parse(s.next(), fechaformateada);
    }

    public boolean vencida() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }

    public void demora(long alargarDias) {
        fechaVencimiento = fechaVencimiento.plusDays(alargarDias);
    }

    public long diasFaltan() {

        return ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);

    }

    public void mostrar() {
        System.out.println("El numero de letra es: " + this.numLetra);
        System.out.println("El titular es: " + this.titular);
        System.out.printf("El importe de la letra es de : %,.2f €\n", this.importe);
        //formateo a castellano
        DateTimeFormatter esDateFormatLargo = DateTimeFormatter
                .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
                .withLocale(new Locale("es", "ES"));
        System.out.println("La fecha de vencimiento de la letra es el:  " + this.fechaVencimiento.format(esDateFormatLargo));

    }

    public int devuelveMeses() {
        return fechaVencimiento.getMonthValue();
    }

    public String getTitular() {
        return titular;
    }

}
