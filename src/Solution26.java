/**
 * Remove Duplicates from Sorted Array
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[++index] = nums[i + 1];
                count++;
            }
        }
        return count;
    }
}
