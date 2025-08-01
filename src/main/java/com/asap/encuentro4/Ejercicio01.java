package com.asap.encuentro4;

import com.asap.util.Helper;

public class Ejercicio01 {

    public static void main(String[] args) {

        int number = Helper.readInteger("Ingrese numero: ");
        viewResult(number);

    }

    public static void viewResult(int number){
        if(isNumberPrime(number)){
            System.out.println("Numero primo");
        }else{
            System.out.println("No es primo");
        }
    }


    public static boolean isNumberPrime(int number){
        boolean isPrime = true;
        int count = 0;
        for (int i = 1 ;i <= number;i++){
            if(number % i == 0 ){
                count++;
            }
            if (count > 2){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

