package L07MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companies = new TreeMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String id = tokens[1];

            if (!companies.containsKey(companyName)) {
                List<String> s = new ArrayList<>();
                s.add(id);
                companies.put(companyName, s);
            } else {
                List<String> s = companies.get(companyName);
                boolean exist = false;
                for (int i = 0; i < s.size(); i++) {
                    if (s.get(i).equals(id)) {
                        exist = true;
                    }
                }
                if (!exist) {
                    s.add(id);
                    companies.put(companyName,s);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            List<String> s = entry.getValue();
            System.out.println(entry.getKey());
            for (int i = 0; i < s.size(); i++) {
                System.out.println("-- " + s.get(i));
            }
        }
    }
}
