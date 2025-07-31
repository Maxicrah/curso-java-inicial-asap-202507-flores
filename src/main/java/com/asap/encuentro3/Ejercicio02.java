package com.asap.encuentro3;

import com.asap.util.Helper;

//Escribir un programa que pida 6 numeros por teclado, los almacene
//en un array y que luego muestre el maximo valor, el minimo y las posiciones que ocupan en el array.

public class Ejercicio02 {

    public static void main(String[] args) {

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = Helper.readInteger("Ingrese un numero: ");
        }
        //inicializamos los valores máximo y mínimo con el primer elemento del array
        int max = array[0];
        int min = array[0];
        int maxPos = 0;
        int minPos = 0;
        //comparamos los valores maximo y minimo
        for (int i = 1; i < array.length; i++) {
            //si el numero actual es mayor que el maximo actualizamos el maximo y su posicion
            if (array[i] > max) {
                max = array[i];
                maxPos = i + 1;
            }
            //si el numero actual es menor que el minimo actualizamos el minimo y su posicion
            if (array[i] < min) {
                min = array[i];
                minPos = i + 1;
            }
        }

        System.out.println("Valor maximo: " + max + " en la posicion: " + maxPos);
        System.out.println("Valor minimo: " + min + " en la posicion: " + minPos);


    }


}
