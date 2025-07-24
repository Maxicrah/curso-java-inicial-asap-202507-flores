package com.asap.util;

import java.util.Scanner;

public class Helper {
    private static Scanner sc = new Scanner(System.in);

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

    public static boolean validateInteger(int number){
        return number >= 0;
    }

    public static void closeScanner(){
        sc.close();
    }

    public static String readMessage(String message){
        System.out.println(message);
        return sc.nextLine();
    }
}
