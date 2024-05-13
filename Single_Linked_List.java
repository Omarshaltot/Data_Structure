package Data_Structure;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push_front(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void pop_front() {
        if (this.head == null) {
            return;
        }

        // if size == 1
        // if (this.head == this.tail)
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
    }

    public void push_back(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void pop_back() {
        if (this.head == null) {
            return;
        }

        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            Node curr = this.head;

            while (curr.next != this.tail) {
                curr = curr.next;
            }

            // curr is now the node before tail
            curr.next = null;
            this.tail = curr;
        }
    }
}
