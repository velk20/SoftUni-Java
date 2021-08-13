import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _Days_After_Birth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String text=scan.nextLine();
        LocalDate ParsedDate=LocalDate.parse(text,formatter);
        LocalDate After1000=ParsedDate.plusDays(999);
        System.out.printf("%1$td-%1$tm-%1$tY",After1000);
    }
}
