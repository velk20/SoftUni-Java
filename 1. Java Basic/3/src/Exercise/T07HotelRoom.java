package Exercise;

import java.util.Scanner;

public class T07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apartment = 0.0;
        switch (month) {
            case "May":
            case "October":
                studio = numberOfNights * 50.0;
                apartment = numberOfNights * 65.0;

                if (numberOfNights > 7 && numberOfNights <= 14) {
                    studio = studio - (studio * 0.05);
                } else if (numberOfNights > 14) {
                    studio = studio - (studio * 0.3);
                }

                if (numberOfNights > 14) {
                    apartment = apartment - (apartment * 0.1);
                }

                System.out.printf("Apartment: %.2f lv.\n",apartment);
                System.out.printf("Studio: %.2f lv.",studio);
                break;

            case "June":
            case "September":
                studio = numberOfNights * 75.20;
                apartment = numberOfNights * 68.70;

                 if (numberOfNights > 14) {
                    studio = studio - (studio * 0.2);
                }

                if (numberOfNights > 14) {
                    apartment = apartment - (apartment * 0.1);
                }

                System.out.printf("Apartment: %.2f lv.\n",apartment);
                System.out.printf("Studio: %.2f lv.",studio);
                break;

                case "July":
            case "August":
                studio = numberOfNights * 76.00;
                apartment = numberOfNights * 77.00;



                if (numberOfNights > 14) {
                    apartment = apartment - (apartment * 0.1);
                }

                System.out.printf("Apartment: %.2f lv.\n",apartment);
                System.out.printf("Studio: %.2f lv.",studio);
                break;
        }
    }
}
