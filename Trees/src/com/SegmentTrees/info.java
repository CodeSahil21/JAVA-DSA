package com.SegmentTrees;

public class info {
    public static void main(String[] args) {
        /*
        //Segment trees
        we use segment trees when we have to perform query on the range
        (sum,max,avg,min,prod) in o(logN) and update in o(logN)


       What is a Segment Tree?
A Segment Tree is a data structure that allows you to efficiently perform range queries and updates on an array. It is particularly useful for problems where you need to repeatedly query the sum, minimum, maximum, or other associative operations over a range of elements.

Structure
A Segment Tree is a binary tree where each node represents an interval or segment of the array. The root node represents the entire array, and each leaf node represents a single element of the array. Internal nodes represent the union of their child nodes’ intervals.

Construction
The construction of a Segment Tree involves recursively dividing the array into two halves until each segment contains a single element. The time complexity for building a Segment Tree is (O(n)), where (n) is the number of elements in the array.

Querying
To perform a range query (e.g., sum, minimum, maximum), you traverse the tree from the root to the leaves, combining the results from the relevant segments. The time complexity for querying a Segment Tree is (O(\log n)).

Updating
To update an element in the array, you update the corresponding leaf node and then propagate the changes up the tree to ensure all relevant segments are updated. The time complexity for updating a Segment Tree is (O(\log n)).

Space Complexity
The space complexity of a Segment Tree is (O(n)), as it requires storing the tree nodes, which is proportional to the number of elements in the array.

Example
Consider an array ([1, 3, 5, 7, 9, 11]). The Segment Tree for this array would look something like this:

                [36]
              /      \
          [9]          [27]
         /   \        /    \
      [4]    [5]   [16]   [11]
     /  \    / \   /  \    / \
   [1]  [3] [5] [7] [9] [11]

The root node [36] represents the sum of the entire array.
The left child [9] represents the sum of the first half of the array.
The right child [27] represents the sum of the second half of the array.
Leaf nodes represent individual elements of the array.
Advantages
Efficient Range Queries: Segment Trees allow you to perform range queries in (O(\log n)) time.
Efficient Updates: Updates to individual elements can be propagated in (O(\log n)) time.
Flexibility: Segment Trees can be adapted to support various types of range queries, such as sum, minimum, maximum, and more.
Disadvantages
Complexity: Implementing Segment Trees can be more complex compared to simpler data structures like arrays or binary search trees.
Space Overhead: Segment Trees require additional space to store the tree nodes, which can be significant for large arrays.
         */
    }
}
