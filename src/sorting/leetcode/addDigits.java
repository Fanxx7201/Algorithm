package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 *
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: fanxx
 * @CreateDate: 2019/9/5 9:08
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class addDigits {

    public static int addDigits(int num) {
        while(num > 9){
            int t = num % 10;
            int l = num / 10;
            num = t + l;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(38 % 10);
        System.out.println(38 / 10);
    }
}
