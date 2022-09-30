package leetcode_problems;

import java.util.Arrays;
import java.util.Hashtable;

public class _205_isomorphic_strings {

//	Runtime: 4 ms, faster than 97.17% of Java online submissions for Isomorphic Strings.
//	Memory Usage: 43 MB, less than 52.84% of Java online submissions for Isomorphic Strings

	public static boolean Solution( ) {
		
		String s = "foo";
		String t = "bar";
		
		
		int[] arrS = new int[256];
		int[] arrT = new int[256];
		
		Arrays.fill(arrS, -1);
		Arrays.fill(arrT, -1);

		for(int i =0; i<s.length(); i++ ) {
			
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			
			if( arrS[s1] == -1 && arrT[t1] == -1 ) {
	
				arrS[s1] = t1 ;
				arrT[t1] = s1;
		}
			
			else if ( ! (arrS[s1] == t1 && arrT[t1] == s1)  ) {
				
				return false;
			}
			

		
}
		return true;

}}
