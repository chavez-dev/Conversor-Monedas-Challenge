package service;

import modelo.Monedas;

import java.util.Scanner;

public class Convertirmoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsumoApi consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("la tasa de Conversion para hoy es: 1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese el valor que desea convertir de " + monedaBase + " a " + monedaTarget);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor de " + cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());

    }
}
