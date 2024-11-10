package org.example;

public class SolutionLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        public ListNode (int val) {
            this.val = val;
        }
        public ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // leetcode 141
    public boolean linkedListCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;

    }

    // leetcode 2
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int i1 = l1 != null ? l1.val : 0;
            int i2 = l2 != null ? l2.val : 0;

            int sum = i1 + i2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode new_node = new ListNode(digit);
            l3.next = new_node;

            if (l2 != null) l2 = l2.next;
            if (l1 != null) l1 = l1.next;
            l3 = l3.next;
        }

        return dummy.next;

    }

    // leetcode 21






}
