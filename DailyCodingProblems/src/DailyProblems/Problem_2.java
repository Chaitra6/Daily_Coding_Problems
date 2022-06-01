package DailyProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_2 {

/*
    Question
    Given an array of integers, return a new array such that each element at index i of the new array
    is the product of all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5],
    the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    */



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }


        int[] result = arrayProduct(array, size);

        for(int i = 0; i<size ; i++){
            System.out.println(result[i] + "   ");

        }



    }

    private static int[] arrayProduct(int[] array, int size) {

        if (size == 1) {
            System.out.println("Array has only one element...\nArray Product cannot be formed");
            return array;
        }

        int[] leftArr = new int[size];
        int[] rightArr = new int[size];
        int[] productArr = new int[size];

        leftArr[0] = 1;
        rightArr[size-1] = 1;


        // Generate left array
        for(int i = 1; i< size; i++){
            leftArr[i]= array[i-1] * leftArr[i-1];
        }


        //Generate right array
        for(int i = size-2; i >=0 ; i--){
            rightArr[i]= array[i+1] * rightArr[i+1];
        }


        // generating product array
        for(int i = 0; i<size ; i++){

            productArr[i] = leftArr[i] * rightArr[i];
        }

        return productArr;

    }

}
