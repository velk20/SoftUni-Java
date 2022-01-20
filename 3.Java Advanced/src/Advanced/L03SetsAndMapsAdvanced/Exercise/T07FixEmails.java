package Advanced.L03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class T07FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<>();

        String string = scanner.nextLine();
        while (!string.equals("stop")) {
            String email = scanner.nextLine();


                map.put(string, email);


            string = scanner.nextLine();
        }

        map.entrySet().stream().forEach(e->{
            if (!e.getValue().endsWith("us") && !e.getValue().endsWith("uk") && !e.getValue().endsWith("com")) {
                System.out.print(e.getKey()+" -> ");
                System.out.printf("%s\n",e.getValue());
            }
        });
    }
}
