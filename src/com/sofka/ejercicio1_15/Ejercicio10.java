package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio10 {

    public static void eliminarEspaciosEnFrase(){

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar frase para eliminarles los espacios: ");
        String frase = in.nextLine();
        System.out.println("La frase ingresada sin espacios queda: " );
        System.out.println(frase.replace(" ",""));

    }
}
