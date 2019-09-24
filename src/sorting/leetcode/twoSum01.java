package sorting.leetcode;

import java.util.HashMap;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @Author: fanxx
 * @CreateDate: 2019/9/23 10:56
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class twoSum01 {


    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num2 = target - nums[i];
            if(map.containsKey(num2)){
                return new int[]{map.get(num2), i};
            }
            map.put(nums[i], i); // 把数字和他对应的索引放在map集合中.
        }
        return null;
    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ints = twoSum(nums, 3);
        for(int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }

    }
}
