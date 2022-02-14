package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio9 {

    public static void modificarYConcatenarFrases(){
        StringBuilder sb = new StringBuilder();
        String frase1 = "La sonrisa sera la mejor arma contra la tristeza".replace("a","e");

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String fraseUsuario = in.nextLine();

        System.out.println(sb
                .append(frase1)
                .append(". ")
                .append(fraseUsuario)
                .append(".")
                .toString());
    }
}
