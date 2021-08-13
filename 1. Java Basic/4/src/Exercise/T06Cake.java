package Exercise;

import java.util.Scanner;

public class T06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int V = w * h;
        int num;
        while (V > 0) {


            try {

                 num = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                    System.out.printf("%d pieces are left.", V);

                break;
            }

            V -= num;

        }

        if (V <= 0 ) {
            System.out.printf("No more cake left! You need %d pieces more." , Math.abs(V));
        }
    }
}
