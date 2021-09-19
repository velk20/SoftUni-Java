package L01BasicSyntaxStatementsLoops;

import java.util.Scanner;

public class HowToFindIfNumberIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //proverka dali chisloto e prosto -> 2 delitelq (1 i samoto chislo)
        int count = 0;//broq na delitelite
        // alogoritum

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 2) {// za da ne vurti izlishni proverki
                break;
            }
        }

        //if(n>3 || n%2!=0 || n%3==0)


        if (count == 2) {
            System.out.println("Prime");

        } else {
            System.out.println("No prime");

        }
    }
}
