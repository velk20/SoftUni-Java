package T12AlgorithmsFundamentalsWithJava.Recursion;

import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        System.out.print("(main");
        a();
        System.out.print(")");
    }

    private static void a() {
        System.out.print("(a");
        b();
        System.out.print(")");

    }
    private static void b() {
        System.out.print("(c");
        c();
        System.out.print(")");
    }
    private static void c() {
        System.out.print("(d");
        d();
        System.out.print(")");
    }
    private static void d() {

        System.out.print("(d)");
    }
}
