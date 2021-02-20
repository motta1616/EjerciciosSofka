package co.sofka.electrodomestico;

public class Television extends Electrodomestico{
    private static final int RESOLUCION = 20;
    private static final boolean SINTONIZADORTDT = false;
    private int resolucion;
    private boolean sintonizadorTdt;

    public Television() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
        this.resolucion = RESOLUCION;
        this.sintonizadorTdt = SINTONIZADORTDT;
    }

    public Television(int precioBase, double peso) {
        super(precioBase, peso);
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.resolucion = RESOLUCION;
        this.sintonizadorTdt = SINTONIZADORTDT;
    }

    public Television(int precioBase, String color, String consumoEnergetico, double peso, int resolucion,
                      boolean sintonizadorTdt)
    {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    @Override
    public int precioFinal() {
        int valor = super.precioFinal();
        if (resolucion > 40) {
            int porcentaje = (int) Math.floor(valor * 0.3);
            valor += porcentaje;
        }
        if (sintonizadorTdt) {
            valor += 50;
        }
        return valor;
    }
}
