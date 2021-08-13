package ProgrammingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class T04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int redCounter = 0;
        int orangeCounter = 0;
        int yellowCounter = 0;
        int whiteCounter = 0;
        int otherCounter = 0;
        int blackCounter = 0;
        int totalPoints = 0;


        while (n>counter) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                totalPoints += 5;
                redCounter++;
            } else if (color.equals("orange")) {
                totalPoints += 10;
                orangeCounter++;
            }else if (color.equals("yellow")) {
                totalPoints += 15;
                yellowCounter++;
            }else if (color.equals("white")) {
                totalPoints += 20;
                whiteCounter++;
            } else if (color.equals("black")) {
                totalPoints /= 2;
                blackCounter++;
            } else {
                otherCounter++;
            }

            counter++;

        }

        System.out.printf("Total points: %d\n",totalPoints);
        System.out.printf("Points from red balls: %d\n",redCounter);
        System.out.printf("Points from orange balls: %d\n",orangeCounter);
        System.out.printf("Points from yellow balls: %d\n",yellowCounter);
        System.out.printf("Points from white balls: %d\n",whiteCounter);
        System.out.printf("Other colors picked: %d\n",otherCounter);
        System.out.printf("Divides from black balls: %d",blackCounter);


    }
}
