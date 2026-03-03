/* Problem: Find missing number from the array
   approach: Using sum of n terms formula
   Time Complexity: O(n)
   Space Complexity: O(1)
      */
package a2z.arrays;

public class MissingNumber {
    public static int missingNum(int[] arr){
        long n = arr.length+1;
        long sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        long expectedSum = n*(n+1)/2;

        return (int) (expectedSum - sum);
    }

}
