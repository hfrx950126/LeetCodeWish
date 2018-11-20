class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int cur = 0;
        for (int val : nums) {
            cur +=val;
            if (max < cur){
                max = cur;
            }
            if (cur<0){
                cur = 0;
            }

        }
        return max;
    }
    public static void main(String args[]){
        String a = "asd asd as";
        System.out.println(a.length());

    }


}