package com.example.algorithmstudy.linkedlist;

import com.example.algorithmstudy.entity.LcgNode;

/**
 * @author licangui
 * @date 2026/5/22 13:08
 * @Description 链表反转-迭代
 */
public class Reverse {
    public static LcgNode rs(LcgNode head){
        LcgNode pre = null,next;
        LcgNode cur = head;
        while(cur != null){
            //存储当前节点
            next = cur.next;
//            改变链条方向
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
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
