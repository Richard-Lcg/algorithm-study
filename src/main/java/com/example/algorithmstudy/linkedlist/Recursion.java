package com.example.algorithmstudy.linkedlist;

import com.example.algorithmstudy.entity.LcgNode;

/**
 * @author licangui
 * @date 2026/5/22 17:24
 * @Description 链表反转-递归
 */
public class Recursion {
    public static LcgNode rs(LcgNode head){
//        结束条件
        if(head == null || head.next == null){
            return head;
        }
        LcgNode n = rs(head.next);
        head.next.next = head;
        head.next = null;
        return n;
    }
    public static void main(String[] args) {
        LcgNode node5 = new LcgNode(5, null);
        LcgNode node4 = new LcgNode(4, node5);
        LcgNode node3 = new LcgNode(3, node4);
        LcgNode node2 = new LcgNode(2, node3);
        LcgNode node1 = new LcgNode(1, node2);
        LcgNode pre = rs(node1);
        System.out.println(pre);
    }
}
