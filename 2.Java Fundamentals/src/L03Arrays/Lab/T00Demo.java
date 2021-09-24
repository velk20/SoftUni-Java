package L03Arrays.Lab;

import java.util.Scanner;

public class T00Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = 1;
        numbers[5] = numbers[2] + numbers[7];
        numbers[10] = 1; // ArrayIndexOutOfBoundsException
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

//Reading from a single line
        String values = sc.nextLine();
        String[] items = values.split(" ");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++)
            arr[i] = Integer.parseInt(items[i]);

    }
}
