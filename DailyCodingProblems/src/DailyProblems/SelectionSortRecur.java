package dailyProblems;

import java.util.Scanner;

public class SelectionSortRecur {

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

        int[] arrBubble = selectionSortRecur( arr, 0 ) ;




        System.out.print("\nArray after sorting : \n");
        for(int i : arrBubble){
            System.out.print(i+" ");
        }

    }



    private static int[] selectionSortRecur(int[] arr, int index) {

        int low = index;

        if(index == arr.length){
            return arr;
        }

        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
               low = i+1 ;
            }
        }// for

        if(arr[index] > arr[low]){
            int temp = arr[index];
            arr[index] = arr[low];
            arr[low] = temp;
        }

        return  selectionSortRecur(arr , index+1) ;

    }





}
