package co.sofka.electrodomestico;

public class Electrodomestico {
    protected static final int PRECIO_BASE = 100;
    protected static final String COLOR = "Blanco";
    protected static final String CONSUMO_ENERGETICO = "F";
    protected static final double PESO = 5;
    protected int precioBase;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
    }

    public Electrodomestico(int precioBase, double peso) {
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(String letra) {
        String letras[] = {"A", "B", "C", "D", "E", "F"};
        for(int i = 0; i < letras.length ; i++){
            if(letras[i].equals(letra)){
                consumoEnergetico = letra;
                break;
            }
            consumoEnergetico = CONSUMO_ENERGETICO;
        }
    }

    private void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        for(int i = 0; i < colores.length ; i++){
            if(colores[i].equalsIgnoreCase(color)) {
                this.color = color;
                break;
            }
            this.color = COLOR;
        }
    }

    public int precioFinal() {
        int valor = 0;
        switch (consumoEnergetico) {
            case "A":
                valor = 100;
                break;
            case "B":
                valor = 80;
                break;
            case "C":
                valor = 60;
                break;
            case "D":
                valor = 50;
                break;
            case "E":
                valor = 30;
                break;
            case "F":
                valor = 10;
                break;
        }

        if ((peso > 0) && (peso <= 19)) {
            valor += 10;
        } else if ((peso > 19) && (peso <= 49)) {
            valor += 50;
        } else if ((peso > 49) && (peso <= 79)) {
            valor += 80;
        } else {
            valor += 100;
        }
        return precioBase + valor;
    }

}
