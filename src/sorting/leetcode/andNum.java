package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储一位数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @Author: fanxx
 * @CreateDate: 2019/10/17 13:47
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class andNum {

    private static ListNode2 addNuM(ListNode2 l1, ListNode2 l2){
        ListNode2 l3 = null;
        if(l1 == null && l2 == null) {
            return null;
        }else{
            if(l1.value + l2.value < 10){
                l3 = new ListNode2(l1.value + l2.value);
                l3.next = addNuM(l1.next, l2.next);
            }else{
                //需要进位
                l3 = new ListNode2(l1.value + l2.value - 10);
                l3.next = addNuM(l1.next, addNuM(l2.next, new ListNode2(1)));
            }
        }



        return l3;

    }
}
