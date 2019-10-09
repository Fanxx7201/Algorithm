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

    public static int removeEuplicates1(int[] nums){
        int len = nums.length;
        int i = 0;
        while(i < len - 1){
            if(nums[i] == nums[i + 1]){
                for(int j = i; j < len - 1; j++){
                    nums[j] = nums[j + 1];
                }
                len --;
            }else{
                i++;
            }
        }
        return len;
    }



    public static int removeEuplicates2(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {
        System.out.println(removeEuplicates1(new int[] {0, 0, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5}));
    }
}
