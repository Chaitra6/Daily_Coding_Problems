package leetCodeProblems;

public class prob_7 {

    /*     Question:
           Given a sorted array of distinct integers and a target value,
           return the index if the target is found. If not, return the index where
           it would be if it were inserted in order.
           You must write an algorithm with O(log n) runtime complexity.

           Example 1:
           Input: nums = [1,3,5,6], target = 5
           Output: 2

           */
    public static void main(String[] args){

            int arr[] = {1, 3, 5 ,6};
            int target = 5 ;

            int result = searchInsertPos( arr, target);

            System.out.println("\n Result is " + result);

    }

    private static int searchInsertPos(int[] arr, int target) {

        int low = 0 ;
        int high = arr.length - 1;

        while(low <= high){

            int mid = ( low + (high - low) ) / 2 ;

            if( arr[mid] == target ){
                return mid ;
            }

            if( arr[mid] > target ){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return low;


    }

}
