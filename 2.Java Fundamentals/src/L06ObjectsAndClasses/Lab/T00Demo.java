package L06ObjectsAndClasses.Lab;

import java.util.*;

 class Reservation{
    String holderName;
    String phoneNumber;
    int seats;
}
public class T00Demo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Reservation> reservationList = new ArrayList<>();
        String input = scanner.nextLine(); // Veronika 20
        while (!input.equals("end")) {
            String[] dataArr = input.split("\\s+");//"Veronika","20"
            String nameHolders = dataArr[0];
            String phoneNumber = dataArr[1];
            int seats = Integer.parseInt(dataArr[2]);
            Reservation reservation = new Reservation();
            reservation.holderName = nameHolders;
            reservation.seats = seats;
            reservation.phoneNumber = phoneNumber;

            reservationList.add(reservation);

            input = scanner.nextLine();
        }

        String searchName = scanner.nextLine();

        int reservationIndex = -1;

        for (int i = 0; i < reservationList.size(); i++) {
            Reservation reservation = reservationList.get(i);

            if (searchName.equals(reservation.holderName)) {
                reservationIndex = i;
            }
        }



        if (reservationIndex != -1) {
            Reservation reservation = reservationList.get(reservationIndex);
            System.out.println(reservation.seats);
        } else {
            System.out.println("Sorry, no reservation for " + searchName);
        }
    }
}
