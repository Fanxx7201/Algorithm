package sorting.leetcode;

import java.util.Stack;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: fanxx
 * @CreateDate: 2019/9/6 9:29
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class isValid {

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case'(':
                    stack.push("(");
                    break;
                case')':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(!stack.pop().equals("(")){ // 有一对的括号就消除了.
                        return false;
                    }
                    break;
                case'[':
                    stack.push("[");
                    break;
                case']':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(!stack.pop().equals("[")){
                        return false;
                    }
                    break;
                case'{':
                    stack.push("{");
                    break;
                case'}':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(!stack.pop().equals("{")){
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()((()))"));
    }


















}
