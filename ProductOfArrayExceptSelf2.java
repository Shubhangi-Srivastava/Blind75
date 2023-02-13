import java.util.Arrays;

/**
 * -----Leetcode Problem 238: Approach 2 -----
 * Author: Shubhangi Srivastava
 * Time Complexity : O(n)
 * Space Complexity: O(1) beacause here we are taking 1 array only which is required by the question. No extra space.
 * Explanation: We are storing products on the left side of the element except the element itself in the ans[]
 * We are storing products on the right side of the element except the element itself in the right running pointer
 * Finally, we store the final product of right[i] and ans[i] (ans[i] is basically left prod) in ans[i]
 * Post which we change right to right * nums[i] (consider it like you are storing values in right array)
 * Hence the space complexity is O(1)
 */

 public class ProductOfArrayExceptSelf2 {
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int ans[] = new int[nums.length];
        ProductOfArrayExceptSelf2 obj = new ProductOfArrayExceptSelf2();
        ans = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        ans[0] = 1; //the 1st element's left product will be 1 as it has no element to it's left

        for(int i =1; i < nums.length; i++){ //we start from the 1st index as 0th index of left[]is 1
            ans[i] = nums[i-1] * ans[i-1];
        }
        int right =1;
        for(int i = nums.length-1; i >= 0; i--){
            ans[i] = right * ans[i];
            right = right * nums[i];
        }
        return ans;
    }
}