/* Problem: Union of two sorted arrays
   Approach: Two pointers
   Time complexity: O(m+n)
   Space complexity: O(m+n)
 */
package a2z.arrays;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public List<Integer> findUnion(int[]arr1, int[]arr2, int n, int m){
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else if (arr2[j] < arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(j<m){
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }

}
