package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode curr = head;
        ListNode curr2 = head;
        int var = 1;

        while (curr.next != null) {
            var++;
            curr = curr.next;
        }
        curr = head;

        int mid = var / 2;
        for (int i = 0; i < mid; i++) {

            curr2 = curr2.next;

            if(i == mid - 1) { // stops when logic of mid is big enough
                curr.next = null;
            }
            else {
                curr = curr.next;
            }
        }
        return curr2;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
    }
}
