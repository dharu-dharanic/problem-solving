package LeetCode.Queue;


/*
Leetcode 622. Design Circular Queue
https://leetcode.com/problems/design-circular-queue/

Time Complexity:
enQueue() : O(1)
deQueue() : O(1)
Front()   : O(1)
Rear()    : O(1)
isEmpty() : O(1)
isFull()  : O(1)

Space Complexity: O(k)
*/

class MyCircularQueue {

    int front, rear, size;
    int[] arr;

    public MyCircularQueue(int k) {
        size = k;
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    public boolean enQueue(int value) {

        if ((rear + 1) % size == front) {
            return false;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = value;

        return true;
    }

    public boolean deQueue() {

        if (front == -1) {
            return false;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return true;
    }

    public int Front() {

        if (front == -1) {
            return -1;
        }

        return arr[front];
    }

    public int Rear() {

        if (rear == -1) {
            return -1;
        }

        return arr[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}

