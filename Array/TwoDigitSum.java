import java.util.Arrays;
import java.util.HashMap;

public class TwoDigitSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result= twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];

            if(hashmap.containsKey(needed)){
                return new int[]{hashmap.get(needed), i};
            }

            hashmap.put(nums[i], i);
        }

        return new int[]{};
        
    }
    
}