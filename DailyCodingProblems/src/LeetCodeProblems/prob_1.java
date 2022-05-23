package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prob_1 {

//    Question
//
//    Given an integer array nums of length n and an integer target, find three integers in nums
//    such that the sum is closest to target.
//
//    Return the sum of the three integers.
//
//    You may assume that each input would have exactly one solution.
//
//
//
//            Example 1:
//
//    Input: nums = [-1,2,1,-4], target = 1
//    Output: 2
//    Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//    Example 2:
//
//    Input: nums = [0,0,0], target = 1
//    Output: 0



        public static int threeSumClosest(int[] nums, int target) {

            int result = nums[0] + nums[1] + nums[nums.length - 1];

            //Sort the array
            Arrays.sort(nums);

            for(int i =0; i<nums.length-2; i++){

                // One position greater than the curr_position
                int pointer_1 = i+1;

                // Pointer 2 set to the last element of the Array
                int pointer_2 = nums.length-1 ;

                while(pointer_1 < pointer_2){

                    int current_sum = nums[i] + nums[pointer_1] + nums[pointer_2] ;


                    if(current_sum > target){
                        // We have sorted the array, so the last element has higher value
                        // So we are setting pointer_2 to the next lowest value
                        pointer_2 -- ;
                    }else{
                        pointer_1 ++ ;
                    }


                    if(Math.abs(current_sum - target) < Math.abs(result-target)){
                        result = current_sum;
                    }
                }//while


            }//for

            return result;

        }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < size; i++){
            nums[i] = sc.nextInt();
        }


        System.out.println("Enter the 'target' value : ");

        int target = sc.nextInt();

        int result = threeSumClosest(nums, target);

        System.out.println("\n The Sum closest to the target is : " + result);


        // input : -1 1 2 -4

    }


}
