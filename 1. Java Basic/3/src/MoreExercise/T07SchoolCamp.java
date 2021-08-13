package MoreExercise;

import java.util.Scanner;

public class T07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sport = "";
        double prizeForOneNight = 0.0;
        double total = 0.0;
        switch (season) {
            case "Winter":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    prizeForOneNight = 9.60;
                    total = prizeForOneNight * nights * students;

                    if (students >= 50) {
                        total = total - (total * 0.5);
                    } else if (students >= 20 && students < 50) {
                        total = total - (total * 0.15);
                    }else if (students >= 10 && students < 20) {
                        total = total - (total * 0.05);
                    }

                    if (groupType.equals("girls")) {
                        sport = "Gymnastics";
                    }else if (groupType.equals("boys")){
                        sport = "Judo";
                    }else if (groupType.equals("mixed")){
                        sport = "Ski";
                    }
                }else if (groupType.equals("mixed")){
                    prizeForOneNight = 10.0;
                    total = prizeForOneNight * nights * students;

                    if (students >= 50) {
                        total = total - (total * 0.5);
                    } else if (students >= 20 && students < 50) {
                        total = total - (total * 0.15);
                    }else if (students >= 10 && students < 20) {
                        total = total - (total * 0.05);
                    }

                    if (groupType.equals("girls")) {
                        sport = "Gymnastics";
                    }else if (groupType.equals("boys")){
                        sport = "Judo";
                    }else if (groupType.equals("mixed")){
                        sport = "Ski";
                    }
                }
                break;

                case "Spring":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    prizeForOneNight = 7.20;
                    total = prizeForOneNight * nights * students;

                    if (students >= 50) {
                        total = total - (total * 0.5);
                    } else if (students >= 20 && students < 50) {
                        total = total - (total * 0.15);
                    }else if (students >= 10 && students < 20) {
                        total = total - (total * 0.05);
                    }

                    if (groupType.equals("girls")) {
                        sport = "Athletics";
                    }else if (groupType.equals("boys")){
                        sport = "Tennis";
                    }else if (groupType.equals("mixed")){
                        sport = "Cycling";
                    }
                }else if (groupType.equals("mixed")){
                    prizeForOneNight = 9.50;
                    total = prizeForOneNight * nights * students;

                    if (students >= 50) {
                        total = total - (total * 0.5);
                    } else if (students >= 20 && students < 50) {
                        total = total - (total * 0.15);
                    }else if (students >= 10 && students < 20) {
                        total = total - (total * 0.05);
                    }

                    if (groupType.equals("girls")) {
                        sport = "Athletics";
                    }else if (groupType.equals("boys")){
                        sport = "Tennis";
                    }else if (groupType.equals("mixed")){
                        sport = "Cycling";
                    }
                }
                    break;
                case "Summer":
                if (groupType.equals("boys") || groupType.equals("girls")) {
                    prizeForOneNight = 15.00;
                    total = prizeForOneNight * nights * students;

                    if (students >= 50) {
                        total = total - (total * 0.5);
                    } else if (students >= 20 && students < 50) {
                        total = total - (total * 0.15);
                    }else if (students >= 10 && students < 20) {
                        total = total - (total * 0.05);
                    }

                    if (groupType.equals("girls")) {
                        sport = "Volleyball";
                    }else if (groupType.equals("boys")){
                        sport = "Football";
                    }else if (groupType.equals("mixed")){
                        sport = "Swimming";
                    }
                }else if (groupType.equals("mixed")){
                    prizeForOneNight = 20.0;
                    total = prizeForOneNight * nights * students;

                    if (students >= 50) {
                        total = total - (total * 0.5);
                    } else if (students >= 20 && students < 50) {
                        total = total - (total * 0.15);
                    }else if (students >= 10 && students < 20) {
                        total = total - (total * 0.05);
                    }

                    if (groupType.equals("girls")) {
                        sport = "Volleyball";
                    }else if (groupType.equals("boys")){
                        sport = "Football";
                    }else if (groupType.equals("mixed")){
                        sport = "Swimming";
                    }
                }
                    break;
        }

        System.out.printf("%s %.2f lv.",sport,total);
    }
}
