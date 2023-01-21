public class LinkedList {
    private static int size;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
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
        if(pos < this.Size()){
            Node del, ptr = START;
            if(pos == 0) {
                START = ptr.next;
                return;
            }
            for (int i = 0; i < pos - 1; i++) ptr = ptr.next;
            del = ptr.next;
            ptr.next = del.next;
            size--;
        }
    }

    void insertAt(int pos, int data) {
        if(pos < this.Size()){
            Node New = new Node(data), ptr = START;
            if(pos == 0) {
                New.next = START;
                START = New;
                return;
            }
            for (int i = 0; i < pos - 1; i++) ptr = ptr.next;
            New.next = ptr.next;
            ptr.next = New;
        }
        NODE = START;
    }
    void push(int data) {
        Node New = new Node(data), ptr = START;
        while(ptr.next != null) ptr = ptr.next;
        ptr.next = New;
    } 
    void display() {
        Node ptr = START;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.next;
        }
        System.out.println();
    }
    
    boolean hasNext() {
        return NODE != null;
    }

    int next() {
        int data = NODE.data;
        NODE = NODE.next;
        return data;
    }
    
    int Size() {
        return size;
    }
    public static void main(String[] args) {
        LinkedList m = new LinkedList();
        for (int i = 0; i < 5; i++) {
            m.add(i + 1);
        }
        m.display();
        m.delete(2);
        m.display();
        m.insertAt(0, 8);
        m.insertAt(1, 10);
        m.display();
        m.push(9);
        
        while (m.hasNext()) {
            System.out.print(m.next() + "\t");
        } 
        m.delete(0);
        System.out.println();
        m.display();
    }
 }
