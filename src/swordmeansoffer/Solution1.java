package swordmeansoffer;

/**
 * 找出数组中重复的数字
 * 在一个长度为n的数组里的所有数字都在0~n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字
 */
public class Solution1 {

    private int duplicate(int numbers[], int length) {
        if (numbers == null || length <= 0) {
            return -1;
        }
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    return numbers[i];
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        Solution1 solution1 = new Solution1();
        int a[] = new int[]{2,3,1,0,2,5,3};
        System.out.println(solution1.duplicate(a,7));
    }

}
