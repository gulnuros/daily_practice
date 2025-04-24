public class CopyListWithRandomPointer {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node temp = head;

        // interweave nodes
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        // assign those random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // separate the lists
        Node dummy = new Node(-1);
        Node copyTail = dummy, original = head;
        while (original != null) {
            copyTail.next = original.next;
            copyTail = copyTail.next;
            original.next = original.next.next;
            original = original.next;
        }

        return dummy.next;
    }

}
