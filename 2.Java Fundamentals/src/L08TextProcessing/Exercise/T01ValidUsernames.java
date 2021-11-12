package L08TextProcessing.Exercise;

import java.util.Scanner;

public class T01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");

        for (int i = 0; i < names.length; i++) {
            String currName = names[i];
            boolean isValid = false;
            if (currName.length() >= 3 && currName.length() <= 16) {
                for (int j = 0; j < currName.length(); j++) {
                    char ch = currName.charAt(j);
                    if (Character.isLetterOrDigit(ch) || ch == '-' || ch =='_') {
                        isValid = true;

                    }else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                System.out.println(currName);
            }
        }
    }
}
