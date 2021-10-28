package L06ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class T02Articles {
    static class Article {
        private String title;
        private String content;
        private  String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        void Edit(String newContent) {
            this.content = newContent;
        }

        void ChangeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        void Rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        String title = input[0];
        String content=input[1];
        String author=input[2];

       Article art = new Article(title, content, author);
        for (int i = 0; i < n; i++) {
            String[] changes = scanner.nextLine().split(": ");
            String change = changes[1];
            switch (changes[0]) {
                case "Edit":
                    art.Edit(change);
                    break;
                case "ChangeAuthor":
                    art.ChangeAuthor(change);
                    break;
                case "Rename":
                    art.Rename(change);
                    break;

            }
        }

        System.out.println(art);
    }
}
