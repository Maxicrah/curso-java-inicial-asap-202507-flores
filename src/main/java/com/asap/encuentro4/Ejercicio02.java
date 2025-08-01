package com.asap.encuentro4;

//Programa que genera un array de 8 enteros aleatorios
//entre 1 y 10, lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.


import java.util.Arrays;
import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {
        final int MAX = 8;

        int[] array = generateArray(MAX);
        System.out.println("Array original: " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));


    }

    public static int[] generateArray(int size){
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10) + 1;
        }
        return array;
    }

    public static void bubbleSort(int[] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

    }
        }
}
