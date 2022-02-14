package com.sofka.ejercicio18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio18 {

    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("Altered Carbon", 2, "Ciencia ficcion", "Laeta Kalogridis");
        series[1] = new Serie("Game of Thrones", "David Benioff");
        series[2] = new Serie("Blindspot", 7, "Accion", "Martin Gero");
        series[3] = new Serie("Queen's Gambit", 1, "Drama", "Scott Frank");
        series[4] = new Serie("Lost in space", 3, "Ciencia ficcion", "Matt Sazama");

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Super Mario Bros", 3);
        videojuegos[2] = new Videojuego("Worms", 15, "Tacticas", "Ubisoft");
        videojuegos[3] = new Videojuego("Fifa", 3, "Deportes", "EA Sports");
        videojuegos[4] = new Videojuego("Call of duty", 6, "Shooter", "Activision");

//        Prestamo de series
        series[1].entregar();
        series[2].entregar();
        series[3].entregar();

//        Prestamo de videojuegos
        videojuegos[4].entregar();
        videojuegos[3].entregar();

//        Conteo de series prestadas haciendo uso de Streams
        System.out.println("Hay " + Arrays.stream(series).filter(s -> s.isEntregado()).count() + " series prestadas.");
//        Arrays.stream(series).filter(s -> s.isEntregado()).forEach(System.out::println);

//        Conteo de videojuegos prestados haciendo uso de Streams
        System.out.println("Hay " + Arrays.stream(videojuegos).filter(v -> v.isEntregado()).count() + " videojuegos prestados.");
//        Arrays.stream(videojuegos).filter(v -> v.isEntregado()).forEach(System.out::println);

//        Devolucion de series
        series[1].devolver();
        series[2].devolver();
        series[3].devolver();

//        Devolucion de videojuegos
        videojuegos[4].devolver();
        videojuegos[3].devolver();

//      Busqueda de la serie con mas temporadas haciendo uso de Streams
        System.out.println("LA SERIE CON MAS TEMPORADAS ES: ");
        System.out.println(Arrays.stream(series).max(Comparator.comparing(Serie::getNumeroTemporadas)));
//      Busqueda del videojuego con el numero maximo de horas haciendo uso de Streams
        System.out.println("eL VIDEOJUEGO CON MAS HORAS ES: ");
        System.out.println(Arrays.stream(videojuegos).max(Comparator.comparing(Videojuego::getHorasEstimadas)));
    }
}
