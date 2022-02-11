package Advanced.L09IteretorsAndComperators.Exercise.T02Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {


    private List<String> data;
    private int index;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.isEmpty()) {
            this.index = -1;
        } else this.index = 0;
    }

    public boolean Move() {
        if (this.index < this.data.size() - 1) {
            this.index++;
            return true;
        }
        return false;

    }

    public void Print() throws Exception {
        if (!this.data.isEmpty()) {
            System.out.println(this.data.get(this.index));
        } else {
            throw new Exception("Invalid Operation!");
        }
    }

    public void PrintAll() {
        System.out.println(String.join(" ", data));
    }

    public boolean HasNext() {
        return this.index < this.data.size() - 1;
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index >= 0 && index < data.size();
            }

            @Override
            public String next() {
                String name = data.get(this.index);
                index++;
                return name;
            }

        };
    }
}
