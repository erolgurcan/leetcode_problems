import java.util.Queue;
import java.util.LinkedList;

public class _189_rotate_array {

    public static void main(String[] arr) {

        int[] nums = { 1, 2, 3 };
        int k = 2;

        rotate2(nums, k);

    }

    public static void rotate(int[] nums, int k) {

        int newIndex = 0;

        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {

            newIndex = (i + k) % temp.length;
            nums[newIndex] = temp[i];
        }

        System.out.println(nums);

    }

    public static void rotate2(int[] nums, int k) {

        Queue<Integer> q = new LinkedList<Integer>();

        if (nums.length == k || nums.length == 1) {
            return;
        }

        k = k % nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (i < k) {
                q.add(nums[(i + k) % nums.length]);
                nums[(i + k) % nums.length] = nums[i];

            } else {

                if (i + k < nums.length) {
                    q.add(nums[i + k]);
                    nums[i + k] = q.remove();
                } else {
                    nums[(i + k) % nums.length] = q.remove();
                }

            }
        }

        System.out.println("asd");
    }

}
