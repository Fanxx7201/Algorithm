package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/9/26 10:59
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class huiwenshu2 {

    public static boolean isPalindrome(int x) {
        //负数不是回文数
        if(x < 0){
            return false;
        }
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != chars[str.length() - 1 - i]){
                return false;
            }
        }
        return true;
    }

    /*
                 class Solution {
                public boolean isPalindrome(int x) {
                    if (x < 0) { // 负数肯定不是palindrome
                        return false;
                    }
                    int temp = x;
                    // 翻转之后的数字可能超过整型的范围
                    long y = 0;
                    while ( x != 0) {
                        y = y * 10 + x % 10;
                        x /= 10;
                    }
                    return  temp == y;
                }
            }
     **/

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(233));
        System.out.println(isPalindrome(323));
    }


}
