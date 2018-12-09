package swordmeansoffer;

/**
 * 二叉树的下一个节点
 */
public class Solution7 {
    Solution6.BinaryTreeNode getNext(Solution6.BinaryTreeNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            Solution6.BinaryTreeNode pNext = pNode.right;
            while(pNext.left!=null)
            {
                pNext=pNext.left;
            }
            return pNext;
        }else if(pNode.next!=null)   //有父节点
        {
            Solution6.BinaryTreeNode pCurrent=pNode;
            Solution6.BinaryTreeNode pParent= pNode.next;//next代表节点的父节点
            while(pParent!=null&&pCurrent==pParent.right)
            {
                pCurrent=pParent;
                pParent=pParent.next;
            }
            return pParent;
        }
        else//只有一个节点
            return null;

    }
}
