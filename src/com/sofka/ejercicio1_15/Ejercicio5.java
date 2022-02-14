package com.sofka.ejercicio1_15;

public class Ejercicio5 {

    public static void mostrarNumerosParesEImparesWhile(){

        String numerosPares = "";

        int cont = 1;
        System.out.println("Los numeros impares del 1 al 100 son:");
        while (cont <= 100){
            if(cont % 2 != 0){
                System.out.print(cont + " ");
            }else{
                numerosPares += (cont + " ");
            }
            cont++;
        }
        System.out.println("\n\nLos numeros pares del 1 al 100 son:\n" + numerosPares);
    }

}
