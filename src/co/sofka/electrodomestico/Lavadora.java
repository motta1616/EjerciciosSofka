package co.sofka.electrodomestico;

public class Lavadora extends Electrodomestico{

    private static final int CARGA = 5;
    private int carga;

    public Lavadora() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
        this.carga = CARGA;
    }

    public Lavadora(int precioBase, double peso) {
        super(precioBase, peso);
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.carga = CARGA;
    }

    public Lavadora(int precioBase, String color, String consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int valor = super.precioFinal();
        if (carga > 30) {
            valor += 50;
        }
        return valor;
    }
}
