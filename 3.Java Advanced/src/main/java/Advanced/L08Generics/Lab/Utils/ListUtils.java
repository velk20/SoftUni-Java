package Advanced.L08Generics.Lab.Utils;

import java.util.Collections;
import java.util.List;

public class ListUtils <T extends Comparable<T>> {

    public T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return Collections.max(list);
    }

    public T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return Collections.min(list);
    }
}
