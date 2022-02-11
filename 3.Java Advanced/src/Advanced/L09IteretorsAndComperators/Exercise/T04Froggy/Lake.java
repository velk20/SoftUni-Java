package Advanced.L09IteretorsAndComperators.Exercise.T04Froggy;

import java.util.*;

public class Lake implements Iterable<Integer>{
    private List<Integer> indexes;



    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    public class Frog implements Iterator<Integer>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }

}
