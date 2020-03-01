package com.jacend.queue;

public class CircularQueue {

    private String[] items;
    private int n = 0;
    // head 表示队头下标
    private int head = 0;
    // tail 表示队尾下标
    private int tail = 0;

    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }


    public String dequeue() {
        if (head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
