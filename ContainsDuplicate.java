/**
 * Author: Shubhangi Srivastava
 * Leetcode 217 :Contains Duplicate 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Can also be resolved using Maps
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
		
		int nums[] = {1,2,3,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        boolean ans = obj.containsDuplicate(nums);
		System.out.println(ans);
	}
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}  

