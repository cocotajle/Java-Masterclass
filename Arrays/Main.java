package com.natjavaudemy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give numner of elements your  array:");
        int count = sc.nextInt();
    //    sc.nextInt();

        int[] returnedArray = readIntigers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Min number: "+ returnedMin);


    }

    private static int[] readIntigers(int counter) {

        int array[] = new int[counter];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
          //  sc.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for( int i = 0;i<array.length;i++){
            int value = array[i];

            if(value<min){
                min = value;
            }

        }return min;
    }
}


