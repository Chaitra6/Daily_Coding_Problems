package DailyProblems;

public class Problem_6 {

    /*
    This problem was asked by Google.

    An XOR linked list is a more memory efficient doubly linked list.
    Instead of each node holding next and prev fields, it holds a field named both,
    which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an add(element)
    which adds the element to the end, and a get(index) which returns the node at index./


    If using a language that has no pointers (such as Python),
    you can assume you have access to get_pointer and dereference_pointer functions that converts between nodes
    and memory addresses.



    X-Or linked list
    0. efficient version of linked list which store addresses of previous and next nodes
       to implement Doubly Linked List using only single pointer
    1. It is memory efficient doubly linked list
    2. Instead of storing address of next node, it stores XOR of previous and next address




    ref:- https://stackoverflow.com/questions/33298225/is-it-possible-to-implement-xor-linkedlist-in-javadll-with-single-pointer
    No, you can't do this in Java at all
    -- you cannot get the address of an object or compute a reference to an
    object from other values. This allows the garbage collector to move objects
    around without interfering with the program.

*/

}
