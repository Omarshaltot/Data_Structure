package Data_Structure;

class Node {
    int val;
    Node next;
    Node pre;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.pre = null;
    }
}

public class Double_Linked_List {
    Node head;
    Node tail;

    public Double_Linked_List() {
        this.head = null;
        this.tail = null;
    }

    public void Push_back(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.pre = this.tail;
            this.tail = node;
        }
    }

    public void Pop_back() {
        if (this.head == null) {
            return;
        } else if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        }

        else {
            this.tail = this.tail.pre;
            this.tail.next = null;

        }

    }

    public void Push_front(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.head.pre = node;
            node.next = this.head;
            this.head = node;
        }

    }

    public void Pop_front() {
        if (this.head == null) {
            return;
        } else if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.pre = null;
        }
    }

    public static void main(String[] args) {
        Double_Linked_List link = new Double_Linked_List();
        link.Push_back(5);
        link.Push_back(4);
        link.Push_front(7);
        link.Pop_back();
        link.Pop_front();
        link.Push_back(2);
        link.Push_back(4);
        link.Pop_front();
        for (Node i = link.head; i != null; i = i.next) {
            System.out.println(i.val);
        }
    }

}
//hi mazen

