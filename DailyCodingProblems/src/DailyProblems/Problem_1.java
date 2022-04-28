package DailyProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1 {

    //  Question:

//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//    Bonus: Can you do this in one pass?


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < size; i++){
            int num = sc.nextInt();
            array.add(num);
        }


        System.out.println("Enter the k value : ");

        int k = sc.nextInt();

        boolean result = addUpToK(array, k);
        System.out.println(result);



    }

    private static boolean addUpToK(ArrayList<Integer> array, int k) {

        for (int n : array){
            if(array.contains(k-n)){
                System.out.println("The two numbers  " + n + " & " + (k-n) +  " from the list add up to " + k );
                return true;
            }
        }

        return false;
    }


}
