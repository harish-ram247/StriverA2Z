/*
Problem: Find Largest Element in the Array
Approach: Linear Scan
Time Complexity: O(n)
Space Complexity: O(1)
 */
package a2z.arrays;
import java.util.Scanner;
public class LargestElement {
    public static int  findLargest(int[]arr, int n){
        int max = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements of array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = LargestElement.findLargest(arr,n);
        System.out.println("The largest Element in the array is:" + max);

        sc.close();
    }

}

