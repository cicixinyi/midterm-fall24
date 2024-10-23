package org.example;

public class MyCircularQueue {

    int queue[];
    int queueLength;
    int front;
    int rear;
    int elementNum = 0;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.queueLength = k;
        this.front = 0;
        this.rear = 1;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        queue[front] = value;
        front++;
        rear++;
        elementNum++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        rear--;
        elementNum--;
        return true;
    }

    public int Front() {
        if(isEmpty())
            return -1;
        else
            return front;
    }

    public int Rear() {
        if(isEmpty())
            return -1;
        else
            return rear-1;
    }

    public boolean isEmpty() {
        return elementNum == 0;
    }

    public boolean isFull() {
        return elementNum == queueLength;
    }
}