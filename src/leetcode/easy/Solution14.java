package leetcode.easy;

/**
 * Longest Common Prefix
 */

public class Solution14 {

    private String longestOfTwo(String a, String b) {
        int j;
        int alen = a.length();
        int blen = b.length();
        int len = alen < blen ? alen : blen;
        for(j=0;j<len;j++){
            if(a.charAt(j)!=b.charAt(j)){
                break;
            }
        }
        return a.substring(0,j);
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder pre = new StringBuilder(longestOfTwo(strs[0],strs[1]));
        if(pre.length()==0)
            return "";
        for(int i=2;i<strs.length;i++){
            pre = new StringBuilder(longestOfTwo(pre.toString(),strs[i]));
            if(pre.length()==0){
                break;
            }
        }
        return pre.toString();
    }
}
