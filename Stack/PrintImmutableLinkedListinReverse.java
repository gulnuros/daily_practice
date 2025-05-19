package Stack;

import java.util.Stack;

// This is the ImmutableListNode's API interface.
// You should not implement it, or speculate about its implementation.
interface ImmutableListNode {
    public void printValue(); // print the value of this node.

    public ImmutableListNode getNext(); // return the next node.
};

public class PrintImmutableLinkedListinReverse {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> stack = new Stack<>();
        ImmutableListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.getNext();
        }

        while (!stack.isEmpty()) {
            node = stack.pop();
            node.printValue();
        }
    }
}
