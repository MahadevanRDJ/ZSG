import java.util.Arrays;
import java.util.Scanner;

public class Array implements List{
    private int arr[]; 
    public int size;
    private int initial_size = 10;

    Array() {
        arr = new int[initial_size];
    }
    
    @Override
    public void add(int n) {
        if(isfull()) {
            int temp[] = new int[(int)(arr.length * 1.1)];
            for (int i = 0; i < arr.length; i++) temp[i] = arr[i];
            arr = temp; 
        }
        arr[size++] = n;
    }

    @Override
    public void insertAt(int index, int data) {
        if(index <= Size()) {
            int temp[] = new int[++size];
            if(index == size) temp[size] = data;
            else {
                int og_index = 0;
                temp[index] = data;
                for (int i = 0; i < temp.length;i++) {
                    if(index != i) temp[i] = arr[og_index++]; 
                } 
            }
            arr = temp;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public int pop() {
        int pop = arr[size -1];
        arr = Arrays.copyOf(arr, --size);
        return pop;
    }

    @Override
    public void delete(int data) {
        int index;
        for (index = 0; index < arr.length - 1; index++) if(data == arr[index]) break;
        if(index != size - 1) {
            int temp[] = new int[--size];
            for (int i = index; i < arr.length - 1; i++) arr[i] = arr[i + 1];
            for (int i = 0; i < temp.length; i++) temp[i] = arr[i];
            arr = temp;
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println( "\nSize = " +  size);
    }

    @Override
    public int Size() {
        return size;
    }

    public boolean isfull() {
        return arr.length == size;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        Array A = new Array();

        for (int i = 0; i < 20; i++) A.add(i + 1);
        A.display();
        
        A.insertAt(20, 100);
        A.display();
        
        A.pop();
        A.display();
    }
}
