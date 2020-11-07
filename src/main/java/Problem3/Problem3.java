package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if (list == null) {
            return;
        }
        if (list.next == null) {
            print.println(list.val);
            return;
        }
        printListInReverse(list.next, print);
        list.next.next = list;
        list.next = null;
        print.println(list.val);
    }
}
