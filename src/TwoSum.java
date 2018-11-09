import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 1 Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int result[]  = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);

        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;

                result[1] = map.get(target-nums[i]);
                if(result[0]==result[1])
                    continue;
                return result;
            }
        }
      return result;
    }

    public static void main(String args[]){
        TwoSum solution = new TwoSum();
        int sum[] = {3,2,4};

        int result[] = solution.twoSum(sum,6);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

}