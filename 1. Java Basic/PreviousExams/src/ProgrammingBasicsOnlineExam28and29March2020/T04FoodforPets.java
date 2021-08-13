package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T04FoodforPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
        double catEaten = 0;
        double dogEaten = 0;
        double allEaten = 0;
        double counterBiscuets = 0;
        double biscuets = 0;

        for (int i = 1; i <= days; i++) {

            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            catEaten += catFood;
            dogEaten += dogFood;
            allEaten += dogFood + catFood;

            double forNow = 0;
             forNow = catFood + dogFood;
            if (i % 3 == 0) {
                biscuets = forNow * 0.1;
                counterBiscuets += biscuets;
            }


        }

        System.out.printf("Total eaten biscuits: %.0fgr.\n",counterBiscuets);
        System.out.printf("%.2f%% of the food has been eaten.\n", allEaten / allFood * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", dogEaten / allEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.", catEaten / allEaten * 100);
    }
}
