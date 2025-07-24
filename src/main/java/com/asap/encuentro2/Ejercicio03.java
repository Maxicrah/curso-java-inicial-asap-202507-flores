package com.asap.encuentro2;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

//        Ejercicio03
//        Escribir un programa que lea por teclado un numero entero positivo y calcule la suma de sus cifras.
//        Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar:
//        "La suma de sus cifras es: 10".

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int number = sc.nextInt();
        int result = 0;
        if (isPositiveNumber(number)){
            while (number > 0) {
                result+= number % 10; // 1 % 10 = 1
                number /= 10;
            }
        }else{
            System.out.println("el numero es negativo");
        }


        System.out.println("La suma de sus cifras es: " + result);
    }
    public static boolean isPositiveNumber(int number){
        return number > 0;
    }
}
