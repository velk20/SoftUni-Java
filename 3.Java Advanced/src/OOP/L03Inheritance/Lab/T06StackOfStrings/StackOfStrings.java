package OOP.L03Inheritance.Lab.T06StackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StackOfStrings extends ArrayDeque<String> {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    @Override
    public void push(String element) {
        this.data.add(element);
    }

    @Override
    public String pop() {
        return this.data.remove(this.data.size() - 1);
    }

    @Override
    public String peek() {
        return this.data.get(data.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
