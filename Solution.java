class ListNode {
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

    // Helper to print current node
    public String nodeInfo() {
        return "Node@" + this.hashCode() + " {val=" + val + ", next=" +
                (next != null ? "Node@" + next.hashCode() + " (val=" + next.val + ")" : "null") + "}";
    }
}

public class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        System.out.println("Initial State:");
        System.out.println("dummy -> " + dummy.nodeInfo());
        System.out.println("head  -> " + (head != null ? head.nodeInfo() : "null"));
        System.out.println("current -> " + current.nodeInfo());
        System.out.println("----");

        while (current.next != null) {
            System.out.println("Current node: " + current.nodeInfo());
            System.out.println("Checking next node: " + current.next.nodeInfo());

            if (current.next.val == val) {
                System.out.println("Removing node with value: " + current.next.val);
                current.next = current.next.next;
            } else {
                current = current.next;
            }

            System.out.println("After step:");
            System.out.println("dummy -> " + dummy.nodeInfo());
            System.out.println("current -> " + current.nodeInfo());
            System.out.println("----");
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(6,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6)))))));

        System.out.println("Original list:");
        printList(head);

        ListNode result = removeElements(head, 6);

        System.out.println("List after removing 6:");
        printList(result);
    }
}
