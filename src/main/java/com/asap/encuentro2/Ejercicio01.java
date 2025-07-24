package com.asap.encuentro2;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
//        Escribir un programa que muestre los N primeros numeros de la serie de Fibonacci.
//        El valor de N se lee por teclado.
//
//        La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie
//        es el numero 1. El segundo termino de la serie es el numero 1. Los siguientes terminos de la
//        serie de fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valor: ");
        int value = sc.nextInt();
        int a = 0, b = 1, aux;

        for (int i = 0; i < value; i++){
            aux = a;
            a = b;
            b = b + aux;
            System.out.println(a);
        }



    }
}
