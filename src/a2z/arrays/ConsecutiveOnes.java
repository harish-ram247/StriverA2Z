/* Problem: Count maximum consecutive ones
   Approach: Array traversal
   Time Complexity: O(n)
   Space Complexity: O(1)
 */
package a2z.arrays;

public class ConsecutiveOnes {
    public int findMaximumConsecutiveOnes(int[] nums){
        int count = 0;
        int maxElement = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
        }
        return maxElement;
    }

}
