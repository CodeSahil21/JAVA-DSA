package com.SegmentTrees;

public class SegmentTree {
    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public SegmentTree(int[] arr) {
        // Create a tree using this array
        this.root = constructTree(arr, 0, arr.length - 1); // Time complexity to create the tree is O(N)
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            // Means we are at a leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        // Create new node with the index you are at
        Node node = new Node(start, end);
        int mid = (start + end) / 2;
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str += "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data " + node.left.data + " => ";
        } else {
            str += "No left child ";
        }
        // For current node
        str += "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data " + node.data + " => ";
        if (node.right != null) {
            str += "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data " + node.right.data + " => ";
        } else {
            str += "No right child ";
        }
        System.out.println(str);
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    // Query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            // Node is completely lying inside the query
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            // Completely outside
            return 0;
        } else {
            // Partially inside
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    // Update
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftans = update(node.left, index, value);
                int rightans = update(node.right, index, value);
                node.data = leftans + rightans;
                return node.data;
            }
        }
        return node.data;
    }
}