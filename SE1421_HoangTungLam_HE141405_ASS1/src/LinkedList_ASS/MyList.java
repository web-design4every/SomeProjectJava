/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_ASS;
public class MyList<T> {

    public Node head, tail;
  
    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
    }

    public void addHead(T x) {
        if (isEmpty()) {
            head = tail = new Node(x, null);
            return;
        }
        Node p = new Node(x, null);
        p.next = head;
        head = p;
    }

    public void addTail(T x) {
        if (isEmpty()) {
            head = tail = new Node(x, null);
            return;
        }
        Node p = new Node(x, null);
        tail.next = p;
        tail = p;
    }

    public void traval() {
        Node p = head;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }

    public Node search(T x) {
        Node p = head;
        while (p != null) {
            if (p.info == x) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public int searchPos(T x) {
        Node p = head;
        int count = -1;
        while (p != null) {
            count++;
            if (p.info == x) {
                return count;
            }
            p = p.next;
        }
        return -1;
    }

    public void removeLast() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node p = head;
        while (p != null) {
            if (p.next == tail) {
                tail = p;
                p.next = null;
                break;
            }
            p = p.next;

        }
    }

    public void removeHead() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public void addManyTail(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            addTail(arr[i]);
        }
    }

    public void addManyHead(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            addHead(arr[i]);
        }
    }

    public int length() {
        int count = 0;
        Node p = head;
        if (isEmpty()) {
            return 0;
        }
        if (head == tail) {
            return 1;
        }
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public void removeAtPos(int pos) {
        int size = length();
        if (pos < 0 || pos > length() - 1) {
            return;
        }
        if (pos == 0) {
            removeHead();
            return;
        }
        if (pos == size - 1) {
            removeLast();
            return;
        }
        int count = 0;
        Node p = head;
        while (count < pos - 1) {
            count++;
            p = p.next;
        }
        Node curentNode = p.next;
        p.next = curentNode.next;
        curentNode.next = null;
    }

    public void remove(T x) {
        if (isEmpty()) {
            return;
        }
        if (head.info == x) {
            removeHead();
            return;
        }

        Node p = head;
        while (p.next != null) {
            if (p.next.info == x) {
                p.next = p.next.next;
                break;
            } else {
                p = p.next;
            }
        }
        if (p.next == null) {
            tail = p;
        }
    }
    public T get(int index){
        if(index < 0 || index >= length()){
            return null;
        }
        int count = -1;
        Node p = head;
        while(p != null){           
            count++;
            if(count == index){
                return (T) p.info;             
            }
            p = p.next;
        }
        return null;
    }
    public void set(int index, T value){
        if(index < 0 || index >= length()){
            return;
        }
        int count = -1;
        Node p = head;
        while(p != null){
            count++;
            if(count == index){
                p.info = value;
            }
            p = p.next;
        }
    }
    public void addPosK(int k, T x) {
        if (isEmpty()) {
            if (k == 0) {
                head = tail = new Node(x, null);
                return;
            } else {
                return;
            }
        }
        if (k == 0) {
            addHead(x);
            return;
        }
        Node p = head;
        int count = 0;
        Node q = new Node(x, null);
        while (p != null) {
            if (count++ == k - 1) {
                q.next = p.next;
                p.next = q;
                if (tail.next != null) {
                    tail = q;
                }
            } else {
                p = p.next;
            }
        }
    }
}
