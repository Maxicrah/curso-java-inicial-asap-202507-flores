package com.asap.encuentro1;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        //Escribir un programa que compruebe si un anio es bisiesto
        //Un anio es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.

        //Forma sin func
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese año: ");
//        int year = sc.nextInt();
//        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.println("Es bisiesto");
//        }else{
//            System.out.println("No es bisiesto");
//        }

        System.out.println("Ingrese año: ");
        int year = sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }


    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
