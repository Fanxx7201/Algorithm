package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/9/9 9:16
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class reverseList {

    public static ListNode reverseList(ListNode head) {

        if(head.next == null || head.next == null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {


    }
}
