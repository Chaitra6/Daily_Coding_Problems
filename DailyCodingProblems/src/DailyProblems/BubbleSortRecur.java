package dailyProblems;


import java.util.Scanner;

public class BubbleSortRecur {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting : ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        int[] arrBubble = bubbleSort( arr, size ) ;




        System.out.print("\nArray after sorting : \n");
        for(int i : arrBubble){
            System.out.print(i+" ");
        }

    }

    private static int[] bubbleSort(int[] arr, int n) {

        if( n == 1 ){
            return arr;
        }

        for(int i = 0; i < n-1; i++ ){
            if(arr[i] > arr[i+1]){

                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }// for


        return bubbleSort(arr, n-1);
    }
}
