package L05Lists.MoreExercise;

import java.util.Scanner;

public class T00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "M1y java8 Progr5am";

        StringBuilder build = new StringBuilder(str);
        System.out.println("Pre Builder : " + build);
        build.deleteCharAt(1);  // Shift the positions front.
        build.deleteCharAt(8-1);
        build.deleteCharAt(15-2);
        System.out.println("Post Builder : " + build);
    }
}
