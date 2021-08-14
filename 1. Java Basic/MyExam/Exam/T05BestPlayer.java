import java.util.Scanner;

public class T05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String bestPlayer = "";
        int mostGolas = 0;
        Boolean finished = false;
        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > mostGolas) {
                mostGolas = goals;
                bestPlayer = name;
            }

            if (goals >= 10) {
                System.out.printf("%s is the best player!\n",bestPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", mostGolas);
                finished = true;
                break;
            }
            name = scanner.nextLine();

        }

        if (!finished) {
            if (mostGolas < 3) {
                System.out.printf("%s is the best player!\n",bestPlayer);
                System.out.printf("He has scored %d goals.",mostGolas);
            } else if (mostGolas >= 3) {
                System.out.printf("%s is the best player!\n",bestPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", mostGolas);
            }
        }
    }
}
