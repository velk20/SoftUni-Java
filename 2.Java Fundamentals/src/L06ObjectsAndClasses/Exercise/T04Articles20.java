package L06ObjectsAndClasses.Exercise;

import java.util.*;

public class T04Articles20 {

    private static class Article {

        String title;
        String content;
        String author;

        Article(String name,  String content,String author) {
            this.title = name;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }




    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");

            Article article = new Article(tokens[0], tokens[1], tokens[2]);
            articles.add(article);
        }

         String sortType = scanner.nextLine();
        if (sortType.equals("title")) {
            Collections.sort(articles, new Comparator<Article>() {
                @Override
                public int compare(Article o1, Article o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
        } else if (sortType.equals("content")) {
            Collections.sort(articles, new Comparator<Article>() {
                @Override
                public int compare(Article o1, Article o2) {
                    return o1.getContent().compareTo(o2.getContent());

                }
            });
        } else if (sortType.equals("author")) {
            Collections.sort(articles, new Comparator<Article>() {
                @Override
                public int compare(Article o1, Article o2) {
                    return o1.getAuthor().compareTo(o2.getAuthor());
                }
            });

        }

        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
