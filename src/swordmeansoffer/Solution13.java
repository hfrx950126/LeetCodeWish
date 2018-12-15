package swordmeansoffer;

/**
 * 剪绳子
 */
public class Solution13 {
    /**
     * 解法一 动态规划
     *
     * @param length
     * @return
     */
    private int maxProductAfterCutting_solution(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int products[] = new int[length + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        int max = 0;
        for (int i = 4; i <= length; ++i) {
            max = 0;
            for (int j = 1; j <= i / 2; ++j) {
                int product = products[j] * products[i - j];
                if (max < product) {
                    max = product;
                }
                products[i] = max;
            }
        }
        max = products[length];
        return max;
    }

    /**
     * 贪婪算法
     *
     * @param length
     * @return
     */
    int maxProductAfterCutting_solution2(int length) {
        if (length < 2)
            return 0;
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int timeOf3 = length / 3;
        if (length - timeOf3 * 3 == 1) {
            timeOf3 -= 1;
        }
        int timesOf2 = (length - timeOf3 * 3) / 2;
        return (int) (Math.pow(3, timeOf3) * Math.pow(2, timesOf2));
    }
}
