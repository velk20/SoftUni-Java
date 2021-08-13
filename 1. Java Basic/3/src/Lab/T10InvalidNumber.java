package Lab;

import java.util.Scanner;

//Дадено число е валидно,ако е в диапазона[100…200]или е0.
// Да се напише програма,която чете цяло число,въведено от потребителя,
// и печата"invalid"ако въведеното число не е валидно.


public class T10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num<100 || num >200) {
            if (num!=0) {
                System.out.println("invalid");
            }
        }
    }
}
