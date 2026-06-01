package com.example.algorithmstudy.binarytree.recusion;

import com.example.algorithmstudy.entity.TreeNode;

/**
 * @author licangui
 * @date 2026/5/27 13:00
 * @Description 中序遍历-递归
 */
public class InOrder {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7,null,null);
        TreeNode node6 = new TreeNode(6,null,null);
        TreeNode node5 = new TreeNode(5,node6,node7);
        TreeNode node4 = new TreeNode(4,null,null);
        TreeNode node3 = new TreeNode(3,null,null);
        TreeNode node2 = new TreeNode(2,node4,node5);
        TreeNode node1 = new TreeNode(1,node2,node3);
        dg(node1);
    }

    private static void dg(TreeNode root) {
        if(root != null){
            dg(root.left);
            System.out.println(root.val);
            dg(root.right);
        }
    }
}
