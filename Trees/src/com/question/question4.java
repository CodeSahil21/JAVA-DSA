//package com.question;
//
//import java.util.*;
//
//public class question4 {
//    //103
//
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>>  result = new ArrayList<>();
//        if(root == null){
//            return result;
//        }
//        Deque<Question1.TreeNode> queue  = new LinkedList<>();
//        queue.offer(root);
//
//        boolean reverse =  false;
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer>  currentLevel = new ArrayList<>(levelSize);
//            for (int i = 0; i < levelSize; i++) {
//                Question1.TreeNode currentNode = queue.poll();
//                currentLevel.add(currentNode.val);
//                if(currentNode.left != null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.offer(currentNode.right);
//                }
//            }
//            result.add(currentLevel);
//        }
//        return result;
//    }
//
//
//    public class TreeNode {///////
//        int val;
//        Question1.TreeNode left;
//        Question1.TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, Question1.TreeNode left, Question1.TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//}
