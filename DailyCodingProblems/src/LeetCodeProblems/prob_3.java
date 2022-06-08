package leetCodeProblems;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prob_3 {

//    Questions:
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.


    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < size; i++){
           array[i] = sc.nextInt();
        }

        System.out.println("Enter the 'target' value : ");
        int target = sc.nextInt();

        int[] res = twoSum(array, target);

        System.out.println("The Indices are :  " + res[0] +" "+ res[1]);

    }



    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]), i};
            map.put(nums[i], i);
        }

        return null;

    }


}
