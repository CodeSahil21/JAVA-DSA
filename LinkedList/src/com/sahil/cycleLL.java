package com.sahil;

public class cycleLL {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    //find length of cycle
    public int lengthofCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;

    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthofCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        //find start node
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
            //keep moving both forward and they will meet at cycle start
            while (f != s) {
                s = s.next;
                f = f.next;

            }
            return s;


    }
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
             s = findsquare(s);
             f = findsquare(findsquare(f));
        }while(f != s);
        if (s == 1){
            return true;
        }
        return false;

    }
    private int findsquare(int number){
        int ans = 0;
        while(number > 0){
          int rem = number % 10;
          ans += rem * rem;
          number /= 10;
        }
        return ans;
    }
    public ListNode middleNode(ListNode head) {
     ListNode s = head;
     ListNode f = head;
     while(f!= null && f.next != null){
         s= s.next;
         f = f.next.next;
     }
     return s;
    }
    // Google, Microsoft, Facebook: https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
    }
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

