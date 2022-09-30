package leetcode_problems;

public class _21_merge_two_sorted_list {

	public static ListNode main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list1 = new ListNode();
		ListNode list2 = new ListNode();
		ListNode list3 = new ListNode();
		while (list1 != null && list2 != null) {

			if (list1.val == list2.val) {
				list3 = new ListNode(list1.val, list3);
				list3 = new ListNode(list2.val, list3);
			}

			if (list1.val > list2.val) {
				list3 = new ListNode(list2.val, list3);
			}

			if (list1.val < list2.val) {
				list3 = new ListNode(list1.val, list3);
			}

			list1 = list1.next;
			list2 = list2.next;

		}
		
		return list3;

	}

}
