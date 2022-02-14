package com.sofka.ejercicio17;

public class Television extends Electrodomestico{

    protected static final double RESOLUCION_DEFAULT = 20.0;
    protected static final boolean SINTONIZADOR_TDT_DEFAULT = false;

    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double calcularPrecioFinal(){
        double precioDefault = super.calcularPrecioFinal();
        return precioDefault * (1 + obtenerAdicionResolucion(this.resolucion)) + obtenerAdicionTDT(this.sintonizadorTDT);
    }

    private double obtenerAdicionResolucion(double resolucion){
        return resolucion > 40.0 ? 30 / 100 : 0.0;
    }

    private double obtenerAdicionTDT(boolean sintonizadorTDT){
        return sintonizadorTDT ? 50.0 : 0.0;
    }
}
