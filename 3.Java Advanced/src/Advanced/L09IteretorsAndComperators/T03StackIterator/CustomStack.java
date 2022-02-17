package Advanced.L09IteretorsAndComperators.T03StackIterator;

import java.util.NoSuchElementException;

public class CustomStack {
    private int[] data;
    private static final int INITIAL_CAPACITY = 4;
    private int size;
    private int capacity;

    public CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
    }

    public void push(int element) {
        this.data[size] = element;
        size++;
        grow();
    }

    public int pop() {
        checkEmpty();
        int removedItem = this.data[size - 1];
        this.data[size - 1] = 0;
        size--;
        return removedItem;
    }
    public int peek() {
        checkEmpty();
        return this.data[this.size - 1];
    }

    private void checkEmpty(){
        if (this.size == 0) {
            throw new NoSuchElementException("CustomStack is empty");
        }
    }

    public void grow() {
        if (this.size == this.capacity) {
            this.capacity = this.capacity * 2;
            int[] temp = new int[this.capacity];
            for (int i = 0; i < this.size; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }


    }
}
