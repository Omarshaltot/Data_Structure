public class StackArray {
    int head;
    int maxSize;
    int arr[] = null;

    public StackArray(int maxSize) {
        this.head = -1;
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }

    public boolean isEmpty() {
        if (head == -1) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if (head == maxSize - 1)
            return true;
        else
            return false;

    }

    public void push(int val) {
        if (this.isFull()) {
            return;
        } else {
            this.head++;
            this.arr[head] = val;
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            int val = this.arr[this.head];
            this.head--;

            return val;
        }
    }

    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }

        return this.arr[this.head];
    }
}