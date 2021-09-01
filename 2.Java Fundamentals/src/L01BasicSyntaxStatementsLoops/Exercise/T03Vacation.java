package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfStudents = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;
        switch (typeOfStudents) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 8.45;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 30) {
                            totalPrice = totalPrice * 0.85;
                        }
                        break;
                    case "Saturday":
                        price = 9.80;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 30) {
                            totalPrice = totalPrice * 0.85;
                        }
                        break;
                    case "Sunday":
                        price = 10.46;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 30) {
                            totalPrice = totalPrice * 0.85;
                        }
                        break;

                }
                break;

                case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 10.90;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 100) {
                            totalPrice = totalPrice - 10 * price;
                        }
                        break;
                    case "Saturday":
                        price = 15.60;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 100) {
                            totalPrice = totalPrice - 10 * price;
                        }
                        break;
                    case "Sunday":
                        price = 16;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 100) {
                            totalPrice = totalPrice - 10 * price;
                        }
                        break;

                }
                break;

                case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 15;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 10 && countOfGroup <= 20) {
                            totalPrice = totalPrice * 0.95;

                        }
                        break;
                    case "Saturday":
                        price = 20;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 10 && countOfGroup <= 20) {
                            totalPrice = totalPrice * 0.95;

                        }
                        break;
                    case "Sunday":
                        price = 22.50;
                        totalPrice = countOfGroup * price;
                        if (countOfGroup >= 10 && countOfGroup <= 20) {
                            totalPrice = totalPrice * 0.95;

                        }
                        break;

                }
                break;

        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
