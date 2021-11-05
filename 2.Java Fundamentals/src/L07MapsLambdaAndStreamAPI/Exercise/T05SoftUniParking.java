package L07MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registration = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String name = tokens[1];


            if (command.equals("register")) {
                String plate = tokens[2];
                if (!registration.containsKey(name)) {
                    registration.put(name, plate);
                    System.out.printf( "%s registered %s successfully\n",name,plate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s\n",plate);
                }
            } else if (command.equals("unregister")) {
                if (!registration.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found\n", name);
                } else {
                    registration.remove(name);
                    System.out.printf("%s unregistered successfully\n",name);
                }
            }
        }

        for (Map.Entry<String, String> entry : registration.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
