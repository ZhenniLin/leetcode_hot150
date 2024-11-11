package org.example;

import java.util.List;

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
    public ListNode mergeTwoSortedList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }

        if (list1 != null) {
            pointer.next = list1;
            list1 = list1.next;
            pointer = pointer.next;
        }

        if (list2 != null) {
            pointer.next = list2;
            list2 = list2.next;
            pointer = pointer.next;
        }

        return dummy.next;

    }

    // leetcode 138

    // leetcode 206
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;

        }

        return prev;
    }

    // leetcode 92
    public ListNode reverseLinkedListII(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        int i = 1;

        while ( i < left) {
            prev = cur;
            cur = cur.next;
            i++;
        }

        ListNode node = prev;
        while (i++ <= right) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        node.next.next = cur;
        node.next = prev;

        return dummy.next;
    }

    // leetcode 19
    public ListNode removeNthNode(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    // leetcode 82
    public ListNode removeDuplicatesFromSortedListII() {

    }








}
