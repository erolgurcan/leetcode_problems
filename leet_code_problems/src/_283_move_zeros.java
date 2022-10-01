
//Move Zeros recursive approach

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

//Runtime: 61 ms, faster than 9.73% of Java online submissions for Move Zeroes.
// Memory Usage: 43.4 MB, less than 98.60% of Java online submissions for Move Zeroes.
// Next challenges: 



public static void moveZeroes(int[] nums) {

    findZeros(0, nums);

}

public static void findZeros(int j, int[] nums) {

    if (j < nums.length - 1) {

        findZeros(j + 1, nums);

        if (nums[j] == 0) {
            shiftArray(j, nums);
        }

    }

}

public static void shiftArray(int idx, int nums[]) {
    int i = idx;
    int t = nums[i];

    while (i >= 0 && i < nums.length - 1) {

        nums[i] = nums[i + 1];
        i++;
    }
    nums[nums.length - 1] = t;

}