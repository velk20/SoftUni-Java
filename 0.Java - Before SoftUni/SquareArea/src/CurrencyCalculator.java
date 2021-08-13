import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        String curr1 = scan.nextLine();
        String curr2 = scan.nextLine();

        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;
        double total = 0;

        if (curr1.equals("BGN")){
            if (curr2.equals("USD")){
                total = money/USD;
            }
            else if (curr2.equals("EUR")){
                total = money/EUR;
            }
            else if(curr2.equals("GBP")){
                total = money/GBP;
            }
        }

        if (curr1.equals("USD")){
            if (curr2.equals("BGN")){
                total = money*USD;
            }
            else if(curr2.equals("EUR")){
                total=money*USD/EUR;
            }
            else if (curr2.equals("GBP")){
                total = money*USD/GBP;
            }
        }

        if (curr1.equals("EUR")){
            if (curr2.equals("BGN")){
                total = money*EUR;
            }
            else if(curr2.equals("USD")){
                total = money*EUR/USD;
            }
            else if (curr2.equals("GBP")){
                total = money*EUR/GBP;
            }
        }

        if (curr1.equals("GBP")){
            if (curr2.equals("BGN")){
                total = money*GBP;
            }
            else if(curr2.equals("USD")){
                total = money*GBP/USD;
            }
            else if (curr2.equals("EUR")){
                total = money*GBP/EUR;
            }
        }

        System.out.printf("%.2f %n",total);
    }
}
