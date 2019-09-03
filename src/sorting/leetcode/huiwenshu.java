package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 *
 *
 * @Author: fanxx
 * @CreateDate: 2019/9/3 14:06
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class huiwenshu {

    public static boolean isPalindrome(int x) {
        String str = x + "";
        StringBuffer re = new StringBuffer(str);
        re.reverse();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == re.charAt(i)){
                count++;
            }
        }
        if(count == str.length()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1212121));

    }
}
