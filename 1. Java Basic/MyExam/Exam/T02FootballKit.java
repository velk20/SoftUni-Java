import java.util.Scanner;

public class T02FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tShirt = Double.parseDouble(scanner.nextLine());
        double win = Double.parseDouble(scanner.nextLine());

        double shorts = tShirt * 0.75;
        double socks = shorts * 0.20;
        double foot = (tShirt + shorts) * 2;
        double sum = tShirt + shorts + socks + foot;

        double finales = sum * 0.85;

        if (finales >= win) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", finales);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",win - finales);
        }

    }
}
