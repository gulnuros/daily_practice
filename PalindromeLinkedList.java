public class PalindromeLinkedList {
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

    ListNode front;

    public boolean isPalindrome(ListNode head) {
        front = head;
        return recursivelyCheck(head);
    }

    public boolean recursivelyCheck(ListNode current) {
        if (current == null)
            return true;

        boolean res = recursivelyCheck(current.next);

        if (current.val != front.val)
            return false;

        front = front.next;
        return res;
    }
}
