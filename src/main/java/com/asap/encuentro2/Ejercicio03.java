package com.asap.encuentro2;

import com.asap.util.Helper;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

//        Ejercicio03
//        Escribir un programa que lea por teclado un numero entero positivo y calcule la suma de sus cifras.
//        Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar:
//        "La suma de sus cifras es: 10".

        int number = Helper.readInteger("Ingrese un numero entero positivo ");
        int result = 0;
        while (number > 0) {
            result+= number % 10; // 1 % 10 = 1
            number /= 10;
        }

        System.out.println("La suma de sus cifras es: " + result);
    }

}
