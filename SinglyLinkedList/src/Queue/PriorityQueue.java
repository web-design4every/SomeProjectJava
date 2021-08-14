/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Admin
 */
public class PriorityQueue {

    protected float[] a;
    int top, max;

    public PriorityQueue() {
        this(50);
    }

    public PriorityQueue(int max1) {
        max = max1;
        a = new float[max];
        top = -1;
    }

    protected boolean grow() {
        int max1 = max + max / 2;
        float[] a1 = new float[max1];
        if (a1 == null) {
            return (false);
        }
        for (int i = 0; i <= top; i++) {
            a1[i] = a[i];
        }
        a = a1;
        return (true);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == max - 1);
    }

    public void clear() {
        top = -1;
    }

    public void enqueue(float x) {
        if (isFull() && !grow()) {
            return;
        }
        if (top == -1) {
            a[0] = x;
            top = 0;
            return;
        }
        int i = top;
        while (i >= 0 && x < a[i]) {
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = x;
        top++;
    }

    public float front() {
        assert (!isEmpty());
        return (a[top]);
    }

    public float dequeue() {
        assert (!isEmpty());
        float x = a[top];
        top--;
        return (x);
    }

    public static void main(String[] args) throws Exception {
      int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        myQueue q = new myQueue();
        for (int i = 0; i < a.length; i++) {
            q.enqueue(a[i]);
        }
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
