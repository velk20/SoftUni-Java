package L05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = "{lessonTitle}-Exercise";
        String str = "{lessonTitle}:Exercise";

        System.out.println(Arrays.toString(st.split("-")));
        System.out.println(Arrays.toString(str.split("-")));

    }
}
