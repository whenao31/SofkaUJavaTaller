package com.sofka.ejercicio17;

public class Lavadora extends Electrodomestico{

    protected static final double CARGA_DEFAULT = 5.0;

    private double carga;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public double calcularPrecioFinal(){
        return super.calcularPrecioFinal() + obtenerAdicionCarga(this.carga);
    }

    private double obtenerAdicionCarga(double carga){
        return carga > 30 ? 50.0 : 0.0;
    }
}
