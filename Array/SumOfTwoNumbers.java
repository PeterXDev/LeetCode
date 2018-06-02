package ca.bcit.comp1510.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Given an array of integers and a value, determine if there are 
 * any two integers in the array which sum equal to the given value.
 * 
 * May31_SumOfTwoNumbers.
 *
 * @author Peter Xiong
 * @version 2018
 */
public class SumOfTwoNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] myArray = {1,2,5,3,97,23,34,9,0};
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter a Sum: ");
        int sum = myScanner.nextInt();
        
        boolean result1 = checkSumOfTwoNumbers_HashSet(sum, myArray);
        
        System.out.println("The result of HashSet is: " + result1);
        
        /** Sort myArray firstly. */
        Arrays.sort(myArray);
        
        boolean result2 = checkSumOfTwoNumbers_Linear(sum, myArray);
        
        System.out.println("The result of Linear is: " + result2);

        myScanner.close();
    }

    /**
     * Solution #1
     * Runtime Complexity
     *      Linear, O(n).
     * Memory Complexity
     *      Linear, O(n).
     */
    private static boolean checkSumOfTwoNumbers_HashSet(int sum, int[] myArray) {
        Set<Integer> foundValue = new HashSet<Integer>();
        
        for(int a : myArray) {
            if (foundValue.contains(sum - a)) {
                return true;
            }
            foundValue.add(a);
        }
        
        return false;
    }

    /**
     * Solution #2
     * Runtime Complexity
     *      Linearithmic, O(n logn).
     *      Here 'n logn' is the time complexity required to sort the array. 
     *      For a sorted array, the complexity would be linear, O(n).
     * Memory Complexity
     * Constant, O(1).
     */
    private static boolean checkSumOfTwoNumbers_Linear(int sum, int[] myArray) {
        int low = 0;
        int high = myArray.length - 1;
        
        int sumOfTwo;
        do {
            sumOfTwo = myArray[low] + myArray[high];
            if (sumOfTwo == sum) {
                return true;
            } else if(sumOfTwo > sum) {
                high -= 1;
            } else {
                low += 1;
            }
        } while (low <= high);
        
        return false;
    }

}
