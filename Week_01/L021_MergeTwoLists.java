package LinkedList;

public class L021_MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(3);
        ListNode t3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        t1.next = t2;
        t2.next = t3;
        ListNode ret = new L021_MergeTwoLists().mergeTwoLists(l1, t1);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}
