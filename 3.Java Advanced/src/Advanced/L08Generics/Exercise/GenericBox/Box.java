package Advanced.L08Generics.Exercise.GenericBox;

public class Box<T> {

    private T element;


    public Box(T element) {
        this.element = element;
    }

    public String toString(){
        return String.format("%s: %s", element.getClass().getName(), element);
    }
}
