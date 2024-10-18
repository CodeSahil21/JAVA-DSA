package com.AVLTrees;

public class info {
    /*
    Self-balancing binary search trees (BSTs) are a type of binary search tree that automatically maintains balance
    to ensure efficient operations like searching,
    insertion, and deletion. Here are some common self-balancing BSTs in Java


    Definition:
An AVL tree (named after its inventors, Georgy Adelson-Velsky and Evgenii Landis) is a self-balancing binary search tree (BST).
The key property of an AVL tree is that the heights of the two child subtrees of any node differ by at most one.
If, at any time, the height difference exceeds one, the tree undergoes rebalancing to restore this property1.
Balance Factor:
The balance factor of a node is the difference between the heights of its left and right subtrees.
For any node, the balance factor must be in the range [-1, 0, 1].
An AVL tree ensures that the balance factor remains within this range for all nodes.
Operations:
Insertion: Similar to performing a search in a BST, we insert a new node into the AVL tree.
Deletion: Also similar to BST deletion, but with additional rebalancing steps.
Searching: Standard search operations apply.
Rotations:
AVL trees rotate in specific ways to maintain balance:
Left Rotation: When a node is added to the right subtree of the right subtree, perform a single left rotation.
Right Rotation: If a node is added to the left subtree of the left subtree, do a single right rotation.
Left-Right Rotation: First perform a left rotation, then a right rotation.
Right-Left Rotation: First perform a right rotation, then a left rotation.
Applications:
Indexing large records in databases efficiently.
In-memory collections (sets, dictionaries) benefit from AVL trees.
Software requiring optimized search.
Corporate applications and storyline games.
Advantages:
Self-balancing property.
Not skewed.
Faster lookups than Red-Black trees.
Height limited to log(N), where N is the total number of nodes.
Disadvantages:
Complex implementation.
More rotations during insertion and removal.
Less commonly used compared to Red-Black trees.

for evry node h(l) - h(r) = -1,+1 or 0

for every node in the tree the diff in height of left and right subtree
of that node

algo for AVL trees
1)insert normally node n
2)start from node n and find the node that makes tree unbalanced
3)using one of the four rules rotate
|)Left Rotation (LL Rotation):
When the right subtree of a node is heavier (i.e., deeper) than the left subtree, perform a left rotation.
This means that the left child of the current node becomes the new root, and the original root becomes the right child of the new root.
The balance factor is adjusted accordingly.
||)Right Rotation (RR Rotation):
If the left subtree of a node is heavier than the right subtree, apply a right rotation.
In this case, the right child of the current node becomes the new root, and the original root becomes the left child of the new root.
Again, the balance factor is updated.
|||)Left-Right Rotation (LR Rotation):
A combination of a single left rotation followed by a single right rotation.
First, perform a left rotation on the left child of the current node.
Then, perform a right rotation on the current node itself.
This rebalances the tree while maintaining the AVL properties.
|V)Right-Left Rotation (RL Rotation):
Similar to LR rotation, but in the opposite order.
First, perform a right rotation on the right child of the current node.
Then, perform a left rotation on the current node.
Again, this ensures balance.

cocept of grandchild
AVL Tree Overview:
An AVL tree is a self-balancing binary search tree.
Each node has at most two children: a left child (smaller) and a right child (greater).
The tree maintains a balance factor, ensuring that the height difference between the left and right subtrees of any node is at most 1.
Grandchild:
Consider a node in the AVL tree.
Its grandchildren are the nodes that are two levels below it (i.e., the children of its children).
These grandchildren can be either left or right children of their respective parents.
Example:
Suppose we have an AVL tree with the following structure:
    5
   / \
  3   8
 / \
1   4

Here:
Node 5 has two children: 3 (left child) and 8 (right child).
Node 3 has two grandchildren: 1 (left grandchild) and 4 (right grandchild).
     */

}
