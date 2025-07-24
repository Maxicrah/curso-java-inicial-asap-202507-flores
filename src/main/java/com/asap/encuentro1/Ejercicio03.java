package com.asap.encuentro1;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese calificacion: ");
        int number = sc.nextInt();

        if (!validateNumber(number)) {
            System.out.println("Nota inválida");
        } else if (number >= 0 && number < 5) {
            System.out.println("Insuficiente");
        } else if (number == 5) {
            System.out.println("Suficiente");
        } else if (number == 6) {
            System.out.println("Bien");
        } else if (number >= 7 && number < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

    }
    public static boolean validateNumber(int number){
        return number >= 0 && number <= 10;
    }
}
