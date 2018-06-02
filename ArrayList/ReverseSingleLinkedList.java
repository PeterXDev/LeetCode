package ca.bcit.comp1510.leetcode.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * June1_ReverseSingleLinkedList.
 *
 * @author Peter Xiong
 * @version 2018
 */
public class ReverseSingleLinkedList {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> listRevese = new LinkedList<Integer>();
        
        list.add(7);
        list.add(9);
        list.add(23);
        list.add(16);
        list.add(120);
               
        System.out.println(list);
        
        /**
         * Reverse list
         */
        Iterator myIter = list.iterator();
        Integer currItem;
        while(myIter.hasNext()) {
            currItem = (Integer) myIter.next();
            System.out.println(currItem);
            listRevese.addFirst(currItem);
        }
                
        System.out.println(listRevese);
    }
    
}
