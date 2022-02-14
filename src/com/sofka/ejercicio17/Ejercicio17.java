package com.sofka.ejercicio17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio17 {

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Double[] precioFinal = new Double[electrodomesticos.length];
        double precioTotalElectrodomesticos;
        double precioTotalTelevisores;
        double precioTotalLavadoras;

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Television();
        electrodomesticos[2] = new Lavadora();
        electrodomesticos[3] = new Electrodomestico(130, 3);
        electrodomesticos[4] = new Television(130.5, 1.5);
        electrodomesticos[5] = new Lavadora(200, 11.5);
        electrodomesticos[6] = new Electrodomestico(300.0, "blanco", 'B', 15.0);
        electrodomesticos[7] = new Television(230.0, "negro", 'A', 3.8, 50.0, true);
        electrodomesticos[8] = new Lavadora(400.0, "azul", 'C', 18.0, 20);
        electrodomesticos[9] = new Television(400.0, "gris", 'D', 5.5, 55, false);

        precioFinal = Arrays.stream(electrodomesticos).map(e -> e.calcularPrecioFinal()).toArray(Double[]::new);

        precioTotalElectrodomesticos = Arrays.stream(electrodomesticos)
                .filter(el -> el instanceof Electrodomestico)
                .reduce(0.0,(subtotal, el) -> subtotal + el.calcularPrecioFinal(), Double::sum);

        precioTotalTelevisores = Arrays.stream(electrodomesticos)
                .filter(el -> el instanceof Television)
                .reduce(0.0,(subtotal, el) -> subtotal + el.calcularPrecioFinal(), Double::sum);

        precioTotalLavadoras = Arrays.stream(electrodomesticos)
                .filter(el -> el instanceof Lavadora)
                .reduce(0.0,(subtotal, el) -> subtotal + el.calcularPrecioFinal(), Double::sum);

        System.out.println("Precio total de electrodomesticos = €" + precioTotalElectrodomesticos);
        System.out.println("Precio total de televisores = €" + precioTotalTelevisores);
        System.out.println("Precio total de lavadoras = €" + precioTotalLavadoras);
    }
}
