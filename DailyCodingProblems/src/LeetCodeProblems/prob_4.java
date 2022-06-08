package leetCodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class prob_4 {

     /* Longest Substring Without Repeating Characters
    Given a string s, find the length of the
    longest substring without repeating characters.
    Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    */

    // ref :- https://leetcode.com/problems/longest-substring-without-repeating-characters/


    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();


        System.out.println("Length of the longest substring : " + lengthLongestSubstr(str));

    }

    private static int lengthLongestSubstr(String str) {

        int ans = 0;

        int i = -1;
        int j= -1;

        HashMap<Character, Integer> mapChar = new HashMap<>();

        while(i < str.length() - 1  )
        {

            while (i<str.length() - 1 ){
                i++;
                char ch =  str.charAt(i);

                mapChar.put(ch, mapChar.getOrDefault(ch,0)+1);



                if(mapChar.get(ch) == 2){
                    break;
                }
                else{
                    int len = i - j;
                    if(len > ans){
                        ans = len;
                    }
                }
            }//while1

            while(j<i){
                j++;
                char ch = str.charAt(j);
                mapChar.put(ch, mapChar.get(ch) - 1);

                if(mapChar.get(ch) == 1){
                    break;
                }
            }
        }

        return ans;

    }


}
