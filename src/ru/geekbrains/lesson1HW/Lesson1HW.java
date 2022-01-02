package ru.geekbrains.lesson1HW;

public class Lesson1HW {
    public static void main(String[] args) {
        //  task 2
        byte myByte = 1;
        short myShort = 1;
        int myInt = 1;
        long myLong = 1;
        float myFloat = 1.0f;
        double myDouble = 1.0;
        char myChar = '0';
        boolean myBoolean = true;

        System.out.println(calculateExpression(1,2,3,4));
        System.out.println(isSumWithinLimits(1,1));
        System.out.println(isSumWithinLimits(2,8));
        System.out.println(isSumWithinLimits(4,8));
        System.out.println(isSumWithinLimits(9,11));
        System.out.println(isSumWithinLimits(21,1));
        negativeOrPositive(-5);
        negativeOrPositive(0);
        negativeOrPositive(5);
        System.out.println(isNegative(-5));
        System.out.println(isNegative(5));
        sayHello("Andrew");
        System.out.println(isYearLeap(4));
        System.out.println(isYearLeap(5));
        System.out.println(isYearLeap(100));
        System.out.println(isYearLeap(267));
        System.out.println(isYearLeap(400));
        System.out.println(isYearLeap(1600));
    }

    //  task 3
    public static float calculateExpression(int num1, int num2, int num3, int num4) {
        return num1 * (num2 + ((float) num3 / num4));
    }

    //  task 4
    public static boolean isSumWithinLimits(int num1, int num2) {
        return (num1 + num2) >= 10 && (num1 + num2) <= 20;
    }

    //  task 5
    public static void negativeOrPositive(int num1) {
        if (num1 >= 0) {
            System.out.println("Ваше число " + num1 + " - положительное");
        } else {
            System.out.println("Ваше число " + num1 + " - отрицательное");
        }
    }

    //  task 6
    public static boolean isNegative(int num1) {
        return num1 < 0;
    }

    //  task 7
    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //  task 8
    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
