package com.example.algorithmstudy.binarytree.mininumdepth;

import com.example.algorithmstudy.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author licangui
 * @date 2026/6/10 13:00
 * @Description 二叉树最小深度-广度优先
 */
public class WidthFirst {
    
    public static void main(String[] args) {
        TreeNode node9 = new TreeNode(9,null,null);
        TreeNode node8 = new TreeNode(8,null,null);
        TreeNode node7 = new TreeNode(7,node8,null);
        TreeNode node6 = new TreeNode(6,node7,null);
//        TreeNode node5 = new TreeNode(5,null,null);
        TreeNode node4 = new TreeNode(4,null,null);
        TreeNode node3 = new TreeNode(3,node6,null);
        TreeNode node2 = new TreeNode(2,null,node4);
        TreeNode node1 = new TreeNode(1,node2,node3);
        System.out.println(md(node1));
    }

    private static int md(TreeNode root) {
        if(root == null){
            return 0;
        }
//        创建队列，存储节点
        Queue<TreeNode> queue = new ArrayDeque<>();
        root.deep = 1;
        queue.offer(root);
        while(queue != null){
            TreeNode tn = queue.poll();
            if(tn.left == null && tn.right == null){
                return tn.deep;
            }
            if(tn.left != null){
                tn.left.deep = tn.deep + 1;
                queue.offer(tn.left);
            }
            if(tn.right != null){
                tn.right.deep = tn.deep + 1;
                queue.offer(tn.right);
            }
        }
        return 0;
    }

}

