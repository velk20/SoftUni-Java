package OOP.L01WorkingWithAbstraction.Exercise.T01CardSuit;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equals("Card Suits")) {
            System.out.println("Card Suits:");
            Cards[] values = Cards.values();
           // Cards cards = Cards.valueOf("CLUBS");
//            for (int i = 0; i < values.length ; i++) {
//                System.out.printf("Ordinal value: %d; Name value: %s\n", i, values[i].name());
//            }
            for (Cards value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s\n",value.ordinal(), value);
            }

            //value.ordinal() -> return its index
            //value.toString() or value.name() OR JUST value -> return the string name of the value


        }
    }
}
