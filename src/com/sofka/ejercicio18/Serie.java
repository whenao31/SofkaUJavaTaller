package com.sofka.ejercicio18;

public class Serie implements Entregable{

    protected static final String TITULO_DEFAULT = "";
    protected static final int N_TEMPORADAS_DEFAULT = 3;
    protected static final boolean ENTREGADO_DEFAULT = false;
    protected static final String GENERO_DEFAULT = "";
    protected static final String CREADOR_DEFAULT = "";

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this.titulo = TITULO_DEFAULT;
        this.numeroTemporadas = N_TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.creador = CREADOR_DEFAULT;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = N_TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = ENTREGADO_DEFAULT;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
        Videojuego videojuego = (Videojuego) obj;
        int resultado;

        if (this.numeroTemporadas > videojuego.getHorasEstimadas()){
            resultado = 1;
        }else if (this.numeroTemporadas < videojuego.getHorasEstimadas()){
            resultado = -1;
        }else{
            resultado = 0;
        }
        return resultado;
    }
}
