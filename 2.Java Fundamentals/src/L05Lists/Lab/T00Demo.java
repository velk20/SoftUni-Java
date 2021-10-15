package L05Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        List<E> holds a list of elements (like array, but extendable)

        Provides operations to add / insert / remove / find elements:

        - size() – number of elements in the List<E>
        - add(element) – adds an element to the List<E>
        - add(index, element) – inserts an element to given position
        - remove(element) – removes an element (returns true / false)
        - remove(index) – removes element at index
        - contains(element) – determines whether an element is in the list
        - set(index, item) – replaces the element at  the given index

        */

        List<String> names = new ArrayList<>();
        //adding elements
        names.add("ivan");
        names.add("gosho");
        names.add("pleven");

        //remove elements
        names.remove(0);
        names.remove("gosho");


        List<Integer> nums = new ArrayList<>();

        //adding elements
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        //remove elements
        nums.remove(0);//maha ot index
        nums.remove(Integer.valueOf(20));//maha chisloto 20
    }
}
