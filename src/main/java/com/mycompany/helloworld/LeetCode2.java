package com.mycompany.helloworld;

/**
 * LeetCode!
 * https://leetcode.com/problems/add-two-numbers/#/description
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString(){

        String s = "" + val;
        if(null != next){
            s += "->" + next.toString();
        }

        return s;
    }
}

public class LeetCode2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int val = l1.val + l2.val;
        int add = val / 10;

        ListNode listNode = new ListNode(val % 10);

        if(null != l1.next && null != l2.next){
            l1.next.val += add;
            listNode.next = addTwoNumbers(l1.next, l2.next);
        }else if(null != l1.next){
            l1.next.val += add;
            listNode.next = addTwoNumbers(l1.next, new ListNode(0));
        }else if(null != l2.next){
            l2.next.val += add;
            listNode.next = addTwoNumbers(l2.next, new ListNode(0));
        }else {
            if(add !=0){
                listNode.next = new ListNode(add);
            }
        }

        return listNode;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);

//        l1.next = new ListNode(0);
//
//        l1.next.next = new ListNode(0);
//
//        l1.next.next.next = new ListNode(6);


        ListNode l2 = new ListNode(9);
//
        l2.next = new ListNode(9);
//
//        l2.next.next = new ListNode(3);
//
//        l2.next.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1, l2));

    }

}
