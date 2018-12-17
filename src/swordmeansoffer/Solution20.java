package swordmeansoffer;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class Solution20 {
    private static void ReorderArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && (arr[left] & 1) == 1)//使用位运算判断奇偶
                left++;//arr[left]为奇数，自增直至为偶数为止
            while (left < right && (arr[right] & 1) != 1)
                right--;//arr[right]为偶数，自减直至为奇数为止
            //arr[left]为偶数，arr[right]为奇数，交换
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    private static void ReorderArray2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && isEven(arr[left]))
                left++;
            while (left < right && !isEven(arr[right]))
                right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    private static boolean isEven(int n) {
        return (n & 1) == 1;
    }


}
