package L05Lists;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= "abcdef";

        String[] array=str.split("(?<=\\G.{2})");

        System.out.println(java.util.Arrays.toString(array));
    }
}
