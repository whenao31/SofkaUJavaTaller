package com.sofka.ejercicio1_15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

    public static void analizarFrase(){

        Scanner in  = new Scanner(System.in);
        System.out.println("Ingresar frase a analizar: ");
        String frase = in.nextLine();
        int longitudFrase = obtenerLongitudFrase(frase);

        System.out.println("La longitud de la frase es de " + longitudFrase + " palabras.");

        System.out.println("El conteo de letra 'a' es " + contarLetra(frase.toLowerCase(), "a"));
        System.out.println("El conteo de letra 'e' es " + contarLetra(frase.toLowerCase(), "e"));
        System.out.println("El conteo de letra 'i' es " + contarLetra(frase.toLowerCase(), "i"));
        System.out.println("El conteo de letra 'o' es " + contarLetra(frase.toLowerCase(), "o"));
        System.out.println("El conteo de letra 'u' es " + contarLetra(frase.toLowerCase(), "u"));
    }

    private static int obtenerLongitudFrase(String frase) {
        String[] palabrasFrase = frase.split("\\s+");
        return palabrasFrase.length;
    }

    private static int contarLetra(String frase, String letra){
        long conteoLetra = 0;
        String fraseLimpia = frase.replaceAll("\\s+", "");
        Character[] charactersFrase = fraseLimpia.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        conteoLetra = Arrays.stream(charactersFrase).filter(c -> c.equals(letra.charAt(0))).count();
        return (int) conteoLetra;
    }
}
