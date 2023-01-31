import java.util.Scanner;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ListNode A = new ListNode(), B = new ListNode(), res;
        System.out.println("Enter the position from the END.");
        int n = 3, i = 0;
        while(i++ < n) A = new ListNode(scan.nextInt(), A);
        System.out.println();
        while(i-- > 1) B = new ListNode(scan.nextInt(), B);
        scan.close();
        res = mergeTwoLists(A, B);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = list1; 
        while(merge.val != 0) {merge = merge.next;}
        merge.next = list2;
        
        ListNode ptr = list1, nptr;
        while(ptr != null) {
            nptr = ptr.next;
            while(nptr != null) {
                if(ptr.val > nptr.val) { 
                    int t = ptr.val;
                    ptr.val = nptr.val;
                    nptr.val = t;
                }
                nptr = nptr.next;
            }
            ptr = ptr.next;
        }
        return list1.next.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 