/* Problem: Check if an Array is Sorted
Approach: Single pass
Time Complexity: O(n)
Space Complexity: O(1)
 */
package a2z.arrays;
public class ArraySorted {
    public boolean isSorted(int[]arr, int n){
        for(int i = 1; i<n; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[]arr = {4,5,7,8,9};
        int n = arr.length;
        ArraySorted obj = new ArraySorted();

        System.out.println(obj.isSorted(arr,n) ? "True" : "False");
    }
}
