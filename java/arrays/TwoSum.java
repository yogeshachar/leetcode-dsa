
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
// O(n) complexisty
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{
                    map.get(complement),
                    i
                };
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
// O(n2) complexisty
    public static int[] twoSumArray(int [] nums, int target){
        int a [] = {};
        for(int i=0; i< nums.length; i ++){
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    a = new int[]{i,j};
                }
                
                j++;
            }
            i++;
        }
        return  a;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(
            "[" + result[0] + ", " + result[1] + "]"
        );
         int[] result2 = twoSumArray(nums, target);

        System.out.println(
            "[" + result2[0] + ", " + result2[1] + "]"
        );
    }
}