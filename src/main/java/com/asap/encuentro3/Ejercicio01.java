package com.asap.encuentro3;

import com.asap.util.Helper;



public class Ejercicio01 {
    public static void main(String[] args) {

    int peopleCount = Helper.readInteger("Ingrese cantidad de personas: ");
    double totalHeight = 0, averageHeight = 0;
    int countAboveAverage = 0, countBelowAverage = 0;
    for (int i = 1; i <= peopleCount; i++){
        double height = Helper.readDouble("Ingrese altura de la persona: " + i);
        totalHeight += height;
        averageHeight = totalHeight / i;
        if(height > averageHeight){
            countAboveAverage++;
        }else{
            countBelowAverage++;
        }
    }
        System.out.println("La altura media es: " + averageHeight);
        System.out.println("Cantidad personas mayor altura media: " + countAboveAverage);
        System.out.println("Cantidad personas menor altura media: " + countBelowAverage);
    }
}
