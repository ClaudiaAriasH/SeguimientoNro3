/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientonro3;

import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author s109e9
 */
public class SeguimientoNro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************** Seguimiento 3 **************************** ");

        System.out.println("Punto 1: ");
        alturaArbol();
        System.out.println("Punto 2: ");
        numAleatorio();
        System.out.println("Punto 3: ");
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        estiloPalabra(palabra);
        System.out.println("Punto 4: ");
        horoscopo();
    }

    /**
     * Permite calcular la altura de un arbol
     */
    public static void alturaArbol() {
        int angulo = 35;

        double anguloConvert = Math.toRadians(angulo);
        int x = 20;
        int y;
        y = (int) Math.round(x * Math.tan(anguloConvert));
        System.out.println("Altura del arbol: " + y);
    }

    /**
     * Permite generar u número de 6 digitos número aleatorio de 6 dígitos.
     *
     */
    public static void numAleatorio() {
        double numero = Math.round(Math.random() * 1000000);
        int numeroAleatorio = (int) numero;
        System.out.println("Número aleatorio de 6 digitos: " + numeroAleatorio);
    }

    /**
     * Permite ingresar una palabra por consola e imprimir esta palabra en
     * (uppercase, lowercase, camelcase)
     *
     * @param palabra
     */
    public static void estiloPalabra(String palabra) {

        String mayuscula = palabra.toUpperCase();
        String miniscula = palabra.toLowerCase();
        //String camel = palabra.toCamelCase();

        String primeraLetra = miniscula.substring(0, 1).toUpperCase();
        String camelCase = miniscula.replace(miniscula.substring(0, 1), primeraLetra);

        System.out.println("Palabra en CamelCase " + camelCase);
        System.out.println("Palabra en UpperCase " + mayuscula);
        System.out.println("Palabra en LowerCase " + miniscula);

    }

    /**
     * Permite obtener una frase del horoscopo de forma aleatoria
     */
    public static void horoscopo() {

        ArrayList<String> frases = new ArrayList<>();

        frases.add("Todo lo que seas capaz de creer, eres capaz de conseguir.");
        frases.add("Serás más poderoso cuando tengas control total sobre ti mismo.");
        frases.add("La sabiduría y la casualidad no van unidas de la mano.");
        frases.add("Lo que hay en el ayer o en el mañana no es nada comparado con lo que hay en nuestro interior.");
        frases.add("Cáete siete veces y levántate ocho.");
        frases.add("Nunca es tarde para comenzar un nuevo proyecto, para ser quien siempre has deseado ser.");
        frases.add("Con pensamientos positivos y perseverancia, solo es cuestión de tiempo que superes las adversidades y te propongas nuevos retos.");
        frases.add("La vida es un 10% lo que nos ocurre, y un 90% cómo reaccionamos a ello.");
        frases.add("No es más rico quien más tiene, sino quien menos necesita.");
        frases.add("Intenta y falla, pero nunca falles en intentarlo.");
        frases.add("Solo los hombres más sabios son capaces de saborear los momentos más simples.");
        frases.add("cada segundo que goces, será segundo aprovechado.");

        double numero = Math.round(Math.random() * 11);
        int numeroAleatorio = (int) numero;

        //Random r = new Random();        
        // int randomNumber = r.nextInt(frases.size());
        System.out.println("Frase horóscopo: " + frases.get(numeroAleatorio));

    }

}
