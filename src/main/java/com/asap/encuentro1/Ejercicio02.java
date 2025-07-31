package com.asap.encuentro1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

//Escribir un programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, anio) y
//calcule su numero de la suerte.
//El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y
//a continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
//Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
//Numero de la suerte: 28


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (dia - mes - año)");
        System.out.println("Dia: ");
        int day = sc.nextInt();
        System.out.println("Mes: ");
        int month = sc.nextInt();
        System.out.println("Año: ");
        int year = sc.nextInt();
        int luckyNumber = 0;
        int dateOfBirth = day + month + year;
    //descomponemos el numero en cifras
        while (dateOfBirth > 0) {
            luckyNumber = luckyNumber + dateOfBirth % 10; // 1 % 10 = 1
            dateOfBirth = dateOfBirth / 10;
        }

        System.out.println("dia: "+ day + " " + "mes: " + month + " " + "año: " + year);
        System.out.println("Numero de la suerte: " + luckyNumber);


    }
}
