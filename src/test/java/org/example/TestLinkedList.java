package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestLinkedList {
    SolutionLinkedList linkedList = new SolutionLinkedList();

    @Test
    void testLinkedListCycle() {
        SolutionLinkedList.ListNode node1 = linkedList.new ListNode(-4, null);
        SolutionLinkedList.ListNode node2 = linkedList.new ListNode(0, node1);
        SolutionLinkedList.ListNode node3 = linkedList.new ListNode(2, node2);
        SolutionLinkedList.ListNode node4 = linkedList.new ListNode(3, node3);

        node1.next = node3;

        SolutionLinkedList.ListNode head = node4;

        boolean result = linkedList.linkedListCycle(head);

        assertTrue(result, "Expect true but get false");


    }

    @Test
    void testAddTwoNumber() {
        SolutionLinkedList.ListNode l1node1 = linkedList.new ListNode(3, null);
        SolutionLinkedList.ListNode l1node2 = linkedList.new ListNode(4, l1node1);
        SolutionLinkedList.ListNode l1node3 = linkedList.new ListNode(2, l1node2);
        SolutionLinkedList.ListNode l1 = l1node3;

        SolutionLinkedList.ListNode l2node1 = linkedList.new ListNode(4, null);
        SolutionLinkedList.ListNode l2node2 = linkedList.new ListNode(6, l2node1);
        SolutionLinkedList.ListNode l2node3 = linkedList.new ListNode(5, l2node2);
        SolutionLinkedList.ListNode l2 = l2node3;

        SolutionLinkedList.ListNode l3node1 = linkedList.new ListNode(8, null);
        SolutionLinkedList.ListNode l3node2 = linkedList.new ListNode(0, l3node1);
        SolutionLinkedList.ListNode l3node3 = linkedList.new ListNode(7, l3node2);
        SolutionLinkedList.ListNode expected = l3node3;

        SolutionLinkedList.ListNode result = linkedList.addTwoNumbers(l1, l2);

        assertTrue(areEqual(expected, result), "Do not match");
    }
    private boolean areEqual(SolutionLinkedList.ListNode node1, SolutionLinkedList.ListNode node2) {
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1 == null && node2 == null;
    }

}
