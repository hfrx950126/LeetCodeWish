package swordmeansoffer;

/**
 * 链表中倒数第K个节点
 */
public class Solution21 {
    public ListNode findKthToTail(ListNode pListHead, int k) {
        if (pListHead == null || k == 0) {
            return null;
        }
        ListNode pAhead = pListHead;
        ListNode pBehind = null;
        for (int i = 0; i < k - 1; ++i) {
            if (pAhead.next != null) {
                pAhead = pAhead.next;
            } else {
                return null;
            }
        }
        pBehind = pListHead;
        while (pAhead.next != null) {
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }
        return pBehind;

    }
}
