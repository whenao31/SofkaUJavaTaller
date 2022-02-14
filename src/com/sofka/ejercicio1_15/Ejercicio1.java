package com.sofka.ejercicio1_15;

public class Ejercicio1 {

    public static String mayorQue(int numero1, int numero2){
        String resultado = "";
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
