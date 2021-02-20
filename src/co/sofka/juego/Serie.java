package co.sofka.juego;

public class Serie implements Entregable{
    private static final int NUMERO_TEMPORADA = 3;
    private static final boolean ENTREGADO = false;
    public static final int MENOR = -1;
    public static final int MAYOR = 1;
    public static final int IGUAL = 0;
    private String titulo;
    private int numeroTemporada;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporada = NUMERO_TEMPORADA;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String credor) {
        this();
        this.titulo = titulo;
        this.creador = credor;
    }

    public Serie(String titulo, int numeroTemporada, String genero, String credor) {
        this.titulo = titulo;
        this.numeroTemporada = numeroTemporada;
        this.genero = genero;
        this.creador = credor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporada=" + numeroTemporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if (entregado) {
            return true;
        }
        return false;
    }

    @Override
    public Integer compareTo(Object a) {
        int estado = MENOR;
        Serie ref = (Serie)a;
        if (numeroTemporada > ref.getNumeroTemporada()) {
            estado = MAYOR;
        } else if (numeroTemporada == ref.getNumeroTemporada()) {
            estado = IGUAL;
        }
        return estado;
    }
}
