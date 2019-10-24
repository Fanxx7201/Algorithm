package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/21 14:45
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        int length = s.length();
        String res = "";
        //dp[i][j] 表示i到j是否是回文串
        boolean[][] dp = new boolean[length][length];
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                //dp[i][j] 判断是否是回文串. j - i + 1 > res.length()判断是否是最长回文串
                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
