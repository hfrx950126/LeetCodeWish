package leetcode.easy;

public class Solution108 {
    /**
     * 这道题是要将有序数组转为二叉搜索树，所谓二叉搜索树，是一种始终满足左<根<右的特性，
     * 如果将二叉搜索树按中序遍历的话，得到的就是一个有序数组了。那么反过来，我们可以得知，
     * 根节点应该是有序数组的中间点，从中间点分开为左右两个有序数组，
     * 在分别找出其中间点作为原中间点的左右两个子节点，这不就是是二分查找法的核心思想么
     * 。所以这道题考的就是二分查找法，代码如下：
     * @param num
     * @return
     */
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
}
