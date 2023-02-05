public class DoublyLinkedList implements List{
    private int data;
    private DoublyLinkedList next;
    private DoublyLinkedList prev;

    private static int size;
    private DoublyLinkedList START, NEXT;

    DoublyLinkedList() {
        this.data = 0;
        this.next = null;  
        this.prev = null;
    }

    DoublyLinkedList(int data) {
        this.data = data;
        this.next = null; 
        this.prev = null;
        size++;
    }
    
    @Override
    public void add(int data) {
        DoublyLinkedList New = new DoublyLinkedList(data), ptr = START;
        if(START == null) START = New;
        else {
            while(ptr.next != null) ptr = ptr.next;
            New.prev = ptr; 
            ptr.next = New;   
        }   
        NEXT = START;
    }

    @Override
    public void delete(int pos) {
        if(pos < this.Size()){
            DoublyLinkedList del, ptr = START;
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
        NEXT = START;
    }


    @Override
    public int pop() {
        DoublyLinkedList ptr = START;
        while(ptr.next.next != null) ptr = ptr.next;
        int data = ptr.next.data;
        ptr.next = null;
        NEXT = START;
        return data;  
    }

    @Override
    public void insertAt(int pos, int data) {
        if(pos < this.Size()) {
            DoublyLinkedList New = new DoublyLinkedList(data), ptr = START;
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
    
    @Override
    public void display() {
        DoublyLinkedList ptr = START;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.next;
        }
        NEXT = START;
        System.out.println();
    }
    
    @Override
    public int Size() {
        return size;
    }

    public void displayBackward() {
        DoublyLinkedList ptr = START;
        while(ptr.next != null) ptr = ptr.next;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.prev;
        }
        NEXT = START;
        System.out.println();
    }
    

    public boolean hasNext() {
        return NEXT != null;
    }

    public int next() {
        if(NEXT == null) NEXT = START;
        int data = NEXT.data;
        NEXT = NEXT.next;
        return data;
    }

}