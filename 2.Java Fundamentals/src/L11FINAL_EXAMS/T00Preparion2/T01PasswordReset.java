package L11FINAL_EXAMS.T00Preparion2;

import java.util.Scanner;

public class T01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "TakeOdd":
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            stringBuilder.append(password.charAt(i));
                        }
                    }
                    password = stringBuilder.toString();
                    System.out.println(password);
                    break;

                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int len = Integer.parseInt(tokens[2]);

                    StringBuilder sc = new StringBuilder(password);
                    sc.replace(index, index + len, "");
                    password = sc.toString();
                    System.out.println(password);

                    break;

                case "Substitute":
                    String s = tokens[1];
                    String toReplace = tokens[2];

                    if (!password.contains(s)) {
                        System.out.println("Nothing to replace!");
                    } else {
                        password = password.replaceAll(s, toReplace);
                        System.out.println(password);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s",password);
    }
}
