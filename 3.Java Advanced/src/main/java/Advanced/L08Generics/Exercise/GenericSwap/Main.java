package Advanced.L08Generics.Exercise.GenericSwap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Swap<Integer> swap = new Swap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            swap.add(Integer.parseInt(input));

        }

        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        swap.swapp(index1, index2);

        System.out.println(swap.toString());
    }
}
