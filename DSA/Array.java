import java.util.Scanner;

public class Array {
    private int arr[]; 
    public int size;
    private int initial_size = 10;

    Array() {
        arr = new int[initial_size];
    }

    void insert(int n) {
        if(isfull()) {
            int temp[] = new int[(int)(arr.length * 1.1)];
            for (int i = 0; i < arr.length; i++) temp[i] = arr[i];
            arr = temp; 
        }
        arr[size++] = n;
    }

    boolean isfull() {
        return arr.length == size;
    }

    void delete(int data) {
        int index;
        for (index = 0; index < arr.length - 1; index++) if(data == arr[index]) break;
        if(index != size - 1) {
            int temp[] = new int[--size];
            for (int i = index; i < arr.length - 1; i++) arr[i] = arr[i + 1];
            for (int i = 0; i < temp.length; i++) temp[i] = arr[i];
            arr = temp;
        }
    }

    void display() {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println( "\nSize = " +  size);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        scan.close();
        Array A = new Array();

        for (int i = 0; i < 20; i++) A.insert(i + 1);
        A.display();
        A.delete(12);
        A.display();
    }
}
