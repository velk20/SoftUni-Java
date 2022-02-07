package Advanced.L08Generics.Exercise.GenericCount;

import java.util.ArrayList;
import java.util.List;

public class Count<T extends Comparable<T>> {
    private List<T> list;

    public Count() {
        this.list = new ArrayList<>();
    }

    

}
