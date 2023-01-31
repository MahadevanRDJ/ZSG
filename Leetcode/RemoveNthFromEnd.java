import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListNode A = new ListNode(), res;
        System.out.println("Enter the position from the END.");
        int pos = scan.nextInt(), n = 5, i = 0;
        while(i++ < n) A = new ListNode(i, A);
        res = removeNthFromEnd(A, pos);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    
        scan.close();

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int size = 0, endfrom;
        while(ptr != null) {System.out.print(ptr.val + " "); ptr = ptr.next; size++;} 
        endfrom = size - n;
        if(size == 1) return ptr;
        return delete(head, endfrom);
    }
    public static ListNode delete(ListNode head,int pos) {
        ListNode del, ptr = head;
        if(pos == 0) {
            ptr = ptr.next;
            return ptr;
        }
        for (int i = 0; i < pos - 1; i++) ptr = ptr.next;
        del = ptr.next;
        ptr.next = del.next;
        return head;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}