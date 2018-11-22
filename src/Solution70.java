public class Solution70 {
    public int climbStairs(int n) {
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        int count = 0;
        for(int i=2;i<=n;i++){
            count+=array[i-1];
            count+=array[i-2];
            array[i] = count;
            count = 0;
        }
        return array[n];
    }
}
