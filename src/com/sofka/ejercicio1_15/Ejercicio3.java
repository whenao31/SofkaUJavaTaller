package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio3 {

    public static String calcularAreaCirculo(){

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor ingrese el radio: ");
        double radio = Double.parseDouble(in.nextLine());

        return "El area del circulo de radio " + radio + " es " + (Math.PI * Math.pow(radio, 2.0));
    }
}
