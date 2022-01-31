package Advanced.L07Workshop.Lab;

import java.util.Arrays;

public class SmartArray {
    public static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int size;
    private int capacity;

    public SmartArray(){
        this.data = new int[INITIAL_CAPACITY];
        size = 0;
        capacity = INITIAL_CAPACITY;
    }

    public void add(int element) {
        this.data[size] = element;
        size++;
        resize();
    }

    public int get(int index) {
        isInBounds(index);
            return this.data[index];
    }

    public void resize() {
        if (this.size == this.capacity) {
            this.capacity = capacity * 2;
            int[] temp = new int[this.capacity];
            for (int i = 0; i < data.length; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }
    }

    public void isInBounds(int index) {
        if (index < 0 || index >= size) {
            String message = String.format("Index %d out of bounds for length %d", index, this.size);
            throw new IndexOutOfBoundsException(message);

        }
    }

}
