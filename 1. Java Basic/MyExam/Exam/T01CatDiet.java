import java.util.Scanner;

public class T01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maz = Integer.parseInt(scanner.nextLine());
        int prot = Integer.parseInt(scanner.nextLine());
        int vug = Integer.parseInt(scanner.nextLine());
        int all = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());

        double a = (maz / 100.0 * all) / 9.0;
        double b = (prot / 100.0 * all) / 4.0;
        double c = (vug / 100.0 * all) / 4.0;

        double sum = a + b + c;
        double forOneGram = all / sum;
        double percent = 100 - water;
        System.out.printf("%.4f", percent/100.0 * forOneGram);
    }
}
