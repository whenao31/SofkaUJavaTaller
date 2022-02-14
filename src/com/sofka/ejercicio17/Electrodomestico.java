package com.sofka.ejercicio17;

public class Electrodomestico {

    protected static final String COLOR_DEFAULT = "blanco";
    protected static final char CONSUMO_DEFAULT = 'F';
    protected static final double PRECIO_BASE_DEFAULT = 100;
    protected static final double PESO_DEFAULT = 5.0;

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color.toLowerCase());
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char consumo){
        switch (consumo){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return consumo;
            default:
                return CONSUMO_DEFAULT;
        }
    }

    private String comprobarColor(String color){
        switch (color){
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default:
                return COLOR_DEFAULT;
        }
    }

    public double calcularPrecioFinal(){
        return this.precioBase + obtenerAdicionConsumo(this.consumoEnergetico) + obtenerAdicionPeso(this.peso);
    }

    private double obtenerAdicionConsumo(char consumo){;
        switch (consumo){
            case 'A':
                return 100.0;
            case 'B':
                return 80.0;
            case 'C':
                return 60.0;
            case 'D':
                return 50.;
            case 'E':
                return 30.0;
            case 'F':
                return 10.0;
            default:
                return 0.0;
        }
    }

    private double obtenerAdicionPeso(double peso){
        if ((peso >= 0) && (peso <= 19)){
            return 10.0;
        }else if ((peso >= 20) && (peso <= 49)){
            return 50.0;
        }else if ((peso >= 50) && (peso <= 79)){
            return 80.0;
        }else if ( peso >= 80){
            return 100.0;
        }else{return 0;}
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
