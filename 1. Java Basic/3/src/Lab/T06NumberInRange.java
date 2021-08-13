package Lab;

import java.util.Scanner;
//Да се напише програма, която проверява дали въведеното от
// потребителя число е в интервала [-100, 100] и е различно от 0 и извежда "Yes",
// ако отговаря на условията, или "No" ако е извън тях.
public class T06NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num >= -100 && num <= 100 && num != 0) {
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
