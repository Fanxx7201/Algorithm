package sorting.leetcode;

import java.util.HashSet;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 *给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @Author: fanxx
 * @CreateDate: 2019/10/18 10:56
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class LongestStr {


    private static int lengthOfLongestSubstring(String s){
        if(s == null || "".equals(s)){
            return 0;
        }
        int start = 0;
        int end = 0;
        int res = 0;
        //去重的集合. 用来放置指针指向的字母
        HashSet lookup = new HashSet();

        while(start < s.length() && end < s.length()){
            if( ! lookup.contains(s.charAt(end))){
                //end指针遇到的字符, 在之前遍历的字符中没有遇到过, 就放到hashset当中.
                lookup.add(s.charAt(end));
                //更新res结果的长度
                res = res > (end - start + 1) ? res : (end - start + 1);
                end++;
            }else{
                //end指针遇到的字符在之前遍历的字符串中遇到过, 从Hashset中移除.
                lookup.remove(s.charAt(start));
                start++;
            }
        }
        return res;
    }


















}
