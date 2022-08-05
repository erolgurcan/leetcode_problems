package leetcode_problems;


//Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
//Memory Usage: 43.4 MB, less than 38.90% of Java online submissions for Running Sum of 1d Array.

public class _1480_running_sum_of_1d_array {

    public int[] runningSum(int[] nums) {
        
        int sum = 0;
		int [] arr = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			sum = sum + nums[i];
			arr[i] = sum;			
		}
	
		return arr;
        
    }
	
}
