package L01LinearDataStructures.Lab;

import com.sun.glass.ui.Size;

public class MyArrayList {
    public static void main(String[] args) {

    }

    class DynamicArray<E>{
        private Object[] elements = new Object[1];
        private int size = 0;

        boolean add(E element) {
            elements[size] = element;
            size++;
            //TODO: increase elements array

            return true;
        }

        E get(int index) {
            checkIndex(index);
            return (E) elements[index];
        }

        E set(int index, E element) {
            elements[index] = element;
            return element;
        }

        E remove(int index) {

        }

        int size(){
            return this.size;
        }


    }

    private void checkIndex(int index) {
        if (index < 0 || index >= ) {
            throw new IllegalAccessException();
        }

    }
}
