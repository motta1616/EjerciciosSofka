package co.sofka.juego;

public class Videojuego implements Entregable{

    private static final int HORAS_ESTIMADAS = 10;
    private static final boolean ENTREGADO = false;
    public static final int MENOR = -1;
    public static final int MAYOR = 1;
    public static final int IGUAL = 0;
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;

    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
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
        int estado = IGUAL;
        Videojuego ref = (Videojuego)a;
        if (horasEstimadas > ref.getHorasEstimadas()) {
            estado = MAYOR;
        }else if(horasEstimadas < ref.getHorasEstimadas()) {
            estado = MENOR;
        }
        return estado;
    }
}
