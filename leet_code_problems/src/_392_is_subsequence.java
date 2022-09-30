package leetcode_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _392_is_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Solution());
	}

	public static boolean Solution() {

		String s = "acb";
		String t = "ahbgdc";

		if (s.length() == 0)
			return true;
		if (t.length() == 0)
			return true;

		int j = 0;

		for (int i = 0; i < t.length(); i++) {

			if (s.charAt(j) == t.charAt(i)) {
				j++;

				if (j == s.length()) {
					return true;
				}
			}

		}

		return false;

	}
}
