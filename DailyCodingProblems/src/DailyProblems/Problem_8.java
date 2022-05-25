package DailyProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_8 {


    /*
    Question:

    Given a 1-indexed array of integers numbers that is already
    sorted in non-decreasing order, find two numbers such that they
    add up to a specific target number.

    Let these two numbers be numbers[index1] and numbers[index2]
    where 1 <= index1 < index2 <= numbers.length.

    Return the indices of the two numbers, index1 and index2,
    added by one as an integer array [index1, index2] of length 2.

    You may not use the same element twice.

    Example 1:
    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]

    Explanation:
    The sum of 2 and 7 is 9.
    index1 = 1, index2 = 2. Therefore We return [1, 2].
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

        Arrays.sort(array);

        System.out.println("Enter the Target Value : ");
        int target = sc.nextInt();

        int[] res_indexes = twoSumIndexes(array, target);

        System.out.print(res_indexes[0] +" "+ res_indexes[1]);

    }

    private static int[] twoSumIndexes(int[] array, int target) {

        int resultIndex[] = new int[2];

        // Point at first index of the array
        int low_pointer = 0;

        //Point at the end index of the array
        int high_pointer = array.length-1;

        while(low_pointer < high_pointer){
            int low = array[low_pointer];
            int high = array[high_pointer];

            if( (low + high) == target){
                // as array starts from 0
                resultIndex[0] = low_pointer + 1;
                resultIndex[1] = high_pointer + 1;
                break;
            } else if ((low+high)  < target) {
                // The array is a sorted one
                low++;
            }else {
                high++ ;
            }

        }// while


        return resultIndex;


    }


}
