package ru.zatonskii.test2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class test2 {

    public static Object Authentication;

    public static void main(String[] args) {
        Degree();
        squareRoot();
        Switch();


    }
    public static void Degree() {
        double a = 2, b = 8;
        int c = (int) pow(a, b);

        System.out.println(c);
    }
    public static void squareRoot() {
        double x = 256;
        double z = Math.sqrt(x);
        System.out.println("Квадратный корень:" + z);
    }

    public static void Switch() {
        short secretKey = 0b0101;
        char character = 'A';

        character = (char) (character ^ secretKey);
        System.out.println("Символ: " + character  + " его код в таблице" + (byte) character);

        character = (char) (character ^ secretKey);
        System.out.println("Символ: " + character  + " его код в таблице" + (byte) character);
    }
}
