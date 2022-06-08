package leetCodeProblems;

public class prob_6 {

    /* Question :
     Reverse a link list
     Given the head of a singly linked list,
     reverse the list, and return the reversed list.
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

        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);

        Node node = reverseList(root);

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

    private static Node reverseList(Node head) {

        Node curr = head;
        Node prev = null ;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }


}
