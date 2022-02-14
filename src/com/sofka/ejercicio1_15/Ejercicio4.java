package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio4 {

    private static final double IVA = 21 / 100.00;

    public static String calcularPrecioConIVA(){

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor ingrese el precio del producto: ");
        double precio = Double.parseDouble(in.nextLine());

        return "El precio final del producto incluido IVA es $" + (precio * (1 + IVA));
    }
}
