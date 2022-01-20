package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class T01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            if (tokens[0].equals("IN")) {
                parkingLot.add(tokens[1]);
            } else {
                parkingLot.remove(tokens[1]);
            }
            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
        for (String string : parkingLot) {
            System.out.println(string);
        }
    }
}
