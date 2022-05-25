package DailyProblems;

import java.util.Scanner;

public class Problem_9 {

/*
    Question:

    Given the head of a linked list, remove the nth node
    from the end of the list and return its head.

    Ex:
    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]

 */

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node insert(Node root, int item){
        Node new_Node = new Node(item);
        new_Node.next = null;

        Node temp;

        if(root==null)
            root = new_Node;
        else {
            temp = root;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new_Node;
        }

        return root;
    }

    private static Node arrayToSinglyLList(int[] array, int size) {
        Node root = null ;
        for (int i=0 ; i<size; i++){
            root = insert(root, array[i]);
        }

        return root ;
    }



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the Array Elements : ");

        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter nth node  : ");
        int n = sc.nextInt();

        Node root = arrayToSinglyLList(array, size);

         Node temp = root;

         int i =0;

         while(i <= size-n){
           temp = temp.next ;
         }

         temp.next = temp.next.next;

          Node temp_2 =root ;
          while(temp_2 != null){
              System.out.println(temp_2.data);
             temp_2 = temp_2.next;

         }
    }




}
