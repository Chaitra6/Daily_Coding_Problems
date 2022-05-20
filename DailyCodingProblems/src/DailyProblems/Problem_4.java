package DailyProblems;
//8


import java.util.Scanner;

//Node Class
class Node {
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
public class Problem_4 {
    static Scanner sc = new Scanner(System.in);


    // Question :
//    A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
//
//    Given the root to a binary tree, count the number of unival subtrees.
//
//    For example, the following tree has 5 unival subtrees:
//
//            0
//            / \
//            1   0
//            / \
//            1   0
//            / \
//            1   1
//
//       Input for the above tree :   0, 1, -1, -1, 0, 1, 1, -1, -1, 1, -1, -1, 0, -1, -1



    public static int unival_count(Node root) {
        // Null Tree
        if(root==null) return 0;
        
        int count = unival_count(root.left) + unival_count(root.right);
        
        if(is_Unival(root)){
            count += 1;
        }
        
        return count;
    }

    private static boolean is_Unival(Node root) {

        if(root == null){
            return true;
        }
        // Check if left node and right node value is equal to Root Node value
        if((root.left != null) && (root.left.value != root.value ) ){
            return false;
        }
        if((root.right != null) && (root.right.value != root.value ) ){
            return false;
        }

        // Check for left and right subtrees are Unival
        if(is_Unival(root.left)  &&  is_Unival(root.right)){
            return true;
        }

        return false;
    }

    public static Node create_Tree() {

        Node root = null;

        System.out.println("Enter Node Data ");
        int value = sc.nextInt();

        // provide -1 if no node to be created
        if(value== -1){
            return null;
        }else {
            root = new Node(value);
        }


        //left node
        System.out.println("\nEnter Left Node Data of : "+ value);
        root.left = create_Tree();


        //right node
        System.out.println("\nEnter Right Node Data of : "+ value);
        root.right = create_Tree();

        return root;
    }





    public static void main(String[] args){


        // Create tree
        Node root = create_Tree();

        int count = unival_count(root);

        System.out.println((" The given Tree has " + count + " number of Unival Subtrees"));
    }


}


