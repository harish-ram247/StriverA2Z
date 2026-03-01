/*Problem: Linear Search
  Approach: Linear Traversal
  Time Complexity: O(N)
  Space Complexity: O(1)
 */
package a2z.arrays;

public class LinearSearch {
    public int linearSearch(int[] nums, int target){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
