package com.sofka.ejercicio1_15;

import javax.swing.*;

public class Ejercicio14 {

    public static void contarDe2En2(){

        int inicio = 0;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            try {
                inicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 1000"));
            }catch(Exception e){
                System.out.println("Debe ingresar un numero entre 1 y 1000.");
            }
        }while ((inicio <= 0) || (inicio >= 1000));

        stringBuilder.append("Conteo desde ").append(inicio).append(" hasta 1000 en saltos de 2:\n");
        int cont = 1;
        for(int i = inicio; i <=1000; i+=2){
            stringBuilder.append(i + " ");
            if(cont%20 == 0){
                stringBuilder.append("\n");
            }
            cont++;
        }

        JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }
}
