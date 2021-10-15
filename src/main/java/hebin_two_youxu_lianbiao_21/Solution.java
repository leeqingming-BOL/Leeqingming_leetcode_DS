package hebin_two_youxu_lianbiao_21;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head1 = new ListNode(-1, l1);
        ListNode head2 = new ListNode(-1, l2);

        if (l2.val < l1.val) {
            ListNode listNode = l2.next;
            l2.next = l1;
            head1.next = l2;
            head2.next = listNode;
        }

        ListNode head = head1.next;

        while (head2.next != null) {
            ListNode curr2 = head2.next;
            int currInt2 = curr2.val;
            if (head1.next != null) {
                ListNode curr1 = head1.next;
                int currInt1 = curr1.val;
                if (currInt2 >= currInt1) {
                    curr2.next = curr1.next;
                    curr1.next = curr2;
                } else {
                    head1.next = curr2;
                    curr2.next = curr1;
                }
            } else {
                head1.next = curr2;
            }
            /*while (head1.next != null) {//有序链表，无需再循环
                ListNode curr1 = head1.next;
                int currInt1 = curr1.val;
                if (currInt2 >= currInt1) {
                    curr2.next = curr1.next;
                    curr1.next = curr2;
                } else {
                    head1.next = curr2;
                    curr2.next = curr1;
                }
                head1 = head1.next;
            }*/
            head1 = head1.next;
            head2 = head2.next;
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
