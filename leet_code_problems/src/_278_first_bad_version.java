package leetcode_problems;

public class _278_first_bad_version {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(firstBadVersion(101));
		
	}
	
	
	
	public static boolean isBadVersion(int n) {
		int bad = 24;
		
		if( n >= bad)
		return true;
		
		if(n < bad) return false;
		
		return false;
	}
	
    public static int firstBadVersion(int n) {
    	int first = 1;
    	int last = n;
    	int middle = 1;
    	
    	while( true ) {
    		      
    		if(middle == last) {
    			System.out.println(middle);
    			return middle;
    		}
	
        	if( !isBadVersion( middle ) ) {
        		first = middle;
        		middle = (first/2) + (last/2)+1;
        	}
        	 
        	else {
        		last = middle;
        		middle = (first/2) + (last/2) +1;      			
        	}
        	
        	
    		
    	}
        
    }
	
	
}
