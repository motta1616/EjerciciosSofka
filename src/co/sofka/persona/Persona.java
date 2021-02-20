package co.sofka.persona;

public class Persona {
    private static final char HOMBRE = 'H';
    private static final int BAJO_PESO = -1;
    private static final int NORMAL_PESO = 0;
    private static final int SOBRE_PESO = 1;
    private static int dni;
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;


    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = HOMBRE;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDni();
    }

    public int calcularImc() {
        double ideal = peso/Math.pow(altura,2);
        if (ideal < 20) {
            return BAJO_PESO;
        } else if ((ideal >= 20) && (ideal <= 25)) {
            return NORMAL_PESO;
        } else {
            return SOBRE_PESO;
        }
    }

    public boolean esMayorEdad() {
        boolean adulto = (edad >= 18) ? true : false;
        return adulto;
    }

    public void comprobarSexo(char sexo) {
        if (this.sexo == sexo) {
            this.sexo = sexo;
        } else {
            this.sexo = HOMBRE;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private static void generaDni() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
