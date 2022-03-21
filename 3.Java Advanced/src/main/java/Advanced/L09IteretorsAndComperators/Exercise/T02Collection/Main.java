package Advanced.L09IteretorsAndComperators.Exercise.T02Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"Create {} {} {} {} {}"
        String createInput = scanner.nextLine();
        List<String> data = Arrays.stream(createInput.split("\\s+")).skip(1).collect(Collectors.toList());
        //skip() пропуска пурвият елемент

        ListyIterator listyIterator = new ListyIterator(data);


        String command = scanner.nextLine();
        while (!command.equals("END")) {
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;

                case "PrintAll":
                    listyIterator.PrintAll();
                    break;
                case "Print":
                    try {
                        listyIterator.Print();

                    } catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;

                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
