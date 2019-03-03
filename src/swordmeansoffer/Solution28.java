package swordmeansoffer;

/**
 * 对称二叉树
 */
public class Solution28 {

    private boolean isSymmetrical(Solution27.BinaryTreeNode pRoot) {
        return isSymmetrical(pRoot, pRoot);
    }

    private boolean isSymmetrical(Solution27.BinaryTreeNode pRoot1,
                                  Solution27.BinaryTreeNode pRoot2) {
        if (pRoot1 == null && pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }
        if (pRoot1.mValue != pRoot2.mValue) {
            return false;
        }
        return isSymmetrical(pRoot1.mLeft, pRoot2.mRight)
                && isSymmetrical(pRoot1.mRight, pRoot2.mLeft);
    }
}
