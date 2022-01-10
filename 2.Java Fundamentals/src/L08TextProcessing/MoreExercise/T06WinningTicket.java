package L08TextProcessing.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class T06WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tickets = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        for (String ticket : tickets) {
            if (ticket.length() == 20) {
                String leftHalf = ticket.substring(0, tickets.size() / 2 - 1);
                String rightHalf = ticket.substring(10);

                char[] left = leftHalf.toCharArray();
                char[] right = rightHalf.toCharArray();

                int winCountLeft = 0;
                int winCountRight = 0;

                for (int i = 0; i < left.length - 1; i++) {
                    char currCharLeft = left[i];
                    char currCharRight = right[i];


                }
            }
        }
    }
}
