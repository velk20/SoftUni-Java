package Advanced.L07Workshop.Lab;

import java.util.function.Consumer;

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

    public int remove(int index) {
        isInBounds(index);
        int removedNumber = this.data[index];
        shiftRight(index);
        this.size--;
        shrink();
        return removedNumber;
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void add(int firstIndex, int element) {
        isInBounds(firstIndex);
        size++;
        shiftLeft(firstIndex);
        resize();
        this.data[firstIndex] = element;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    public void shiftRight(int index) {
        for (int i = index; i < this.size-1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
    }

    public void shiftLeft(int index) {
        for (int i = this.size - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }



    public void shrink() {
        if (this.capacity / this.size > 4) {
            int[] temp = new int[this.capacity / this.size];
            for (int i = 0; i < this.size; i++) {
                temp[i] = this.data[i];
            }
            this.capacity = this.capacity / this.size;
            this.data = temp;
        }
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
