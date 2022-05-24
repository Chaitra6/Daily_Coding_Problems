package LeetCodeProblems;

import java.util.Scanner;

public class prob_2 {


//    Question:
//    Given a signed 32-bit integer x, return x
//    with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range return 0



    public static int reverse(int num) {
        int rev = 0  ;

        while(num != 0){
            int remainder = num % 10 ;
            num /= 10 ;

            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && remainder > 7){
                return 0 ;
            }

            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && remainder < -8){
                return 0 ;
            }

            rev = rev*10 + remainder ;
        }

        return rev ;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("\nReverse of the given number is " + reverse(num) );


        // Input : 12345
       //          1000000067
    }

}
