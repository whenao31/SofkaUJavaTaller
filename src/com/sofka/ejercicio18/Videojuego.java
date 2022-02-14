package com.sofka.ejercicio18;

public class Videojuego implements Entregable{

    protected static final String TITULO_DEFAULT = "";
    protected static final int HORAS_ESTIMADAS_DEFAULT = 10;
    protected static final boolean ENTREGADO_DEFAULT = false;
    protected static final String GENERO_DEFAULT = "";
    protected static final String COMPANIA_DEFAULT = "";

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo = TITULO_DEFAULT;
        this.horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.compania =COMPANIA_DEFAULT;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.compania =COMPANIA_DEFAULT;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = ENTREGADO_DEFAULT;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object obj) {
        int resultado;
        Serie serie = (Serie) obj;
        if (this.horasEstimadas > serie.getNumeroTemporadas()){
            resultado = 1;
        }else if (this.horasEstimadas < serie.getNumeroTemporadas()){
            resultado = -1;
        }else{
            resultado = 0;
        }
        return resultado;
    }
}
