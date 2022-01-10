package implementations;

import interfaces.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private static final int INITIAL_DEFAULT_CAPACITY = 8;
    private static final int CAPACITY_INCREASE_MULTIPLIER = 2;
    private static final String INDEX_OUT_OF_BOUNDS_MESSAGE = "Index is out of bounds";

    private E[] data;
    private int capacity;
    private int size;

    public ArrayList() {
        this(INITIAL_DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        capacity = initialCapacity;
        data = (E[]) new Object[capacity];
    }

    @Override
    public boolean add(E element) {
        
    }

    @Override
    public boolean add(int index, E element) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
