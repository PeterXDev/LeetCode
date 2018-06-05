package ca.bcit.comp1510.leetcode.arraylist;

import java.util.LinkedList;

/**
 * June2_ReverseSingleLinkedList.
 *
 * @author Peter Xiong
 * @version 2018
 * @param <E>
 */
public class ReverseSingleLinkedList_Solution2<E>{
    private LinkedListNode<E> head;
    
    public ReverseSingleLinkedList_Solution2() {
        head = null;
    }
    
    /**
     *  Inserts a new node at the beginning of this list.
     *
     */
     public void addFirst(E item)
     {
        head = new LinkedListNode<E>(item, head);
     }
     
     public ReverseSingleLinkedList_Solution2<Integer> reverseList() {
         ReverseSingleLinkedList_Solution2<Integer> newList = new ReverseSingleLinkedList_Solution2<Integer>();
         LinkedListNode<E> curr = head;
                  
         while (curr != null) {
             newList.addFirst((Integer) curr.data);
             curr = curr.next;
         }
        return newList;
         
     }
    
    private static class LinkedListNode<E>{
        private E data;
        private LinkedListNode<E> next;
        
        public LinkedListNode(E data, LinkedListNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }
    
    public void printList() {
        LinkedListNode<E> curr = head;
        
        if (curr == null) {
            return;
        }
        
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ReverseSingleLinkedList_Solution2<Integer> list = new ReverseSingleLinkedList_Solution2<Integer>();
        ReverseSingleLinkedList_Solution2<Integer> list1 = new ReverseSingleLinkedList_Solution2<Integer>();
        
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(9);
        list.addFirst(12);
        list.addFirst(64);
        list.addFirst(123);
        
        System.out.println("Origin List is: ");
        list.printList();
        
        list1 = list.reverseList();
        
        System.out.println("Reverse List is: ");
        list1.printList();

    }

}
