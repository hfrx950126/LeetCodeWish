package swordmeansoffer;

/**
 * 反转链表
 */
public class Solution23 {

    ListNode reverseList(ListNode pHead) {
        ListNode pReversedHead = null;
        ListNode pNode = pHead;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pPrev;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pReversedHead;
    }

}
