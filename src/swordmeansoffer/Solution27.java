package swordmeansoffer;

/**
 * 二叉树的镜像
 */
public class Solution27 {
    class BinaryTreeNode {
        int mValue;
        BinaryTreeNode mLeft;
        BinaryTreeNode mRight;
    }

    void MirrorRecursively(BinaryTreeNode pNode) {
        if (pNode == null) {
            return;
        }
        if (pNode.mLeft == null && pNode.mRight == null) {
            return;
        }
        BinaryTreeNode pTemp = pNode.mLeft;
        pNode.mLeft = pNode.mRight;
        pNode.mRight = pTemp;
        if(pNode.mLeft!=null){
            MirrorRecursively(pNode.mLeft);
        }
        if(pNode.mRight!=null){
            MirrorRecursively(pNode.mRight);
        }
    }
}
