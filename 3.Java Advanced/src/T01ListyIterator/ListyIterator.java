package T01ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class ListyIterator {

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
        }else this.index = 0;
    }

    public boolean Move(){
        if (this.index < this.data.size() - 1) {
            this.index++;
            return true;
        }
        return false;

    }

    public void Print() throws Exception{
        if (!this.data.isEmpty()) {
            System.out.println(this.data.get(this.index));
        }
        else{
            throw new Exception("Invalid Operation!");
        }
    }

    public boolean HasNext(){
        return this.index < this.data.size() - 1;
    }



}
