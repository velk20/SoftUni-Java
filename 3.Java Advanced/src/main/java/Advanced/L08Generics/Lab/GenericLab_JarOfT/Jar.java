package Advanced.L08Generics.Lab.GenericLab_JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {

    private ArrayDeque<T> arrayDeque;

    public Jar() {
        this.arrayDeque = new ArrayDeque<>();

    }

    public void add(T element) {
        this.arrayDeque.push(element);

    }

    public T remove() {
        return this.arrayDeque.pop();
    }
}
