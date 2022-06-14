package leetCodeProblems;

public class prob_8 {
/*
    Question:

    Given an integer n, return the number of structurally unique BST's (binary search trees)
    which has exactly n nodes of unique values from 1 to n.


    Example 1:
    Input: n = 3
    Output: 5

    Example 2:
    Input: n = 1
    Output: 1


 */

    public static void main(String[] args){

        int n = 3;
        System.out.println(" Structurally unique BST's are : " + numberOfBST(n));

    }

    private static int numberOfBST(int n) {
        int dp[] = new int[20];
        // base case
        if( n <= 1){
            return 1;
        }

        if(dp[n] > 0) {
            return dp[n];
        }

        for (int i = 1; i <= n; i++){
            dp[n] += numberOfBST(i - 1) * numberOfBST(n - i);
        }

        return dp[n];

      }



    }
