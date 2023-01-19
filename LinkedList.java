
public class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node START, NODE;
    void add(int data) {
        Node New = new Node(data), ptr = START;
        if(START == null) START = New;
        else {
            while(ptr.next != null) ptr = ptr.next;
            ptr.next = New;
        }   
        NODE = START;
    }
    void delete(int pos) {
        Node del, ptr = START;
        if(pos == 0) {
            del = START;
            START = del.next;
            return;
        }
        for (int i = 0; i < pos - 1; i++) ptr = ptr.next;
        del = ptr.next;
        ptr.next = del.next;
    }
    void display() {
        Node ptr = START;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.next;
        }
    }
    boolean hasNext() {
        return NODE != null;
    }

    int next() {
        int data = NODE.data;
        NODE = NODE.next;
        return data;
    }
    public static void main(String[] args) {
        LinkedList m = new LinkedList();
        for (int i = 0; i < 5; i++) {
            m.add(i + 1);
        }
        // m.display();
        // m.delete(2);
        // System.out.println();
        // m.display();
        while (m.hasNext()) {
            System.out.print(m.next() + "\t");
        } 
    }
 }
