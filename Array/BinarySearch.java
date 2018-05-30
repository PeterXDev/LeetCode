package ca.bcit.comp1510.leetcode.array;

import java.util.Scanner;

/**
 * Here's how algorithm works.
 * 
 * 1. At every step, consider the array between low and high indices
 * 2. Calculate the mid index.
 * 3. If element at the mid index is the key, return mid.
 * 4. If element at mid is greater than the key, then reduce the array size such that high 
 * becomes mid - 1. Index at low remains the same.
 * 5. If element at mid is less than the key, then reduce the array size such that low becomes 
 * mid + 1. Index at high remains the same.
 * 6. When low is greater than high, key doesn't exist. Return -1.
 * 
 * Solution 1 (Recurrsive Method)
 * Runtime Complexity
 *      Logarithmic, O(logn).
 * Memory Complexity
 *      Logarithmic, O(logn).
 *
 * Solution 2 (Iterative Method)
 * Runtime Complexity
 *      Logarithmic, O(logn).
 * Memory Complexity
 *      Logarithmic, O(1).
 *      
 * May30_BinarySearch.
 *
 * @author Peter Xiong
 * @version 2018
 */
public class May30_BinarySearch {
    
public static void main(String[] args) {
    int[] myArray = {1,2,23,34,45,56,66,68,78,90};
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter a key:");
    int key = myScanner.nextInt();
    int result1 = binary_search_iterative(key, myArray);
    System.out.println("Iterative Method result is: " + result1);
    
    int result2 = binary_search_recurrsive(key, myArray, 0, myArray.length - 1);
    System.out.println("Recurrisive Method result is: " + result2);
        
    myScanner.close();
}

private static int binary_search_recurrsive(int key, int[] myArray, int low, int high) {
    int middle = (low + high) / 2;
    
    if (low > high) {
        return -1;
    }
    
    if(key == myArray[middle]) {
        return middle;
    } else if (key < myArray[middle]) {
        return binary_search_recurrsive(key, myArray, low, middle - 1);
    } else {  // key > middleValue
        return binary_search_recurrsive(key, myArray, middle + 1, high);
    }
}

private static int binary_search_iterative(int key, int[] myArray) {
    int low = 0;
    int high = myArray.length - 1;
    
    do {
        int middle = (low + high) / 2;
        int middleValue = myArray[middle];
        
        if (key == middleValue) {
            return middle;
        } else if (key < middleValue){
            high = middle - 1;
        } else {    // key > middleValue
            low = middle + 1;
        }
    } while (low <= high);
    
    return -1;
}
}
