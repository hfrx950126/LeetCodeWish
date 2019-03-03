package swordmeansoffer;

/**
 * 剑指Offer 面试题25:树的子结构
 */
public class Solution26 {
    class BinaryTreeNode {
        double mDbValue;
        BinaryTreeNode mLeft;
        BinaryTreeNode mRight;
    }

    boolean HasSubtree(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
        boolean result = false;

        if (pRoot1 != null && pRoot2 != null) {
            if (equal(pRoot1.mDbValue, pRoot2.mDbValue)) {
                result = DoesTree1HaveTree2(pRoot1, pRoot2);
            }
            if (!result) {
                result = HasSubtree(pRoot1.mLeft, pRoot2);
            }
            if (!result) {
                result = HasSubtree(pRoot1.mRight, pRoot2);
            }
        }
        return result;
    }

    private boolean DoesTree1HaveTree2(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
        if (pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null) {
            return false;
        }
        if (!equal(pRoot1.mDbValue, pRoot2.mDbValue)) {
            return false;
        }
        return DoesTree1HaveTree2(pRoot1.mLeft, pRoot2.mLeft) &&
                DoesTree1HaveTree2(pRoot1.mRight, pRoot2.mRight);

    }

    boolean equal(double num1, double num2) {
        if ((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)) {
            return true;
        } else {
            return false;
        }
    }
}
