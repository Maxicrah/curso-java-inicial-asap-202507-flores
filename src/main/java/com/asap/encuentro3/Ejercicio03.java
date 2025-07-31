package com.asap.encuentro3;

//Escribir un programa que pida 5 numeros enteros,
//los almacene en un array, e indique por pantalla si dicho array es capicua.

//Un número capicúa es aquel que se lee igual de izquierda a derecha que de
//derecha a izquierda. Por ejemplo, los números 12121 23432 45654 son capicúas.

import com.asap.util.Helper;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {

        boolean isPalindrome = true;
        int[] array = new int[5];
        int value, startIndex = 0;
        //guardamos los numeros en el array
        for (int i = 0; i<array.length; i++ ){
            array[i] = Helper.readInteger("Ingrese un numero: ");

        }
        //recorremos array al reverso
        System.out.println(Arrays.toString(array));
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
            value = array[startIndex];
            //comparamos el valor del ultimo indice con el primero
            if(value == array[i]){
                startIndex++;
            }else{
                isPalindrome = false;
                System.out.println("El array no es capicúa");
                break;
            }

        }
        if (isPalindrome){
            System.out.println("El array es capicúa");
        }


    }
}
