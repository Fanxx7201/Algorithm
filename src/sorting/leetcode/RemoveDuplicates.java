package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/8 9:53
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class RemoveDuplicates {

    public static int removeEuplicates(int[] nums){
        int len = nums.length;
        int i = 0;
        while(i < len - 1){
            if(nums[i] == nums[i + 1]){
                for(int j = i; j < len -1; j++){
                    nums[j] = nums[j + i];
                }
                len --;
            }else{
                i++;
            }
        }
        return len;
    }
}
