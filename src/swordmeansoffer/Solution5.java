package swordmeansoffer;

import java.util.Stack;

class ListNode {
    int mValue;
    ListNode next;

}

public class Solution5 {
    void printListReversingly(ListNode pHead) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = pHead;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.empty()) {
            node = stack.pop();
            System.out.println(node.mValue);

        }
    }

    public static void main(String args[]) {
        ListNode node = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        node.mValue = 5;
        node1.mValue = 6;
        node2.mValue = 7;
        node3.mValue = 8;
        node4.mValue = 9;

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        Solution5 solution5 = new Solution5();

        solution5.printListReversingly(node);

    }
}
