package ProgrammingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class T03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWindows = Integer.parseInt(scanner.nextLine());
        String typeWindow = scanner.nextLine();
        String delivery = scanner.nextLine();
        double qwe = 0;
        double price = 0;

        if (countWindows < 10) {
            System.out.println("Invalid order");

        } else  {

            if (typeWindow.equals("90X130")) {
                qwe = 110;
                price += qwe * countWindows;
                if (countWindows > 30 && countWindows<60) {
                    price = price * 0.95;
                } else if (countWindows > 60) {
                    price = price * 0.92;
                }

            }else  if (typeWindow.equals("100X150")) {
                qwe = 140;
                price += qwe * countWindows;
                if (countWindows > 40&& countWindows<80) {
                    price = price * 0.94;
                } else if (countWindows > 80 ) {
                    price = price * 0.90;
                }
            }else  if (typeWindow.equals("130X180")) {
                qwe = 190;
                price += qwe * countWindows;
                if (countWindows > 20 && countWindows<50) {
                    price = price * 0.93;
                } else if (countWindows > 50) {
                    price = price * 0.88;
                }
            }else  if (typeWindow.equals("200X300")) {
                qwe = 250;
                price += qwe * countWindows;
                if (countWindows > 25&& countWindows<50) {
                    price = price * 0.91;
                } else if (countWindows > 50) {
                    price = price * 0.86;
                }
            }
            if (delivery.equals("With delivery")) {
                price += 60;
            }
            if (countWindows > 99) {
                price = price * 0.96;
            }

            System.out.printf("%.2f BGN", price);
        }

    }
}
