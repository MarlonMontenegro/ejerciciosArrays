package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Introduce un tamaño\n");
        int[] numeros = new int[s.nextInt()];
        rellenarArrayAletatorio(numeros);
        mostrarArray(numeros);


    }//main

    public static void rellenarArrayAletatorio(int numeros[]) {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ((int) Math.floor(Math.random() * (10) + 1));
        }
    }

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("En el Indice " + i + " esta el valor " + numeros[i]);
        }
    }

}//class

