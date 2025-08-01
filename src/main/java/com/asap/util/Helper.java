package com.asap.util;

import java.util.Scanner;

public class Helper {
    private static Scanner sc = new Scanner(System.in);

    //lee si un numero es entero y ademas valida si es un numero positivo
    public static int readInteger(String message){
        int number;
        while (true) {
            System.out.println(message);
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                sc.nextLine();
                if (validateInteger(number)) {
                    return number;
                } else {
                    System.out.println("Número inválido debe ser un entero positivo");
                }
            } else {
                System.out.println("Entrada inválida debe ingresar un número entero");
                sc.nextLine();
            }
        }
    }
    //lee si un numero es double y ademas valida si es un numero positivo
    public static double readDouble(String message){
        double number;
        while (true) {
            System.out.println(message);
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
                sc.nextLine();
                if (validateDouble(number)) {
                    return number;
                } else {
                    System.out.println("Número inválido debe ser positivo");
                }
            } else {
                System.out.println("Entrada inválida debe ingresar un número");
                sc.nextLine();
            }
        }
    }
    //valida numero que sea positivo
    public static boolean validateInteger(int number){
        return number >= 1;
    }
    //valida numero double que sea positivo
    public static boolean validateDouble(double number){
        return number >= 0;
    }
    //cierra scanner limpia buffer
    public static void closeScanner(){
        sc.close();
    }
    //lee un mensaje escrito por el usuario
    public static String readMessage(String message){
        System.out.println(message);
        return sc.nextLine();
    }
}
