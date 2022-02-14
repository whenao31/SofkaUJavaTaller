package com.sofka.ejercicio1_15;

public class Ejercicio6 {

    public static void mostrarNumerosParesEImparesFor(){

        String numerosPares = "";
        System.out.println("Los numeros impares del 1 al 100 son:");
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }else{
                numerosPares += (i + " ");
            }
        }
        System.out.println("\n\nLos numeros pares del 1 al 100 son:\n" + numerosPares);
    }

}
