package com.sofka.ejercicio1_15;


import java.util.Scanner;

public class Ejercicio12 {

    public static void diferenciarPalabras(){

        String palabra1 = "";
        String palabra2 = "";
        Scanner in  = new Scanner(System.in);
        do {
            System.out.println("Ingresar primera palabra: ");
             palabra1 = in.nextLine();
        }while (palabra1.equals(""));

        do {
            System.out.println("Ingresar segunda palabra: ");
            palabra2 = in.nextLine();
        }while (palabra2.equals(""));

        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las palabras son iguales!!");
        }else{
            System.out.println(encontrarDiferencias(palabra1, palabra2));
        }
    }

    private static String encontrarDiferencias(String palabra1, String palabra2) {
        char[] palabra1Chars = palabra1.toLowerCase().toCharArray();
        char[] palabra2Chars = palabra2.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder("Las palabras ");
        stringBuilder.append(palabra1).append(" y ").append(palabra2).append(" difieren en:\n");
        for( int i = 0; i < palabra1Chars.length; i++){
            if( palabra1Chars[i] != palabra2Chars[i] ){
                stringBuilder.append(palabra1Chars[i]).append(" diff ").append(palabra2Chars[i]).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
