import java.util.Arrays;
import java.util.Scanner;

public class PlaceholderJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fName=scan.nextLine();
        String lname = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();
        System.out.printf("You are %s %s, a %d-years old man from %s",fName,lname,age,town);
    }
}
