package swordmeansoffer;

/**
 * 打印从1 到最大的N位
 */
public class Solution16 {
    /**
     * 解法一
     *
     * @param n
     */
    public void printToMaxOfDigits(int n) {
        if (n <= 0) {
            System.out.println("输入的n没有意义");
            return;
        }
        //声明字符数组,用来存放一个大数
        char number[] = new char[n];
        for (int i = 0; i < number.length; ++i) { //放字符0进行初始化
            number[i] = '0';
        }
        while (!incrementNumber(number)) { //如果大数自加，直到自溢退出
            printNumber(number); //打印大数
        }
    }

    //自加
    private boolean incrementNumber(char[] number) {
        boolean isOverflow = false; //判断是否溢出
        int nTakeOver = 0; //判断是否进位
        int nLength = number.length;
        for (int i = nLength - 1; i >= 0; --i) {
            int nSum = number[i] - '0' + nTakeOver; //取到第i位的字符转换为数字 +进位符
            if (i == nLength - 1) { //末尾自加1
                ++nSum;
            }
            if (nSum >= 10) {
                if (i == 0) {
                    isOverflow = true;
                } else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char) ('0' + nSum);
                }
            } else {
                number[i] = (char) (nSum + '0');
                break;
            }
        }
        return isOverflow;
    }

    //打印数字
    private void printNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;
        for (int i = 0; i < nLength; ++i) {
            if (isBeginning0 && number[i] != '0') {
                isBeginning0 = false;
            }
            if (!isBeginning0) {
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    /**
     * 解法二
     *
     * @param
     */
//打印1到最大的n位数的主方法
    public void printToMaxOfDigits2(int n) {
        if (n <= 0) {
            System.out.println("输入的n没有意义");
            return;
        }
        char number[] = new char[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = '0';
        }
        for (int i = 0; i < 10; ++i) {
            number[0] = (char) (i + '0');
            printToMaxOfNDigitsRecursively2(number, n, 0);
        }
    }

    //利用递归实现1到最大的n位数的全排列
    public void printToMaxOfNDigitsRecursively2(char[] number, int n, int index) {
        if (index == n - 1) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; ++i) {
            number[index + 1] = (char) (i + '0');
            printToMaxOfNDigitsRecursively2(number, n, index + 1);
        }
    }


    public static void main(String args[]) {
        Solution16 solution16 = new Solution16();
        solution16.printToMaxOfDigits(20);
    }


}
