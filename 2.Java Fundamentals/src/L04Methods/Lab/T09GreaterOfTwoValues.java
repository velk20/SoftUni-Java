package L04Methods.Lab;


import java.util.Scanner;

public class T09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "string":
                System.out.println(bigger(scanner.nextLine(), scanner.nextLine()));
                break;

                case "int":
                    System.out.println(bigger(Integer.parseInt(scanner.nextLine()),
                            Integer.parseInt(scanner.nextLine())));

                break;

            case "char":
                System.out.println(bigger(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0)));
                break;
        }
    }

    public static char bigger(char a,char b) {
        if (a > b) {
            return a;
        }else return b;

    }

    public static String bigger(String a,String b) {
        if (a.compareTo(b) == 1) {
            return a;
        }else return b;
    }

    public static int bigger(int a, int b) {
        if (a > b) {
            return a;
        }else return b;
    }

}
