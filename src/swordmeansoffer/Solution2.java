package swordmeansoffer;

/**
 * 找出数组中重复的数字，不修改数组
 * 在一个长度为n的数组里的所有数字都在0~n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字
 */
public class Solution2 {
    private int getDuplication(int numbers[], int length) {
        if (numbers == null || length <= 0) {
            return -1;
        }
        int start = 1;
        int end = length - 1;
        while (end >= start) {
            int middle = ((end - start) >> 1) + start;
            int count = countRange(numbers, length, start, middle);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;


    }

    int countRange(int numbers[], int length, int start, int end) {
        if (numbers == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                ++count;
            }

        }
        return count;
    }


    public static void main(String args[]){
        Solution2 solution2 = new Solution2();
        int a[] = new int[]{2,3,1,0,2,5,3};
        System.out.println(solution2.getDuplication(a,7));
    }

}
