package ejercicio3;

import java.util.Scanner;

public class EjercicioArray3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Ingrese el Tamaño del Array\n");
        int[] listaNum = new int[s.nextInt()];

        rellenarArray(listaNum);
        mostrarArray(listaNum);

        int primoMayor = mayorPrimo(listaNum);
        System.out.println("El primo mas grande es el " + primoMayor);

    }//main

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("En el Indice " + i + " esta el valor " + numeros[i]);
        }
    }

    public static void rellenarArray(int[] numeros) {
        int i = 0;
        while (i < numeros.length) {
            int num = ((int) Math.floor(Math.random() * 100 + 1));
            if (esPrimo(num)) {
                numeros[i] = num;
                i++;
            }

        }

    }

    public static boolean esPrimo(int num) {
        int contador = 2;
        boolean primo = true;

        while (contador < num) {
            if (num % contador == 0) {
                primo = false;
                break;
            } else {
                contador++;
            }
        }
        return primo;
    }

    public static int mayorPrimo(int lista[]) {
        int mayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }
        return mayor;
    }


}//class
