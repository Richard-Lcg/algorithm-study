package com.example.algorithmstudy.binarytree.iteration;

import com.example.algorithmstudy.entity.TreeNode;
import java.util.Stack;

/**
 * @author licangui
 * @date 2026/5/27 13:00
 * @Description 中序遍历-迭代
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
        dd(node1);
    }

    private static void dd(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root != null){
           if(root != null){
               stack.push(root);
               root = root.left;
           }else{
               root = stack.pop();
               System.out.println(root.val);
               root = root.right;
           }
        }
    }
}
