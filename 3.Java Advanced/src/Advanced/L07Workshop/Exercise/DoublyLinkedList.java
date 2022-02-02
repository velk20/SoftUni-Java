package Advanced.L07Workshop.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            newNode.setNextNode(this.head);
            this.head.setPrevNode(newNode);
            this.head = newNode;
        }
        this.size++;

    }

    public void addLast(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            newNode.setPrevNode(this.tail);
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public int get(int index) {
        checkIndex(index);
        if (isEmpty()) {
            throw new NoSuchElementException("The DoublyLinkedList is Empty!");
        } else {
            if (index <= size / 2) {
                Node findNode = this.head;

                for (int i = 0; i < index; i++) {
                    findNode = findNode.getNextNode();
                }
                return findNode.getValue();
            } else {
                Node findNode = this.tail;
                for (int i = this.size - 1; i > index; i--) {
                    findNode = findNode.getPrevNode();
                }
                return findNode.getValue();
            }
        }
    }

    public int removeFirst() {
        if (isEmpty()) throw new IllegalStateException("Your doublyLinkedList is empty");

        else if (this.size == 1) {
            int removedItem = this.head.getValue();
            this.head = this.tail = null;
            this.size--;
            return removedItem;
        } else {
            int removedItem = this.head.getValue();
            this.head = this.head.getNextNode(); //премествам head
            this.head.setPrevNode(null);
            this.size--;
            return removedItem;
        }

    }

    public int removeLast(){
        if (isEmpty()) throw new IllegalStateException("Your doublyLinkedList is empty");
        else if (this.size == 1) {
            int removedItem = this.tail.getValue();
            this.head = this.tail = null;
            this.size--;
            return removedItem;
        } else {
            int removedItem = this.tail.getValue();
            this.tail = this.head.getNextNode();
            this.tail.setNextNode(null);
            this.size--;
            return removedItem;
        }
    }
    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;
        while (currentNode != null) {
            consumer.accept(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }

    public int[] toArray() {
        //1. СЪХРАНЯВАМЕ ЕЛЕМЕНТИТЕ В ЛИСТ
        List<Integer> resultList = new ArrayList<>();
        forEach(el -> resultList.add(el));
        //2. ПРЕОБРАЗУВАМЕ ЛИСТА В МАСИВ
        return resultList.stream().mapToInt(e -> e).toArray();
    }

    private boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            String message = String.format("Index: %d, Size: %d", index, this.size);
            throw new IndexOutOfBoundsException(message);
        }
    }

}
