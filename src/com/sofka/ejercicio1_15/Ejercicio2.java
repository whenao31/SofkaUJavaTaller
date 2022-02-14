package com.sofka.ejercicio1_15;

import java.util.Scanner;

public class Ejercicio2 {

    public static String mayorQue(){
        Scanner in = new Scanner(System.in);
        String resultado = "";

        System.out.println("Porfavor ingrese el primer numero: ");
        int numero1 = Integer.parseInt(in.nextLine());

        System.out.println("Porfavor ingrese el segundo numero: ");
        int numero2 = Integer.parseInt(in.nextLine());

        if(numero1 > numero2){
            resultado = numero1 + " es mayor que " + numero2;
        }else if(numero2 > numero1){
            resultado = numero2 + " es mayor que " + numero1;
        }else{
            resultado = "ambos numeros son iguales";
        }
        return resultado;
    }
}
