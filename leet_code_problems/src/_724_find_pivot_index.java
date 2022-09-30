package leetcode_problems;

//Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
//Memory Usage: 52.3 MB, less than 54.73% of Java online submissions for Find Pivot Index.

public class _724_find_pivot_index {

	public int pivotIndex(int[] nums) {

		int sumLeft = 0;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		for (int i = 0; i < nums.length; i++) {

			if (sumLeft == (sum - sumLeft - nums[i])) {
				return i;
			}
			sumLeft += nums[i];
		}

		return -1;

	}

}
