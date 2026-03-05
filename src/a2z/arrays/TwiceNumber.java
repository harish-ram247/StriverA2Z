/*Problem: Find the number that appears once and the other number twice
Time Complexity: O(N)
Space Complexity: O(1)
 */
package a2z.arrays;

public class TwiceNumber {
    public int getSingleElement(int[] nums){
        int xorr = 0;

        for(int num : nums){
            xorr ^= num;
        }
        return xorr;
    }

}
