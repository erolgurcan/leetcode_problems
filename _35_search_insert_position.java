package leetcode_problems;

public class _35_search_insert_position {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4, 5, 10};
		int target = 2;
		System.out.println(searchInsert(nums, target));

	}

	public static int searchInsert(int[] nums, int target) {
	    int start = 0; 
	    int end = nums.length-1;
	    
	    while( start <= end){
	        
	        int middle = (start+end)/2;
	        
	        if( nums[middle] == target ){
	            return middle;
	        }else if( nums[middle] < target){
	            start = middle + 1;
	            
	        }else{
	            end = middle - 1;
	        }
	        
	    }
	    
	    return start;
		
	}
}
