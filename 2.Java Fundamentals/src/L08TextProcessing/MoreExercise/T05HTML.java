package L08TextProcessing.MoreExercise;

import java.util.*;

public class T05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String article = scanner.nextLine();
        List<String> comments = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end of comments")) {
            comments.add(input);
            input = scanner.nextLine();
        }

        System.out.printf("<h1>\n\t%s\n</h1>\n", title);
        System.out.printf("<article>\n\t%s\n</article>\n", article);
        for (String s : comments) {
            System.out.printf("<div>\n\t%s\n</div>\n", s);
        }
    }
}
