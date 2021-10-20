package L10MID_EXAMS.T04;

import java.util.*;

public class T01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantityOfFood = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityHay = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityCover = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;
        int days = 1;

        while (days <= 30) {

            quantityOfFood -= 300;
            if (days % 2 == 0) {
                double hay = quantityOfFood * 0.05;
                quantityHay -= hay;
            }
            if (days % 3 == 0) {
                double cover = weight / 3;
                quantityCover -= cover;
            }
            days++;
        }


        if (quantityOfFood >= 0 && quantityCover >= 0 && quantityHay >= 0) {

            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    quantityOfFood/1000,quantityHay/1000,quantityCover/1000);

        }
       else if (quantityOfFood < 0 || quantityCover < 0 || quantityHay < 0) {

            System.out.println("Merry must go to the pet store!");

        }





    }

    }

