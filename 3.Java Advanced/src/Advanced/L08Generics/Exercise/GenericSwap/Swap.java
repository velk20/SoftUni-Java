package Advanced.L08Generics.Exercise.GenericSwap;

import java.util.ArrayList;
import java.util.List;

public class Swap<T> {
    private List<T> list;

    public Swap() {
        this.list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public void swapp(int one, int two) {
        T element1 = list.get(one);
        T element2 = list.get(two);

        this.list.set(one, element2);
        this.list.set(two, element1);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        list.stream().forEach(e-> stringBuilder.append(String.format("%s: %s\n",e.getClass().getName(),e)));
        return stringBuilder.toString();
    }

}
