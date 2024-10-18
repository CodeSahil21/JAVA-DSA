public class Main {
    /*
    binary search
    arr = {12 34 45 67 87  30 91 98} sorted array in ascending order
     1) find the middle element
     2) check target element> middle element search in right start = mid +1 o
      2.2)search in left is target < middle element  *) end = mid -1
     3) if middle element == target element //ans
     4) if start is greater then end hence element not found
      arr = {12 34 45 67 87 91 98} target element = 91
     1) middle element = S + E/2 ie middle element = 45
     2) target element = 91   is greater then middle element  therefore  start will be 67 and end will be 98
     3) now new middle element will  S + E/2  = 4 + 7 /2 = 5(87)(approx value)// here number based on index
     4) now start will be 91 and end will be 98
     5) middle element will be  [S + E]/2 = [6 + 7]/2 = 6(91) hence ans = index 6
     */
    // why binary search
    /*
    Q: find max comparision the worst case
    ans: total comparison made in worst case is logN (where N is size of array)
    why is it good because
    ex we sorted array of 1 milion
    in linear search it will make 1 milion comparison in worst case
    while binary search would make log2(1million) = 20 comparsion

     */

    /*
    for sorted array in descending order
    arr = {530 330 90 80 70 60 50 40 30 20 10}
    middle element = (S + E) / 2 = 60
        target > middle element it will lie in left side *) end = mid -1
      if target < middle element it will lile in right side *) start = mid +1


     */
}
