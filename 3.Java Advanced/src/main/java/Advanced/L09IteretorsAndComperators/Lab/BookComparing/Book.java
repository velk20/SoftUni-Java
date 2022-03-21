package Advanced.L09IteretorsAndComperators.Lab.BookComparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year , String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));

    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);

    }

    @Override
    public int compareTo(Book otherBook) {
        int result = otherBook.getTitle().compareTo(this.getTitle());
        if (result == 0)
            return Integer.compare(otherBook.getYear(), this.getYear());

        return result;
    }
}
