package Advanced.L07Workshop.Exercise;

public class Node {
    private int value;
    private Node nextNode;
    private Node prevNode;

    public Node(int value) {
        this.value = value;
    }


    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }
}
