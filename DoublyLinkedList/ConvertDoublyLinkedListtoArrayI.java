package DoublyLinkedList;

import org.w3c.dom.Node;

public class ConvertDoublyLinkedListtoArrayI {

    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
    };

    public int[] toArray(Node head) {
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        int[] res = new int[size];
        current = head;
        int i = 0;
        while (current != null) {
            res[i] = current.val;
            current = current.next;
            i++;
        }
        return res;
    }

}
