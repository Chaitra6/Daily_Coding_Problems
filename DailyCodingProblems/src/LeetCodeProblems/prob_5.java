package leetCodeProblems;

import dailyProblems.Problem_9;

public class prob_5 {
    /*Merge Two Sorted Lists
      You are given the heads of two sorted
      linked lists list1 and list2.

      Merge the two lists in a one sorted list.
      The list should be made by splicing together
      the nodes of the first two lists.

      Return the head of the merged linked list.
  */

    public static class Node{
        int val;
        Node next;


        public Node(int val) {
            this.val = val;
            this.next = null;
        }

    }


    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);


        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);


        // both list head as parameters
        Node node = mergeLists(list1, list2);

        //print
        while(node!=null){
            if(node.next == null){
                System.out.print(node.val);
            }
            else {
                System.out.print(node.val + " -> ");
            }
            node = node.next ;
        }
    }

    private static Node mergeLists(Node list1, Node list2) {

        //edge case
        if(list1 == null || list2 == null){

            if(list1 == null){
                return list2;
            }
            else{
                return list1;
            }
        }

        Node newListHead = new Node(-1);
        Node prev = newListHead;

        //set pointer
        Node p1 = list1;
        Node p2 = list2;

        while (p1 != null && p2!=null){
            if(p1.val < p2.val){
                prev.next = p1;

                //move the pointer of List1 to the next node
                p1 = p1.next;
            }
            else {
                prev.next = p2;

                //move the pointer of List2 to the next node
                p2 = p2.next;
            }

            prev = prev.next;

        }

        // attach the remaining nodes if any
        prev.next = p1!=null ? p1:p2 ;

        return newListHead.next;


    }


}
