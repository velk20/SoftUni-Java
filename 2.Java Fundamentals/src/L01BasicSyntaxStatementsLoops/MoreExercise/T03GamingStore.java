package L01BasicSyntaxStatementsLoops.MoreExercise;

import java.util.Scanner;
/*
OutFall 4	$39.99
CS: OG	$15.99
Zplinter Zell	$19.99
Honored 2	$59.99
RoverWatch	$29.99
RoverWatch Origins Edition	$39.99
*/

public class T03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double outfall4 = 39.99;
        double csgo = 15.99;
        double zell = 19.99;
        double honored2 = 59.99;
        double roverWatch = 29.99;
        double origins = 39.99;
        double spend = 0;
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double a = budget;
        while (!input.equals("Game Time")) {
            if (budget != 0) {

                switch (input) {
                    case "OutFall 4":
                        if (budget >= outfall4) {
                            System.out.printf("Bought %s\n", input);
                            budget -= outfall4;
                            spend += outfall4;
                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;

                    case "CS: OG":
                        if (budget >= csgo) {
                            System.out.printf("Bought %s\n", input);
                            budget -= csgo;
                            spend += csgo;

                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;

                    case "Zplinter Zell":
                        if (budget >= zell) {
                            System.out.printf("Bought %s\n", input);
                            budget -= zell;
                            spend += zell;

                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;

                    case "Honored 2":
                        if (budget >= honored2) {
                            System.out.printf("Bought %s\n", input);
                            budget -= honored2;
                            spend += honored2;

                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;

                    case "RoverWatch":
                        if (budget >= roverWatch) {
                            System.out.printf("Bought %s\n", input);
                            budget -= roverWatch;
                            spend += roverWatch;

                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;

                    case "RoverWatch Origins Edition":
                        if (budget >= origins) {
                            System.out.printf("Bought %s\n", input);
                            budget -= origins;
                            spend += origins;


                        } else {
                            System.out.println("Too Expensive");
                        }
                        break;

                    default:
                        System.out.println("Not Found");
                        break;

                }
            }
            if (budget == 0) {

                System.out.println("Out of money!");
                break;
            }

            input = scanner.nextLine();
        }

        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, a - spend);
        }
    }
}
