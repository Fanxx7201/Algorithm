package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/2/18 14:11
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class containsDuplicate {


    public static  boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 6 ,2};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }
}
