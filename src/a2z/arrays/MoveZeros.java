/* Problem: Move Zeros to end of the Array
   Approach: Two pointers
   Time Complexity = O(N)
   Space Complexity = O(N)
 */
package a2z.arrays;
import java.util.*;
public class MoveZeros {
    public void moveZerosToEnd(int[]nums){
        int j = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;

        for(int i = j+1; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

}
