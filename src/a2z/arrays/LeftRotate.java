/* Problem: Left Rotate Array by one
   Approach: Single pass
   Time Complexity: O(N)
   Space Complexity: O(1)
 */
package a2z.arrays;

public class LeftRotate {
    public static void leftRotateByOne(int[] nums){

        int x = nums[0];
        for(int i = 1; i<nums.length; i++){
            nums[i-1] = nums[i];
        }
       nums[nums.length-1] = x;
    }

}
