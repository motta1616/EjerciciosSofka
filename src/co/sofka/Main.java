package co.sofka;

import co.sofka.electrodomestico.Electrodomestico;
import co.sofka.electrodomestico.Lavadora;
import co.sofka.electrodomestico.Television;
import co.sofka.juego.Serie;
import co.sofka.juego.Videojuego;
import co.sofka.persona.Persona;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        //Ejercicio 1
        int x = 7;
        int y = 7;

        if (x > y) {
            System.out.println("x es mayor a y");
        } else if (x < y) {
            System.out.println("y es mayor a x");
        } else {
            System.out.println("x es igual a y");
        }
        */
        /*
        // Ejercicio 2
        System.out.println("Porfavor ingrese el valor entero de x seguido del valor de y");
        Scanner usuario = new Scanner(System.in);
        int x = usuario.nextInt();
        int y = usuario.nextInt();
        if (x > y) {
            System.out.println("x es mayor a y");
        } else if (x < y) {
            System.out.println("y es mayor a x");
        } else {
            System.out.println("x es igual a y");
        }
        */
        /*
        // Ejercicio 3
        String radio = JOptionPane.showInputDialog("Introduce el radio porfavor");
        double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
        System.out.println("El area del círculo es: " + area);
        */
        /*
        //Ejercicio 4
        final double IVA = 0.21;
        String valor = JOptionPane.showInputDialog("Introduce el precio de un producto porfavor");
        double precio = Double.parseDouble(valor);
        double precioFinal = precio + (precio * IVA);
        System.out.println(precioFinal);
        */
        /*
        // Ejercicio 5
        int contador = 1;
        while (contador <= 100) {
            System.out.println(contador);
            contador++;
        }
        */
        /*
        //Ejercicio 6
        for (int contador = 1; contador <= 100; contador++) {
            System.out.println(contador);
        }
        */
        /*
        //Ejercicio 7
        Integer precio;
        do {
            String valor = JOptionPane.showInputDialog("Introduce un número entero");
            precio = Integer.parseInt(valor);
        } while (precio < 0);
        if (precio > 0) {
            System.out.println("El numero: " + precio + " es mayor a 0");
        } else {
            System.out.println("El numero: " + precio + " es igual a 0");
        }
        */
        /*
        //Ejercicio 8
        System.out.println("Ingrese el nombre del dia");
        Scanner usuario = new Scanner(System.in);
        String dia = usuario.nextLine().toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Lunes es un dia laboral");
                break;
            case "martes":
                System.out.println("Martes es un dia laboral");
                break;
            case "miercoles":
                System.out.println("Miercoles es un dia laboral");
                break;
            case "jueves":
                System.out.println("Jueves es un dia laboral");
                break;
            case "viernes":
                System.out.println("Viernes es un dia laboral");
                break;
            case "sabado":
                System.out.println("Sabado no es un dia laboral");
                break;
            case "domingo":
                System.out.println("Domingo no es un dia laboral");
                break;
            default:
                System.out.println("El nombre del dia no es valido");
        }
        */
        /*
        //Ejercicio 9
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String cambio = texto.replace("a", "e");
        System.out.println("Ingrese la frace");
        Scanner usuario = new Scanner(System.in);
        String adicion = usuario.nextLine();
        System.out.println(cambio + " " + adicion);
        */
        /*
        //Ejercicio 10
        System.out.println("Ingrese una frase");
        Scanner usuario = new Scanner(System.in);
        String frase = usuario.nextLine();
        String cambio = frase.replace(" ", "");
        System.out.println(cambio);
        */
        /*
        //Ejercicio 11  terminar
        System.out.println("Ingrese una frase");
        Scanner usuario = new Scanner(System.in);
        String frase = usuario.nextLine();
        System.out.println(frase.length());
        String f = "a";
        Integer a = frase.indexOf(f);
        String b = frase.substring(a + 1);
        int contadorA = 1;
        for (int i = 0; i < b.length(); i++) {
            if (a != null) {
                contadorA = ++contadorA;
            }
            a = b.indexOf(f);
            System.out.println(a);
            b = b.substring(a + 1);
            System.out.println(b);
        }
        System.out.println(contadorA);


        String frase = "";
        int contador = 0;
        int a = 0 ;
        int e = 0 ;
        int i = 0 ;
        int o = 0 ;
        int u = 0 ;

        System.out.println("Escribe una frase ");
        Scanner scFrase = new Scanner(System.in);
        frase = String.valueOf(scFrase.nextLine());

        frase.toLowerCase();

        for (int x = 0; x < frase.length(); x++) {
            if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){
                contador++;
            }
            if (frase.charAt(x)=='a'){
                a++;
            }
            if (frase.charAt(x)=='e'){
                e++;
            }
            if (frase.charAt(x)=='i'){
                i++;
            }
            if (frase.charAt(x)=='o'){
                o++;
            }
            if (frase.charAt(x)=='u'){
                u++;
            }
        }
        System.out.println("La Frace tiene una longitud de "+ frase.length());
        System.out.println("La palabra " + frase + "contiene " + contador + " vocales");
        System.out.println("De letras a tenemos " + a);
        System.out.println("De letras e tenemos " + e);
        System.out.println("De letras i tenemos " + i);
        System.out.println("De letras o tenemos " + o);
        System.out.println("De letras u tenemos " + u);
    }
        */
        /*
        // Ejercicio 12
        String valor1 = JOptionPane.showInputDialog("Ingrese una palabra ");
        String valor2 = JOptionPane.showInputDialog("Ingrese la palabra a comparar");
        Boolean resultado = valor1.equalsIgnoreCase(valor2);
        if (resultado) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println(valor1 + " Es diferente de " + valor2);
        }
        */
        /*
        //Ejercio 13
        LocalDateTime f1 = LocalDateTime.now();
        String patron = "yyyy/MM/dd hh:mm:ss";
        String formatiada = f1.format(DateTimeFormatter.ofPattern(patron));
        System.out.println(formatiada);
        */
        /*
        // Ejercicio 14
        String valor = JOptionPane.showInputDialog("Ingrese un número entero menor a 1000");
        int numero = Integer.parseInt(valor);
        for (int i = numero; i <= 1000; i += 2) {
            System.out.println(i);
        }
        */
        /*
        // Ekercicio 15
        int opcion = 0;
        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ******");
            System.out.println("1 - NUEVO ACTOR");
            System.out.println("2 - BUSCAR ACTOR");
            System.out.println("3 - ELIMINAR ACTOR");
            System.out.println("4 - MODIFICAR ACTOR");
            System.out.println("5 - VER TODOS LOS ACTORES");
            System.out.println("6 - VER PELICULAS DE LOS ACTORES");
            System.out.println("7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8 - SALIR");
            System.out.println("Ingrese el numero de la accion a ejecutar");

            Scanner usuario = new Scanner(System.in);
            opcion = usuario.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("NUEVO ACTOR");
                    break;
                case 2:
                    System.out.println("BUSCAR ACTOR");
                    break;
                case 3:
                    System.out.println("ELIMINAR ACTOR");
                    break;
                case 4:
                    System.out.println("MODIFICAR ACTOR");
                    break;
                case 5:
                    System.out.println("VER TODOS LOS ACTORES");
                    break;
                case 6:
                    System.out.println("VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    System.out.println("SALIENDO DEL MENU");
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
            }
        } while (opcion != 8);
        */
        /*
        //Ejercicio 16
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String usuario = JOptionPane.showInputDialog("Ingrese su edad");
        int edad = Integer.parseInt(usuario);
        usuario = JOptionPane.showInputDialog("Ingrese su sexo");
        char sexo = usuario.charAt(0);
        usuario = JOptionPane.showInputDialog("Ingrese su peso en Kg");
        double peso = Double.parseDouble(usuario);
        usuario = JOptionPane.showInputDialog("Ingrese su altura en mts");
        double altura = Double.parseDouble(usuario);

        Persona usuario1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona usuario2 = new Persona("Camila", 32, 'M');
        Persona usuario3 = new Persona();
        usuario3.setNombre("Daniel");
        usuario3.setEdad(21);
        usuario3.setSexo('H');
        usuario3.setPeso(45.5);
        usuario3.setAltura(1.54);

        muestrarPesoIdeal(usuario1);
        muestraMayorEdad(usuario1);
        muestraIformacion(usuario1);

        muestrarPesoIdeal(usuario2);
        muestraMayorEdad(usuario2);
        muestraIformacion(usuario2);

        muestrarPesoIdeal(usuario3);
        muestraMayorEdad(usuario3);
        muestraIformacion(usuario3);
        */
        /*
        // Ejercicio 17
        Electrodomestico tv1 = new Television();
        Electrodomestico tv2 = new Television(45, 18);
        Electrodomestico tv3 = new Television(56, "blanco", "A", 24, 32, false);
        Electrodomestico tv4 = new Television();
        Electrodomestico tv5 = new Television(62, 45);
        Electrodomestico lavadora1 = new Lavadora();
        Electrodomestico lavadora2 = new Lavadora(57, 26);
        Electrodomestico lavadora3 = new Lavadora(68, "gris", "F", 72, 43);
        Electrodomestico lavadora4 = new Lavadora();
        Electrodomestico lavadora5 = new Lavadora(36, 56);

        ArrayList <Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(tv3);
        electrodomesticos.add(tv4);
        electrodomesticos.add(tv5);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(lavadora4);
        electrodomesticos.add(lavadora5);

        int precioTv = 0;
        int precioLavadoras = 0;
        int precioElectrodomestico = 0;
        int precioTotalElectrodomestico = 0;

        for (Electrodomestico i: electrodomesticos) {
            i.precioFinal();
            if (i instanceof Television) {
                precioTv += i.precioFinal();
            }
            if (i instanceof Lavadora) {
                precioLavadoras += i.precioFinal();
            }
            if (i instanceof Electrodomestico) {
                precioTotalElectrodomestico += i.precioFinal();
                precioElectrodomestico = precioTotalElectrodomestico - precioTv - precioLavadoras;
            }
        }
        System.out.println("El precio de todos los televisores es de: " + precioTv);
        System.out.println("El precio de todas las lavadoras es de: " + precioLavadoras);
        System.out.println("El precio de otros electrodomesticos es de: " + precioElectrodomestico);
        */

        //Ejercicio 18
        Serie s1 = new Serie();
        Serie s2 = new Serie("El resplandor", "Leonardo");
        Serie s3 = new Serie("Calis", 3, "Terror", "Jesus");
        Serie s4 = new Serie();
        Serie s5 = new Serie("The big ban theory", "Jhon");

        Videojuego v1 = new Videojuego();
        Videojuego v2 = new Videojuego("Crash", 23);
        Videojuego v3 = new Videojuego("driver",32, "Accion", "Esport");
        Videojuego v4 = new Videojuego();
        Videojuego v5 = new Videojuego("Mario", 12);

        ArrayList <Serie> series = new ArrayList<>();
        s2.entregar();
        s4.entregar();
        series.add(s1);
        series.add(s2);
        series.add(s3);
        series.add(s4);
        series.add(s5);


        ArrayList <Videojuego> videojuegos = new ArrayList<>();
        v1.entregar();
        v3.entregar();
        v5.entregar();
        videojuegos.add(v1);
        videojuegos.add(v2);
        videojuegos.add(v3);
        videojuegos.add(v4);
        videojuegos.add(v5);

        int seriesEntregadas = 0;
        for (Serie i: series) {
            if (i.isEntregado()) {
                seriesEntregadas += 1;
                i.devolver();
            }
        }
        System.out.println("Se entregaron: " + seriesEntregadas + " series");

        int juegoEntregadas = 0;
        for (Videojuego i: videojuegos) {
            if (i.isEntregado()) {
                juegoEntregadas += 1;
                i.devolver();
            }
        }
        System.out.println("Se entregaron: " + juegoEntregadas + " videojuegos");
    }

    public static void muestrarPesoIdeal(Persona usuario) {
        int imc = usuario.calcularImc();
        if (imc == -1) {
            System.out.println("Usted tiene bajo peso");
        } else if (imc == 0) {
            System.out.println("Usted esta en el peso ideal");
        } else {
            System.out.println("Usted tiene sobre peso");
        }
    }

    public static void muestraMayorEdad (Persona usuario) {
        if ((usuario.esMayorEdad())) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
    public static void muestraIformacion (Persona usuario) {
        System.out.println(usuario);
    }
}
