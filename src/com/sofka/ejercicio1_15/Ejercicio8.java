package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio8 {

    public static void verificarDiaLaboral(){

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Ingrese dia de la semana: ");
        String dia = in.nextLine().toLowerCase();
        String resultado = "";

        switch (dia){
            case "lunes":
                resultado = "laboral";
                break;
            case "martes":
                resultado = "laboral";
                break;
            case "miercoles":
                resultado = "laboral";
                break;
            case "jueves":
                resultado = "laboral";
                break;
            case "viernes":
                resultado = "laboral";
                break;
            case "sabado":
                resultado = "no laboral";
                break;
            case "domingo":
                resultado = "no laboral";
                break;
            default:
                resultado = "un dia no valido en la tierra :p";
                break;
        }

        System.out.println(sb
                .append("El dia ")
                .append(dia)
                .append(" es ")
                .append(resultado)
                .toString());
    }
}
