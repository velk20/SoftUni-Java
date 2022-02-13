package Advanced.L09IteretorsAndComperators.Exercise.T09LinkedListTraversal;

public class Node {
    Node prev;
    Node next;
    Integer value;

    public Node(int value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}