package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio7 {

    public static void ingresarNumeroMayorOIgualCero(){

        Scanner in = new Scanner(System.in);
        int numero = -1;

        do {
            System.out.println("Ingrese un numero mayor o igual a cero: ");
            try {
                numero = Integer.parseInt(in.nextLine());
            }catch (Exception e){
                System.out.println("No se aceptan caracteres que no sean numeros");
            }

        }while (numero < 0);

        System.out.println("El numero ingresado fue: "+ numero);
    }
}
