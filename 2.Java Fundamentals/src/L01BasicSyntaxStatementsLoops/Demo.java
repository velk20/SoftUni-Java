package L01BasicSyntaxStatementsLoops;


import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character a = 'a';
        System.out.println(typeOf(a));

    }
    private static String typeOf(Object o) {//return type of variable
        return o.getClass().getSimpleName();
    }


}
