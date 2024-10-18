package com.question;

public class question3 {
    public static void main(String[] args) {

    }

}
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