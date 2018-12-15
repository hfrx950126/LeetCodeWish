package swordmeansoffer;

/**
 * 二进制中1 的个数
 */
public class Solution14 {
    /**
     * 解法一
     *
     * @param n
     * @return
     */
    private int numberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) == 0) {
                count++;
            }

            flag = flag << 1;
        }
        return count;
    }

    /**
     * 解法二
     *
     * @param n
     * @return
     */
    private int numberOf1_2(int n) {
        int count = 0;
        while (n !=0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
