package com.sofka.ejercicio16;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

//        ******** Persona 2**************8
        Scanner in = new Scanner(System.in);
        String nombre1 = "";
        int edad1;
        char sexo1;
        double peso1;
        double estatura1;

        System.out.println("Ingrese el nombre de la persona: ");
        nombre1 = in.nextLine();
        edad1 = pedirEdadPorTeclado(in);

        System.out.println("Ingrese sexo de la persona: ");
        sexo1 = in.nextLine().toUpperCase().toCharArray()[0];

        peso1 = pedirDoublePorTeclado(in, "el peso(kg)");
        estatura1 = pedirDoublePorTeclado(in, "la estatura(m)");
        System.out.println("\n******** Persona 1**************");
        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, estatura1);

        if (persona1.calcularIMC() == 0){
            System.out.println(persona1.getNombre() + " está en su peso ideal.");
        }else if (persona1.calcularIMC() == -1){
            System.out.println(persona1.getNombre() + " tiene bajo peso!");
        }else{
            System.out.println(persona1.getNombre() + " tiene sobrepeso!");
        }

        if (persona1.esMayorDeEdad()) {
            System.out.println(persona1.getNombre() + " es mayor de edad.");
        }else{
            System.out.println(persona1.getNombre() + " es menor de edad.");
        }

        System.out.println(persona1.toString());

//      ******** Persona 2**************
        System.out.println("\n******** Persona 2**************");
        Persona persona2 = new Persona("John Doe", 34, Persona.HOMBRE);
        if (persona2.calcularIMC() == 0){
            System.out.println(persona2.getNombre() + " está en su peso ideal.");
        }else if (persona2.calcularIMC() == -1){
            System.out.println(persona2.getNombre() + " tiene bajo peso!");
        }else{
            System.out.println(persona2.getNombre() + " tiene sobrepeso!");
        }

        if (persona2.esMayorDeEdad()) {
            System.out.println(persona2.getNombre() + " es mayor de edad.");
        }else{
            System.out.println(persona2.getNombre() + " es menor de edad.");
        }

        System.out.println(persona2.toString());

//      ******** Persona 3**************
        System.out.println("\n******** Persona 3**************");
        Persona persona3 = new Persona();
        persona3.setNombre("Tim Doe");
        persona3.setEdad(6);
        persona3.setSexo(Persona.HOMBRE);
        persona3.setPeso(30.5);
        persona3.setEstatura(1);

        if (persona3.calcularIMC() == 0){
            System.out.println(persona3.getNombre() + " está en su peso ideal.");
        }else if (persona3.calcularIMC() == -1){
            System.out.println(persona3.getNombre() + " tiene bajo peso!");
        }else{
            System.out.println(persona3.getNombre() + " tiene sobrepeso!");
        }

        if (persona3.esMayorDeEdad()) {
            System.out.println(persona3.getNombre() + " es mayor de edad.");
        }else{
            System.out.println(persona3.getNombre() + " es menor de edad.");
        }

        System.out.println(persona3.toString());



    }

    private static double pedirDoublePorTeclado(Scanner in,String campo) {
        double numero = 0;
        do {
            try {
                System.out.println("Ingrese " + campo + " de la persona:");
                numero = Double.parseDouble(in.nextLine());
            }catch(Exception e){
                System.out.println("Por favor ingrese un numero.");
            }
        }while (numero <= 0);
        return numero;
    }

    private static int pedirEdadPorTeclado(Scanner in){
        int edad = 0;
        do {
            try {
                System.out.println("Ingrese la edad de la persona:");
                edad = Integer.parseInt(in.nextLine());
            }catch(Exception e){
                System.out.println("Por favor ingrese una edad valida");
            }
        }while ((edad <= 0) || (edad >= 120));
        return edad;
    }
}
