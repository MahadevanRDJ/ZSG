public class DoublyLinkedList {
    static int size;
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null; 
            this.prev = null;
            size++;
        }
    }
    Node START, END, NEXT;

    void add(int data) {
        Node New = new Node(data), ptr = START;
        if(START == null) START = New;
        else {
            while(ptr.next != null) ptr = ptr.next;
            New.prev = ptr; 
            ptr.next = New;   
        }   
        NEXT = START;
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
            del.next.prev = del.prev;
            size--;
        }
    }
    void pop() {
        Node ptr = START;
        while(ptr.next.next != null) ptr = ptr.next;
        ptr.next = null;
    }
    void insertAt(int pos, int data) {
        if(pos < this.Size()) {
            Node New = new Node(data), ptr = START;
            if(pos == 0) {
                New.next = START;
                START = New;
                return;
            }
            for (int i = 0; i < pos - 1; i++) ptr = ptr.next;
            New.next = ptr.next;
            ptr.next = New;
            New.prev = ptr;
            NEXT = START;
        }
    }
    
    void display() {
        Node ptr = START;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.next;
        }
        System.out.println();
    }
    
    void displayBackward() {
        Node ptr = START;
        while(ptr.next != null) ptr = ptr.next;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.prev;
        }
        System.out.println();
    }

    boolean hasNext() {
        return NEXT != null;
    }

    int next() {
        int data = NEXT.data;
        NEXT = NEXT.next;
        return data;
    }
    int Size() {
        return size;
    }
    public static void main(String[] args) {
        DoublyLinkedList m = new DoublyLinkedList();
        for (int i = 0; i < 5; i++) {
            m.add(i + 1);
        }
        m.display();
        m.delete(2);
        m.display();
        m.pop();
        m.displayBackward();
    }
}
