package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/10 9:33
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class removeElement {



    private static int removeElement(int[] nums, int val){
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                //把nums[0...len]当做新数组. 不等于val的往里边插入
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, 3));

    }
}
