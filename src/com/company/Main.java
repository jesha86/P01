package com.company;

import com.sun.prism.shader.Solid_ImagePattern_AlphaTest_Loader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        } else  if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = -4;
        int b = 25;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
