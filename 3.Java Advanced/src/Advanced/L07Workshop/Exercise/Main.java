package Advanced.L07Workshop.Exercise;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        System.out.println(list.get(0));
    }
}
