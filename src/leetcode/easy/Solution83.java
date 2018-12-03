package leetcode.easy;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while(list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }
}
