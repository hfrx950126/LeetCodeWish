package swordmeansoffer;

public class Solution24 {

    ListNode merge(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null) {
            return pHead2;
        } else if (pHead2 == null) {
            return pHead1;
        }
        ListNode pMergedHead = null;
        if (pHead1.mValue < pHead2.mValue) {
            pMergedHead = pHead1;
            pMergedHead.next = merge(pHead1.next, pHead2);
        } else {
            pMergedHead = pHead2;
            pMergedHead.next = merge(pHead1, pHead2.next);
        }
        return pMergedHead;
    }

    public static void main(String args[]) {
        ListNode node = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();

        node.mValue = 5;
        node1.mValue = 6;
        node2.mValue = 7;

        node.next = node1;
        node1.next = node2;
        node2.next = null;


        ListNode node8 = new ListNode();
        ListNode node9 = new ListNode();

        node8.mValue = 9;
        node9.mValue = 10;

        node8.next = node9;
        node9.next = null;
        Solution24 solution24 = new Solution24();
        ListNode node10 = solution24.merge(node, node8);

        ListNode node11 = node10;
        while (node11!= null) {

            System.out.println(node11.mValue);
            node11 = node11.next;
        }


    }

}
