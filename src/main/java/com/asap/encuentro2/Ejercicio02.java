package com.asap.encuentro2;

import com.asap.util.Helper;

import java.util.Scanner;

public class Ejercicio02 {
//    Escribir un programa que compruebe si dos numeros son amigos. Dos numeros enteros positivos A y B
//    son numeros amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios
//    de B es igual a A.
//    Los divisores propios de un número incluyen la unidad pero no el propio numero.
//    Un ejemplo de numeros amigos son los numeros 220 y 284.
//    Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
//    La suma de los divisores propios de 220 da como resultado 284
//    Los divisores propios de 284 son 1, 2, 4, 71 y 142.
//    La suma de los divisores propios de 284 da como resultado 220.
//    Por lo tanto 220 y 284 son amigos.
//    Otras parejas de numeros amigos son:
//            1184, 1210
//            2620, 2924-
//            5020, 5564
//            6232, 6368
//            10744, 10856
//            12285, 14595
//            17296, 18416

    public static void main(String[] args) {


        int firstNumber = Helper.readInteger("Ingrese primer numero: ");
        int secondNumber = Helper.readInteger("Ingrese segundo numero: ");

        int resultB = 0, resultA = 0;
            for(int i = 1; i < firstNumber; i++){
                if(firstNumber % i == 0){
                    resultA += i;
                }
            }

            for (int i = 1; i < secondNumber; i++) {
                if (secondNumber % i == 0) {
                    resultB += i;
                }
            }

        if (resultA == secondNumber && resultB == firstNumber) {
            System.out.println("Son amigos");
        } else {
            System.out.println("No son amigos");
        }

    }

}
