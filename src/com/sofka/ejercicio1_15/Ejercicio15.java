package com.sofka.ejercicio1_15;

import javax.swing.*;

public class Ejercicio15 {

    public static void generarMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("******GESTION CINEMATOGRAFICA******\n")
                .append("1-NUEVO ACTOR\n")
                .append("2-BUSCAR ACTOR\n")
                .append("3-ELIMINAR ACTOR\n")
                .append("4-MODIFICAR ACTOR\n")
                .append("5-VER TODOS LOS ACTORES\n")
                .append("6-VER PELICULAS DE LOS ACTORES\n")
                .append("7-VER CATEGORIAS DE LAS PELICULAS DE LOS ACTORES\n")
                .append("8-SALIR\n\n")
                .append("Por favor digite la opcion deseada: ");

        int opcion = 1;

        while (opcion != 8 ){
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(stringBuilder.toString()));
                switch (opcion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Adios");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA.");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"OPCION INCORRECTA.");
            }
        }
    }
}
