package DailyProblems;

import java.util.Scanner;

public class Problem_3 {


//    Question:
//    Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//
//    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//
//    You can modify the input array in-place


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] array = new int[len];

        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < len; i++){
            array[i] = sc.nextInt();
        }


        int result = findFirstMissingPositiveInteger(array, len);

        if(result == -1){
            System.out.println("The Array length is 0 or <2... No missing positive integer could be found " + result);
        }
        else {
            System.out.println("\n" + result);
        }



    }

    private static int findFirstMissingPositiveInteger(int[] array, int len) {

        boolean hasOne = false;
        if(len<2){
            return -1;
        }

        for (int num : array){
            if(num == 1)
            {
                hasOne = true;
                break;
            }
        }

        if(!hasOne){
            return 1;
        }

        // shifting all the non-positive numbers to the left side
        int positiveNumIndex = separateNonPositive(array, len);

        // create new array with only positive numbers from old array
        int[] arrayNew = new int[len - positiveNumIndex];

        int k = 0 ;
        for(int i=positiveNumIndex ; i<len; i++){
            arrayNew[k] = array[i];
            k++;
        }

//        for(int l = 0; l<arrayNew.length; l++){
//            System.out.print(arrayNew[l] + " ");
//
//        }

        for(int i =0; i< arrayNew.length; i++){
            int x = Math.abs(arrayNew[i]);

            if (x - 1 < arrayNew.length && arrayNew[x - 1] > 0)
                arrayNew[x - 1] *= -1;
        }

        for(int i =0; i< arrayNew.length; i++){
            if(arrayNew[i] > 0){
                return i+1;
            }
        }

        return arrayNew.length+1 ;
    }

    public static int separateNonPositive(int[] array, int len)
    {
        int i, j=0;
        for (i = 0; i < len; i++) {
            if (array[i] <= 0) {
                int temp;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                j++;
            }
        }
        // now j is at the position where the positive numbers start
        return j;
    }


}
