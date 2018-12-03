package leetcode.easy;

class Solution58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int e = s.length() - 1;
        while (e >= 0 && s.charAt(e) != ' ') {
            e--;
        }
        return s.length() - 1 - e;
    }

    public static void main(String args[]) {
        String a = "I LOVE ANDROID";
        Solution58 solution58 = new Solution58();
        solution58.lengthOfLastWord(a);
    }
}