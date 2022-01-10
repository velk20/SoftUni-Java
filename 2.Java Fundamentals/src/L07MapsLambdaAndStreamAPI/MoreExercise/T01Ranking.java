package L07MapsLambdaAndStreamAPI.MoreExercise;


import java.util.*;

public class T01Ranking {
    public class Student {
        private String username;
        private Map<String, Integer> contestsAndPoints;

        public Student(String username, Map<String, Integer> contestsAndPoints) {
            this.username = username;
            this.contestsAndPoints = contestsAndPoints;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Map<String, Integer> getContestsAndPoints() {
            return contestsAndPoints;
        }

        public void setContestsAndPoints(Map<String, Integer> contestsAndPoints) {
            this.contestsAndPoints = contestsAndPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contestAndPasswords = new HashMap<>();
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            contestAndPasswords.put(tokens[0], tokens[1]);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            if (tokens.length == 4) {
                String contest = tokens[0];
                String password = tokens[1];
                String username = tokens[2];
                int points = Integer.parseInt(tokens[3]);

               
            }
            input = scanner.nextLine();
        }
    }
}
