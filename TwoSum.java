import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int nums[] = {3,2,4};
		int target = 6;
		int ans[]  = new int[10];
		TwoSum obj = new TwoSum();
		ans = obj.twoSum(nums, target);
		System.out.println(Arrays.toString(ans));
	}
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			int subtractedValue = target -  nums[i];
			if(map.containsKey(subtractedValue)) {
				return new int[] { map.get(subtractedValue) , i}; 
			}
			
			map.put(nums[i],i);
		}
		return null;
	}
}