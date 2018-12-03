package leetcode.easy;

public class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            //取余
            sb.append(sum % 2);
            carry = sum / 2;
        }
        //进位
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String args[]){
        Solution67 solution67 = new Solution67();
        System.out.println(solution67.addBinary("11","1"));
        System.out.println("11".charAt(0)-'0');
    }


}
