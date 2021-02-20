package co.sofka.juego;

public interface Entregable {
    void entregar();
    void devolver();
    boolean isEntregado();
    Integer compareTo(Object a);
}
