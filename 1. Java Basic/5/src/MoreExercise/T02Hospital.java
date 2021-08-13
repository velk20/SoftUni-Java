package MoreExercise;

import java.util.Scanner;

public class T02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int ready = 0;
        int notReady = 0;
        int doctors = 7;

        int countCheck = 0;
        int countNotCheck = 0;
        for (int i = 1; i <= period; i++) {
            int patient = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && countNotCheck>countCheck) {
                doctors++;
            }

            if (patient > doctors) {
                notReady = patient - doctors;
                countNotCheck += notReady;
                countCheck += doctors;
            } else {
                countCheck += patient;
            }
        }

        System.out.printf("Treated patients: %d.\n",countCheck);
        System.out.printf("Untreated patients: %d.",countNotCheck);
    }
}
