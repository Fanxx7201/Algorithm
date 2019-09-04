package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 * 编写一个程序判断给定的数是否为丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 * @Author: fanxx
 * @CreateDate: 2019/9/4 9:36
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class isUgly {



    public static boolean isUgly(int num) {

        if(num <= 0){
            return false;
        }
        while (num % 2 == 0){
            num /= 2;
        }
        while (num % 3 == 0){
            num /= 3;
        }
        while (num % 5 == 0){
            num /= 5;
        }
        if(num == 1){
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        System.out.println(isUgly(8));
    }





}
