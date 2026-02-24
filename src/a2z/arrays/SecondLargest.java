/*
Problem: Second Largest Element
Approach: One pass
Time Complexity: O(n)
Space Complexity: O(n)
 */
package a2z.arrays;

public class SecondLargest {
    public static int secondLargestElement(int[]arr){
        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > large){
                second_large = large;
                large = num;
            } else if(num > second_large && num != large){
                second_large = num;
            }
        }
        return second_large;
    }
    public static void main(String[] args){
       int[]arr = {4,7,5,9};

       int ans = secondLargestElement(arr);
       System.out.println("Second Largest element is:" +ans);
    }

}
