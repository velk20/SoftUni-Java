package L00NotJavaFundamentals;
import static java.util.stream.IntStream.rangeClosed;

import java.util.Scanner;
/*Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.

For example:

a = 1
b = 4
--> [1, 2, 3, 4]*/
public class WhatIsBetween {
    public static void main(String[] args) {
        between(1, 4);
    }
    public static int[] between(int a, int b) {
        return rangeClosed(a, b).toArray();
    }
}
