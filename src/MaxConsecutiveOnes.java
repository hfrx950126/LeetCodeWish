public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                max[1]++;
                if (max[0] < max[1]) {
                    max[0] = max[1];
                }
            } else {
                max[1] = 0;
            }
        }
        return max[0];
    }

    public static void main(String args[]) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}) + "");
    }
}
