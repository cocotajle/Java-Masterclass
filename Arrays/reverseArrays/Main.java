package com.natjavaudemy;
import java.util.Arrays;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        reverse();

    }
    // write your code here


    private static void reverse() {
        System.out.println("Give your number of elements in array:");
       int counter =scanner.nextInt();
        int array[] = new int[counter];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
             //scanner.nextInt();
            array[i] = number;

        }
        System.out.println("Normal: " + Arrays.toString(array));
            for(int i = 0 ; i<array.length/2 ; i ++){
                int  temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i  - 1] = temp;
            }
        System.out.println("Reverse array: " + Arrays.toString(array));

    }
}

