package leetcode.easy;

public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(4);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode6;
        treeNode2.right = treeNode5;
        treeNode3.left = new TreeNode(3);
        treeNode3.right = new TreeNode(5);
        treeNode4.left = new TreeNode(6);
        treeNode4.right = new TreeNode(7);
        treeNode6.left = new TreeNode(7);
        treeNode6.right = new TreeNode(6);
        treeNode5.left = new TreeNode(5);
        treeNode5.right = new TreeNode(3);
        Solution101 solution101 = new Solution101();
        solution101.isSymmetric(treeNode);


        System.out.println(solution101.isSymmetric(treeNode) + "------");

    }
}
