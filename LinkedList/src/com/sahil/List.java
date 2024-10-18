package com.sahil;

public class List {
    private Node Head;
    private Node Tail;
    private int Size;

    public List() {
        this.Size = 0;
    }

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = Head;
        Head = node;
        if (Tail == null) {
            Tail = Head;
        }
        Size += 1;

    }

    public void InsertLast(int val) {
        if (Tail == null) {
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        Tail.next = node;
        Tail = node;
        Size++;
    }

    public void Insert(int val, int index) {
        if (index == 0) {
            InsertFirst(val);
            return;
        }
        if (index == Size) {
            InsertLast(val);
            return;
        }
        Node temp = Head;
        for (int i = 1; i < index; i++) {//index start from zero since head is at zero index
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        Size++;

    }

    //Insert using recursion
    public void InsertRec(int val, int index) {
        Head = InsertRec(val, index, Head);
    }

    private Node InsertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            Size++;
            return temp;
        }
        node.next = InsertRec(val, index - 1, node.next);
        return node;
    }

    public int DeleteLast() {
        if (Size <= 1) {
            return DeleteFirst();
        }
        Node SecondLast = get(Size - 2);
        int val = Tail.value;
        Tail = SecondLast;
        Tail.next = null;
        return val;
    }

    public Node Find(int value) {
        Node node = Head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = Head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int DeleteFirst() {
        int val = Head.value;
        Head = Head.next;
        if (Head == null) {
            Tail = null;
        }
        Size--;
        return val;
    }

    public int Delete(int index) {
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == Size - 1) {
            return DeleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void display() {
        Node temp = Head;
        while (temp != null) {//we will use temp as pointer instead of head since head is always first element
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;


        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void duplicates() {
        Node node = Head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                Size--;
            } else {
                node = node.next;
            }
        }
        Tail = node;
        Tail.next = null;

    }

    public static List merge(List first, List second) {
        Node f = first.Head;
        Node s = second.Head;
        List ans = new List();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.InsertLast(f.value);
                f = f.next;
            } else {
                ans.InsertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.InsertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.InsertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    // to check has cycle ll
    public boolean hasCycle(Node head) {
        Node fast = Head;
        Node slow = Head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //find length of cycle
    public int lengthofCycle(Node head) {
        Node fast = Head;
        Node slow = Head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //calculate the length
                Node temp = slow;
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
    public void bubbleSort() {
        bubbleSort(Size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == Head) {
                    Head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == Tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    Tail = first;
                    first.next = null;
                    second.next = Tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }
    private void reverse(Node node) {
        if (node == Tail) {
            Head = Tail;
            return;
        }
        reverse(node.next);
        Tail.next = node;
        Tail = node;
        Tail.next = null;
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (Size < 2) {
            return;
        }

        Node prev = null;
        Node present = Head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        Head = prev;
    }



    public static void main(String[] args) {
//        LL list = new LL();
//        list.InsertLast(1);
//        list.InsertLast(1);
//        list.InsertLast(2);
//        list.InsertLast(2);
//        list.InsertLast(3);
//        list.InsertLast(4);
//        list.display();
//        list.duplicates();
//        list.display();
        List first = new List();
        List second = new List();
       first.InsertLast(1);
        first.InsertLast(3);
        first.InsertLast(5);
      first.InsertLast(7);
       first.InsertLast(9);
       first.InsertLast(10);
        second.InsertLast(2);
        second.InsertLast(4);
        second.InsertLast(6);
        second.InsertLast(8);
        second.InsertLast(10);
        List ans = List.merge(first,second);
        ans.display();

    }

}
