package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Array {
    //1
    public void getMinValueOfArr() {
        int[] list = {15, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30};
        int min = list[0];
        int max = list[list.length - 1];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println(min);
    }

    //3,4
    public void getMinAndMaxIndexOfArr() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Max : " + indexOfMax + "\n" + "Min : " + indexOfMin);
    }

    //5
    public void getSumOfOddNumbersInArr() {
        int[] array;
        array = new int[]{1, 2, 3, 4, 5, 6};
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                ++counter;
                sum += array[i];
                System.out.println(" " + array[i]);

            }
        }
        System.out.println("Odd : " + counter);
        System.out.println("Sum of odd numbers : " + sum);
    }

    //6
    public void getReverseArr() {
        int[] array = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

    public void countOddElementsOfArr() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(++count);
            }
        }
    }

    public void changeHalfOfArr() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        int half = array.length;
        int temp;
        System.out.print("\n");
        for (int i = 0; i < half / 2; i++) {
            temp = array[half - i - 1];
            array[half - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public void bubbleSort() {
        int[] arr = new int[]{1,3,55,23,11,17,7};
        int array = arr.length;
        for (int i = 0; i < array - 1; i++) {
            for (int j = 0; j < array - i - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

