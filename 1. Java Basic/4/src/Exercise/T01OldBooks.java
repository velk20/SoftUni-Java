package Exercise;

import java.util.Scanner;

public class T01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String book = scanner.nextLine();
        int count = 0;
        while (true) {
            if (book.equals(input)) {
                System.out.printf("You checked %d books and found it.",count);
                break;

            }
            if (book.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",count);
                break;
            }

            count ++;
            book= scanner.nextLine();
        }
    }
}
