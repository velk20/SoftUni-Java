package com.company.Tasks;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double qgodiPrice = Double.parseDouble(scanner.nextLine());
        double banani = Double.parseDouble(scanner.nextLine());
        double portokali = Double.parseDouble(scanner.nextLine());
        double malini = Double.parseDouble(scanner.nextLine());
        double qgodi = Double.parseDouble(scanner.nextLine());

        double maliniPrice = qgodiPrice / 2;
        double portokaliPrice = maliniPrice - (0.4 * maliniPrice);
        double bananiPrice = maliniPrice - (0.8 * maliniPrice);

        System.out.println((qgodiPrice*qgodi)+(bananiPrice*banani)+(portokali*portokaliPrice)+(malini*maliniPrice));
    }
}
