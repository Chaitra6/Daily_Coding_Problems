package DailyProblems;

import java.util.Scanner;

public class Problem_7 {
/*
    Question
     Given the head of a singly linked list, return the middle node of the linked list.
    If there are two middle nodes, return the second middle node.
    Example 1:
    // Odd list size
    Input: head = [1,2,3,4,5]
    Output: 3

    // Even list size
    Example 2:
    Input: head = [1,2,3,4,5,6]
    Output: 4
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
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
            root=new_Node;
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

        Node root = arrayToSinglyLList(array, size);

        Node midNode =  middleNode(root,size);

        System.out.println("Middle Node is : " +midNode.data);
    }

    private static Node middleNode(Node head, int size) {

            Node pt_slow = head;
            Node pt_fast = head ;

            while(pt_fast != null && pt_fast.next!=null){
                // moves 1 node at a time
                pt_slow = pt_slow.next;

                // moves 2 nodes at a time
                pt_fast = pt_fast.next.next;
            }

            return pt_slow;

    }




}
