package MoreExercise;

import java.util.Scanner;

public class T06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sector = scanner.nextLine();
        int firstSector = Integer.parseInt(scanner.nextLine());
        int oddSector = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 65; i <= sector.charAt(0); i++) {
            for (int j = 1; j <= firstSector; j++) {

                    if (j % 2 != 0) {
                        for (int k = 97; k <(97+oddSector) ; k++) {
                            System.out.printf("%c%d%c\n",(char)i,j,(char)k);
                            counter += 1;
                        }
                    } else if (j % 2 == 0) {
                        for (int k = 97; k <(97+oddSector+2) ; k++) {
                            System.out.printf("%c%d%c\n",(char)i,j,(char)k);
                            counter += 1;
                        }


                    }

            }
            if (firstSector + 1 > firstSector) {
                firstSector += 1;
            }
        }
        System.out.println(counter);

    }

}
