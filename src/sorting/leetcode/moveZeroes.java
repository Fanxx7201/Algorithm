package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @Author: fanxx
 * @CreateDate: 2019/2/19 11:11
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class moveZeroes {
    public static  void moveZeroes(int[] nums) {
        int zeroNum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroNum++;
            }else if(zeroNum != 0){
                nums[i - zeroNum] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

    }
}
