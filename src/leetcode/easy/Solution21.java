package leetcode.easy;

public class Solution21 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        // Base case: return other list if one is null.
        // Takes care of (null, null), (null, non-null), and (non-null, null)
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // Recursive step: Find smaller head, return that head followed by the
        // recursively merged lists (excluding the smaller node itself).
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode buildListNode1(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        return l1;
    }
    public ListNode buildListNode2(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        return l1;
    }
    public static void main(String args[]){
       Solution21 solution21 = new Solution21();
       ListNode l1 = solution21.buildListNode1();
       ListNode l2 = solution21.buildListNode2();
       ListNode listNode = solution21.mergeTwoLists(l1,l2);

       while(listNode!=null){
           System.out.print(listNode.val+"->");
           listNode = listNode.next;

       }

    }
}
