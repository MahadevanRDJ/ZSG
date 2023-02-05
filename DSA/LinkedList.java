public class LinkedList implements List{
    private int data;
    private LinkedList next;

    private static int size;
    private LinkedList START, NODE;
    

    LinkedList() {
        this.data = 0;
        this.next = null;
    }

    LinkedList(int data) {
        this.data = data;
        this.next = null;
        size++;
    }
    
    @Override
    public void add(int data) {
        LinkedList New = new LinkedList(data), ptr = START;
        if(START == null) START = New;
        else {
            while(ptr.next != null) ptr = ptr.next;
            ptr.next = New;
        }   
        NODE = START;
    }

    @Override
    public void delete(int pos) {
        if(pos < this.Size()){
            LinkedList del, ptr = START;
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

    @Override
    public void insertAt(int pos, int data) {
        if(pos < this.Size()){
            LinkedList New = new LinkedList(data), ptr = START;
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


    @Override
    public int pop() {
        LinkedList ptr = START;
        while(ptr.next.next != null) ptr = ptr.next;
        int data = ptr.next.data;
        ptr.next = null;
        NODE = START;
        size--;
        return data;  
    }
    
    @Override
    public void display() {
        LinkedList ptr = START;
        while(ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.next;
        }
        System.out.println();
    }
    
    @Override
    public int Size() {
        return size;
    }
    
    public boolean hasNext() {
        return NODE != null;
    }

    public int next() {
        if(NODE == null) NODE = START;
        int data = NODE.data;
        NODE = NODE.next;
        return data;
    }
    
    
 }
