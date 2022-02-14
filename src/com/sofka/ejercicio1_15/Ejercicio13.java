package com.sofka.ejercicio1_15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public static void fechaEnFormato(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        LocalDateTime actual = LocalDateTime.now();
        System.out.println(formatter.format(actual));
    }
}
