/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author Admin
 */
class Node {

    int info;
    Node left, right;

    Node(int x) {
        info = x;
        left = right = null;
    }
}

public class BTree {

    Node root;

    BTree() {
        root = null;
    }

    boolean isEmpty() {
        return (root == null);
    }

    Node search(Node p, int x) {
        if (p == null) {
            return (null);
        }
        if (p.info == x) {
            return (p);
        }
        if (x < p.info) {
            return (search(p.left, x));
        } else {
            return (search(p.right, x));
        }
    }

    void insert(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            root = q;
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if (p.info == x) {
                System.out.println("The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (x < f.info) {
            f.left = q;
        } else {
            f.right = q;
        }
    }

    void insertMany(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    void visit(Node p) {
        System.out.print(p.info + " ");
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
      void copyDele(int x) {
        if (root == null) {
            System.out.println(" The tree is empty, no deletion");
            return;
        }
        Node f, p; // f will be the father of p
        p = root;
        f = null;
        while (p != null) {
            if (p.info == x) {
                break;//Found key x
            }
            if (x < p.info) {
                f = p;
                p = p.left;
            } else {
                f = p;
                p = p.right;
            }
        }
        if (p == null) {
            System.out.println(" The key " + x + " does not exist, no deletion");
            return;
        }
        if (p.left == null && p.right == null) // p is a leaf node
        {
            if (f == null) // The tree is one node
            {
                root = null;
            } else {
                if (f.left == p) {
                    f.left = null;
                } else {
                    f.right = null;
                }
            }
            return;
        }

        if (p.left != null && p.right == null) // p has only left child
        {
            if (f == null) // p is a root
            {
                root = p.left;
            } else {
                if (f.left == p) // p is a left child
                {
                    f.left = p.left;
                } else {
                    f.right = p.left;
                }
            }
            return;
        }

        if (p.left == null && p.right != null) // p has only right child
        {
            if (f == null) // p is a root
            {
                root = p.right;
            } else {
                if (f.left == p) // p is aleft child
                {
                    f.left = p.right;
                } else {
                    f.right = p.right;
                }
            }
            return;
        }

        if (p.left != null && p.right != null) // p has both left and right children
        {
            Node rp; // p's key will be replaced by rp's one
            f = null;
            rp = p.left;
            while (rp.right != null) {
                f = rp;
                rp = rp.right;
            }// Find the right most node on the left sub-tree
            p.info = rp.info;
            if (f == null) // rp is just a left son of p 
            {
                p.left = rp.left;
            } else {
                f.right = rp.left;
            }
        }

    }
}


class Main {

    public static void main(String[] args) {
        BTree t = new BTree();
        int[] a = {25, 10, 30, 5, 20, 10, 15};
        t.insertMany(a);
        System.out.println("\nPre-order traverse:");
        t.preOrder(t.root);
        System.out.println("\nIn-order traverse:");
        t.inOrder(t.root);
        System.out.println("\n\n Ater deleting 15:");
        t.copyDele(new Integer(15));
        System.out.println("\nPre-order traverse:");
        t.preOrder(t.root);
        System.out.println("\nPost-order traverse:");
        t.postOrder(t.root);
        System.out.println();
    }
}
