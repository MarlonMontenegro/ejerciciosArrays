package ejercicio1;

import java.util.Scanner;

public class ejercicioArrays1 {
    public static void main(String[] args) {


        int numeros[];
        numeros = new int[10];
        System.out.println("\nAGREGUE NUMEROS\n");
        agregarNumeros(numeros);
        System.out.println("\n______________________\n");
        System.out.println("\nNUMERO ELEGIDOS\n");
        mostrarArray(numeros);

        System.out.println("\n______________________\n");

    } //main

    public static void agregarNumeros(int[] numeros) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
    }

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("En el Indice " + i + " esta el valor " + numeros[i]);
        }
    }


}//class
