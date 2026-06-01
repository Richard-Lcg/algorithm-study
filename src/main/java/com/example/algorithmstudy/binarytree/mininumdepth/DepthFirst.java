package com.example.algorithmstudy.binarytree.mininumdepth;

import com.example.algorithmstudy.entity.TreeNode;

/**
 * @author licangui
 * @date 2026/5/28 13:42
 * @Description 二叉树最小深度-深度优先
 */
public class DepthFirst {
    
    public static void main(String[] args) {
        TreeNode node9 = new TreeNode(9,null,null);
        TreeNode node8 = new TreeNode(8,null,null);
        TreeNode node7 = new TreeNode(7,node8,null);
        TreeNode node6 = new TreeNode(6,node7,null);
//        TreeNode node5 = new TreeNode(5,null,null);
        TreeNode node4 = new TreeNode(4,node9,null);
        TreeNode node3 = new TreeNode(3,node6,null);
        TreeNode node2 = new TreeNode(2,node4,null);
        TreeNode node1 = new TreeNode(1,node2,node3);
        System.out.println(md(node1));
    }

    private static int md(TreeNode root) {
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if(root.left != null){
            min = Math.min(md(root.left),min);
        }
        if(root.right != null){
            min = Math.min(md(root.right),min);
        }
        return min + 1;
    }

}

