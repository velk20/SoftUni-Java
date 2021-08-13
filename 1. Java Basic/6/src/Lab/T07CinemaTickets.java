package Lab;

import java.util.Scanner;

public class T07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int freePlaces = Integer.parseInt(scanner.nextLine());
        //TRY IT LATER
        String typeTicket ="";
        while (!film.equals("Finish")) {
            for (int i = 0; i < freePlaces; i++) {
                 typeTicket = scanner.nextLine();
                if (!typeTicket.equals("End")) {

                }else break;
            }
            film = scanner.nextLine();
        }
    }
}
