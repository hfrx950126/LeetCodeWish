/**
 * 判断一个整数是否是回文数。不能使用辅助空间。
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int res = 0;
        while(y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }

    public static void main(String args[]){
        int a = 1234321;
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(a)+"");
    }
}
