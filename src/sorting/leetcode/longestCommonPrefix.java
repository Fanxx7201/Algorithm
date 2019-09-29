package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明: 所有输入只包含小写字母 a-z 。
 * @Author: fanxx
 * @CreateDate: 2019/9/29 13:26
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }
        //最长字符串的长度, 一定不会超过第0个字符串的长度
        int end = strs[0].length();

        for(int i = 1; i < strs.length; i++){
            int j = 0;
            while(j < end && j < strs[i].length() && strs[0].charAt(j) == strs[i].charAt(j)){
                j++;
            }
            end = j;
        }
        return strs[0].substring(0, end);
    }






}
