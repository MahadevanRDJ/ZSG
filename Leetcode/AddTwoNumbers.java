public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode L3 = new ListNode(0), ptr = L3;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1) {
            int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            carry = sum / 10;
            ListNode New = new ListNode(sum % 10);
            ptr.next = New;
            ptr = New;
            l1 = ((l1 == null) ? l1 : l1.next); 
            l2 = ((l2 == null) ? l2 : l2.next);
        }
        return L3.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
