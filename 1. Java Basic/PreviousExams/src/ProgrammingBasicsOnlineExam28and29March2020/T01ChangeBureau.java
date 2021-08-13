package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBitcoin = Integer.parseInt(scanner.nextLine());
        double countChina = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double levFromBit = countBitcoin * 1168.0;
        double dolarToChina = (countChina * 0.15) * 1.76;
        double allEuro = (levFromBit + dolarToChina) / 1.95;

        double finale = allEuro - (allEuro *commision/100);

        System.out.printf("%.2f",finale);
    }
}
