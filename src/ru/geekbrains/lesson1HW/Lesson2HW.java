package ru.geekbrains.lesson1HW;

import java.util.Arrays;

public class Lesson2HW {
    public static void main(String[] args) {
        //  checking 1 task
        int[] array = {1,0,0,1};
        System.out.println(Arrays.toString(array));
        swap0and1places(array);
        System.out.println(Arrays.toString(array));

        //  checking 2 task
        int[] array2 = new int[8];
        System.out.println(Arrays.toString(array2));
        fillArray(array2);
        System.out.println(Arrays.toString(array2));

        //  checking 3 task
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array3));
        changeArrayValues(array3);
        System.out.println(Arrays.toString(array3));

        //  checking 4 task
        int[][] squareArray = new int[5][5];
        printSquareArray(squareArray);
        fillDiagonalesByNums(squareArray);
        printSquareArray(squareArray);

        //  checking 5 task
        int[] array4 = {1, 2, 3, 4};
        minAndMaxInArray(array4);

        //  checking 6 task
        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 2, 4};
        int[] array7 = {1, 1};
        System.out.println(cheackBalance(array5));
        System.out.println(cheackBalance(array6));
        System.out.println(cheackBalance(array7));

        //  checking 7 task
        int[] array8 = {1, 2, 3};
        System.out.println(Arrays.toString(array8));
        moveNumsInArrayToCountTimes(array8, 1);
        System.out.println(Arrays.toString(array8));
        moveNumsInArrayToCountTimes(array8, -1);
        System.out.println(Arrays.toString(array8));
        moveNumsInArrayToCountTimes(array8, -1);
        System.out.println(Arrays.toString(array8));
    }

    //  task 1
    public static void swap0and1places(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    //  task 2
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 3 * i;
        }
    }

    //  task 3
    public static void changeArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void printSquareArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    //  task 4
    public static void fillDiagonalesByNums(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
            array[i][array.length - i - 1] = 1;
        }
    }

    //  task 5
    public static void minAndMaxInArray(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min number in array is " + min);
        System.out.println("Max number in array is " + max);
    }

    //  task 6
    public static boolean cheackBalance(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sumLeft += array[i];
            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight) {
                break;
            } else {
                sumRight = 0;
            }
        }
        return sumLeft == sumRight;
    }

    //  task 7
    public static void moveNumsInArrayToCountTimes(int[] array, int count) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                int bufferNumber = array[array.length - 1];
                for (int k = array.length - 1; k > 0; k--) {
                    array[k] = array[k - 1];
                }
                array[0] = bufferNumber;
            }
        } else {
            count *= -1;
            for (int j = 0; j < count; j++) {
                int bufferNumber = array[0];
                for (int z = 0; z < array.length - 1; z++) {
                    array[z] = array[z + 1];
                }
                array[array.length - 1] = bufferNumber;
            }
        }
    }
}
