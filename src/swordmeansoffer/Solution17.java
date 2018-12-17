package swordmeansoffer;

/**
 * 删除节点
 */
public class Solution17 {
    public void deleteNode(ListNode pListHead, ListNode pToBeDeleted) {
        if (pListHead == null || pToBeDeleted == null) {
            return;
        }
        //要删除的节点不是尾节点
        if (pToBeDeleted.next != null) {
            ListNode pNext = pToBeDeleted.next;
            pToBeDeleted.mValue = pNext.mValue;
            pToBeDeleted.next = pNext.next;
        }
        //链表只有一个节点，删除头节点（也是尾节点）
        else if(pListHead == pToBeDeleted){
            pToBeDeleted = null;
            pListHead = null;
        }
        //链表中有很对个节点，删除尾节点
        else{
            ListNode pNode = pListHead;
            while (pNode.next != pToBeDeleted){
                pNode = pNode.next;
            }
            pNode.next = null;
            pToBeDeleted = null;
        }
    }
}
