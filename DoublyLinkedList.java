public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null; 
            this.prev = null;
        }
    }
    Node START, END, NEXT, PREV;
    void add(int data) {
        Node New = new Node(data), ptr = START;
        if(START == null) START = END = New;
        else {
            while(ptr.next != null) ptr = ptr.next;
            New.prev = END;
            END.next = New;
            END = New;
        } 
        NEXT = START;
        PREV = END;
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
        del.next.prev = ptr;
        ptr.next = del.next;

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
        Node ptr = END;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.prev;
        }
        System.out.println();
    }
    boolean hasNext() {
        return NEXT != null;
    }
    boolean hasPrev() {
        return PREV != null;
    }
    int next() {
        int data = NEXT.data;
        NEXT = NEXT.next;
        return data;
    }
    int prev() {
        int data = PREV.data;
        PREV = PREV.prev;
        return data;
    }
    public static void main(String[] args) {
        DoublyLinkedList m = new DoublyLinkedList();
        for (int i = 0; i < 5; i++) {
            m.add(i + 1);
        }
        // m.display();
        m.delete(0);
        m.display();
        // m.displayBackward();
        while(m.hasPrev()) {
            System.out.print(m.prev() + " ");
        }
    }
}