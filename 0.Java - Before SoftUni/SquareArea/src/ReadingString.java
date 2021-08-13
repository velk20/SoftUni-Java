import java.util.Scanner;

public class ReadingString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String name2 = scan.nextLine();

        System.out.printf("Hello, %s, %s",name,name2);
    }
}
