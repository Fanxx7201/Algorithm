package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @Author: fanxx
 * @CreateDate: 2019/9/25 9:07
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class reverseInteger {

    private static int reverseInt(int num){
        if(num == -2147483648){ //不做这个判断, x = -x时将报错
            return 0;
        }
        if(num < 0){
            return - reverseInt(-num);
        }
        int res = 0;
        while(num != 0){
            //处理溢出
            if(res > 214748364){
                return 0;
            }
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res <= 0x7fffffff ? res: 0;
    }


    public static void main(String[] args) {
        System.out.println(reverseInt(3456));
        System.out.println(reverseInt(-3456));
        System.out.println(reverseInt(34345245));
        System.out.println(reverseInt(444445345));
        System.out.println(reverseInt(-013));
        System.out.println(reverseInt(0555554));
        System.out.println(reverseInt(-2));


    }
}
