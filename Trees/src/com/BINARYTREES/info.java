package com.BINARYTREES;

public class info {
    public static void main(String[] args) {
        /*
        pre-requisites : recursion,oops

         */
        //why we use trees
        /*
       1) Add remove find in logn time ie efficiently which isn't avialable with linkedlist
       2) in binary search tress all the nodes on left side are smaller than common number value and
       2)right side is greater than that common  number
       3)cost efficient

         */
          //for unbalanced tree complxity is o(N) we lookhow make it balanced in self balancing tree
        /*TERMINOLOGYS
       1)Size: The size of a binary tree refers to the total number of nodes in the tree. To calculate the size,
       you can traverse the entire tree and count each node.
       2)Child and Parent: In a binary tree, each node can have at most two children: a left child and a right child.
       The node from which another node originates is called the parent.
       Conversely, the nodes that originate from a particular node are its children.
       3)Siblings: Siblings are nodes that share the same parent.
       For example, if two nodes have the same parent, they are considered siblings.
       4)Edge: An edge represents the connection between two nodes in a binary tree.
        It’s the link that allows traversal from one node to another.
       5)Height: The height of a binary tree is the length of the longest path from the root to any leaf node.
        It represents the depth of the tree.
       6)Leaf Nodes: Leaf nodes (also known as terminal nodes) are nodes that have no children.
        They are the endpoints of the tree.
       7)Level: The level of a node indicates its distance from the root. The root node is at level 0, its children are at level 1, and so on.
       8)Degree: The degree of a node refers to the number of children it has.
        In a binary tree, the maximum degree is 2 (since each node can have at most two children)
         */

        /*Types of binary trees
        1)Complete Binary Tree:
A complete binary tree is one where all levels are completely filled except possibly the last level.
In the last level, all keys (elements) are as left as possible.
last level is filled from left to right
Unlike a full binary tree, a complete binary tree doesn’t have to be balanced.
Example:
    1
   / \
  2   3
 / \ /
4  5 6


2)Full Binary Tree (Strict Binary Tree):
In a full binary tree, every node has either 0 or 2 children.
All nodes except leaf nodes have two children.
Example:
    1
   / \
  2   3
 / \
4   5


3)Perfect Binary Tree:
A perfect binary tree has all internal nodes with exactly two children.
All leaf nodes are at the same level.
The number of leaf nodes (L) equals the number of internal nodes (I) plus 1 (L = I + 1).
Example:
    1
   / \
  2   3
 / \ / \
4  5 6  7


4)Height-Balanced Binary Tree:
A height-balanced binary tree is one where the difference in height between the left and right subtrees of any node is at most 1.
Ensures efficient search and insertion operations.
Example:
    1
   / \
  2   3
 / \   \
4   5   6


5)Skewed Binary Tree:
A skewed binary tree is a pathological tree dominated by either left nodes or right nodes.
Two types: left-skewed and right-skewed.
Example (left-skewed):
    1
     \
      2
       \
        3


6)Ordered Binary Tree (Binary Search Tree):
An ordered binary tree (BST) maintains the property that for every node:
All nodes in its left subtree have keys less than the node’s key.
All nodes in its right subtree have keys greater than the node’s key.
Used for efficient searching, insertion, and deletion.
Example:
    4
   / \
  2   6
 / \ / \
1  3 5  7

         */
        /*
        1)in perfect binary trees,height =h
        total nodes = (2^(h+1))-1
        2)total no of leaf nodes in perfect binary trees = (2^h)
        3)if you have n = nof leaves
          minimum level= logN+1 levels atleast
        4) strict BT,N->leaf nodes
        N-1 = internal nodes
         no of leaf nodes(N) = no of internal nodes  +1
         5)no of leaf nodes = 1 + no of internal nodes with 2 children
                 */
// implemantation
       // 1)linked representation
        //sequntial => using array



        /*
        TRAVERSALS:
        1)Pre-order Traversal (Root, Left, Right)
Consider the following binary tree:

       1
      / \
     2   3
    / \   \
   4   5   6

In pre-order traversal, we visit nodes in the order: Root, Left, Right.

Start at the root node (1).
Visit the left subtree:
Visit node (2).
Visit the left subtree of node (2):
Visit node (4).
Visit the right subtree of node (2):
Visit node (5).
Visit the right subtree:
Visit node (3).
Visit the right subtree of node (3):
Visit node (6).
So, the pre-order traversal of this tree is: 1, 2, 4, 5, 3, 6.
*use evaluating maths expression and making copy of binary tree

2)In-order Traversal (Left, Root, Right)
Consider the following binary tree:

       1
      / \
     2   3
    / \   \
   4   5   6

In in-order traversal, we visit nodes in the order: Left, Root, Right.

Start at the root node (1).
Visit the left subtree:
Visit node (2).
Visit the left subtree of node (2):
Visit node (4).
Visit node (2).
Visit the right subtree of node (2):
Visit node (5).
Visit the root node (1).
Visit the right subtree:
Visit node (3).
Visit the right subtree of node (3):
Visit node (6).
So, the in-order traversal of this tree is: 4, 2, 5, 1, 3, 6

3)Post-order Traversal (Left, Right, Root)
Consider the following binary tree:

       1
      / \
     2   3
    / \   \
   4   5   6

In post-order traversal, we visit nodes in the order: Left, Right, Root.

Start at the root node (1).
Visit the left subtree:
Visit node (2).
Visit the left subtree of node (2):
Visit node (4).
Visit the right subtree of node (2):
Visit node (5).
Visit node (2).
Visit the right subtree:
Visit node (3).
Visit the right subtree of node (3):
Visit node (6).
Visit node (3).
Visit the root node (1).
So, the post-order traversal of this tree is: 4, 5, 2, 6, 3, 1.
to delte a binary we use postorder
bottom -y calculation
         */
    }
}
