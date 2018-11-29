public class Solution110 {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }

    public int maxLeftDepth(TreeNode root){
        if (root == null)
            return 0;
        int l = maxLeftDepth(root.left);
        int r = maxLeftDepth(root.right);
        System.out.println("l="+l);
        System.out.println("r="+r);
        return 1 + Math.max(l, r);
    }


    public static void main(String args[]){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode5.right = new TreeNode(6);
        Solution110 solution110 = new Solution110();
        System.out.println(solution110.maxLeftDepth(treeNode1));

    }
}

