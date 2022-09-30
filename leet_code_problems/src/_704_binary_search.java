package leetcode_problems;

public class _704_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	
	
    public int search(int[] nums, int target) {
        
        for( int i = 0; i<nums.length; i++ ){
            
            if(target  == nums[i])
                return i;
        }
        return -1;
        
    }
	
}
