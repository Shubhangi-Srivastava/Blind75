import java.util.Arrays;

/**
 * -----Leetcode Problem 238: Approach 1 -----
 * Author: Shubhangi Srivastava
 * Time Complexity : O(n)
 * Space Complexity: O(n) beacause here we are taking 3 arrays, namely left, right and ans 
 * Explanation: We are storing products on the left side of the element except the element itself in the left[]
 * We are storing products on the right side of the element except the element itself in the right[]
 * Finally, we store the final product i.e., product of both left and right in ans[] array. So we require 3 loops and 3 arrays
 * Hence the space complexity is O(n)
 */

 public class ProducOfArrayExceptSelf {
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int ans[] = new int[nums.length];
        ProducOfArrayExceptSelf obj = new ProducOfArrayExceptSelf();
        ans = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int ans[] = new int[nums.length];

        left[0] = 1; //the 1st element's left product will be 1 as it has no element to it's left
        right[nums.length-1] = 1; //the last element's right product will be 1 as it has no element to it's right

        for(int i =1; i < nums.length; i++){ //we start from the 1st index as 0th index of left[]is 1
            left[i] = nums[i-1] * left[i-1];
        }
        for(int i = nums.length-2; i >=0; i--){
            right[i] = nums[i+1] * right[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}