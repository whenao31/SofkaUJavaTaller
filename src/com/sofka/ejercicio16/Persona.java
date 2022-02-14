package com.sofka.ejercicio16;

public class Persona {

    public static final char HOMBRE = 'H';
    public static final char MUJER = 'M';
    private static final int BAJO_PESO = -1;
    private static final int PESO_NORMAL = 0;
    private static final int SOBRE_PESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double estatura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = HOMBRE;
        this.peso = 0.0;
        this.estatura = 0.0;
        this.dni = generarLetraDNI().concat(generarNumerosDNI());
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.estatura = 0.0;
        this.dni = generarLetraDNI().concat(generarNumerosDNI());
    }

    public Persona(String nombre, int edad, char sexo, double peso, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.estatura = estatura;
        this.dni = generarLetraDNI().concat(generarNumerosDNI());
    }

    public double calcularIMC(){
        int imcResultado;
        double imc = 0;
        imc = peso / (Math.pow(estatura,2));
        if((imc >= 0) && (imc < 20)){
            imcResultado = BAJO_PESO;
        }else if((imc >=20) && (imc <= 25)){
            imcResultado = PESO_NORMAL;
        }else{
            imcResultado = SOBRE_PESO;
        }
        return imcResultado;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    private String generarLetraDNI(){
        int asciiA = 65;
        int asciiZ = 90;

        double f = Math.random()/Math.nextDown(1.0);
        int asciiLetra = (int)Math.ceil(asciiA*(1.0 - f) + asciiZ*f);
        return Character.toString(asciiLetra);
    }

    private String generarNumerosDNI(){
        int x1 = 1;
        int x2 = 99999999;

        double f = Math.random()/Math.nextDown(1.0);
        int numero = (int)Math.ceil(x1*(1.0 - f) + x2*f);

        return String.format("%03d", numero);
    }

    private char comprobarSexo(char sexo){
        switch (sexo){
            case HOMBRE:
            case MUJER:
                return sexo;
            default:
                return HOMBRE;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Persona de nombre ").append(nombre).append(", con ")
                .append(edad).append(" años de edad.\n")
                .append("DNI: ").append(dni).append("\n")
                .append("Sexo: ").append(sexo).append("\n")
                .append("Peso: ").append(peso).append(" kg\n")
                .append("Estatura: ").append(estatura).append(" m")
                .toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }
}
