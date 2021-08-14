//Viet chuong trinh dao xau ki tu nhap tu ban phim su dung cau truc luu tru stack ( cai dat stack bang linked list stack ) 
//- Lop Node: chua cau truc cua 1 node trong stack
//- Lop LinkedListStack: lop tu tao, chua stack
//- Lop Control: thuc hien thuat toan va cong viec cua bai su dung stack
//+) Ham Reverse (String str) ( dao xau ki tu)
//+) Ham main
package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author Admin
 */
class Node {

    public Object info;
    public Node next;

    public Node(Object x, Node p) {
        info = x;
        next = p;
    }

    public Node(Object x) {
        this(x, null);
    }
}

class LinkedStack {

    protected Node head;

    public LinkedStack() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(Object x) {
        head = new Node(x, head);
    }

    Object top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (head.info);
    }

    public Object pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object x = head.info;
        head = head.next;
        return (x);
    }

}

public class ReverseString {
    public LinkedStack ls = new LinkedStack();
    public  String reverse(String str) {
        for (int i = 0; i < str.length(); i++) {
            ls.push(str.charAt(i));
        }
        String result = "";
        while (!ls.isEmpty()) {            
            result+=ls.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("Hanoi mua nay"));
    }
}
