package com.question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class question2 {
    public static void main(String[] args) {
        //leetcode 637
    }

//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double>  result = new ArrayList<>();
//        if(root == null){
//            return result;
//        }
//        Queue<TreeNode> queue  = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            double averageLevel = 0;
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//                averageLevel += currentNode.val;
//                if(currentNode.left != null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.offer(currentNode.right);
//                }
//            }
//            averageLevel = averageLevel/levelSize;
//            result.add(averageLevel);
//        }
//        return result;
//    }
//question3
//    public TreeNode findSuceesor(TreeNode root, int key){
//        if(root == null){
//            return null;
//        }
//        List<Double>  result = new ArrayList<>();
//        Queue<TreeNode> queue  = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//                TreeNode currentNode = queue.poll();
//                if(currentNode.left != null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.offer(currentNode.right);
//                }
//                if(currentNode.val == key){
//                    break;
//                }
//        }
//        return queue.peek();
//    }

    //don't focus on this
    public class TreeNode {
        int val;
        Question1.TreeNode left;
        Question1.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Question1.TreeNode left, Question1.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
