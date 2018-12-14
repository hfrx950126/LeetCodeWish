package swordmeansoffer;

/**
 * 斐波那契数列
 */
public class Solution9 {
    /**
     * 解法一
     */
    private int Fibonacci1(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);

    }

    /**
     * 解法二
     */
    private int Fibonacci2(int n) {
       int result[] = new int[]{0,1};
       if(n<2)
           return result[n];
       int fibNMinusOne = 1;
       int fibNMinusTwo = 0;
       int fibN = 0;
       for(int i = 2;i<=n;++i){
           fibN = fibNMinusOne + fibNMinusTwo;
           fibNMinusTwo = fibNMinusOne;
           fibNMinusOne = fibN;
       }
       return fibN;
    }
}
