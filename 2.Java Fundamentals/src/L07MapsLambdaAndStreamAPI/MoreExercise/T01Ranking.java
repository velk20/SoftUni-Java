package L07MapsLambdaAndStreamAPI.MoreExercise;

import java.util.*;

public class T01Ranking {
    public static class Intern{
        private String name;
        private List<String> allContests;
        private List<Integer> points;

        public Intern(String name, List<String> allContests, List<Integer> points) {
            this.name = name;
            this.allContests = allContests;
            this.points = points;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getAllContests() {
            return allContests;
        }

        public void setAllContests(List<String> allContests) {
            this.allContests = allContests;
        }

        public List<Integer> getPoints() {
            return points;
        }

        public void setPoints(List<Integer> points) {
            this.points = points;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contests = new TreeMap<>();
        List<Intern> internList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String contestPass = tokens[1];
            contests.put(contest, contestPass);
            input = scanner.nextLine();
        }

        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String currentContest = tokens[0];
            String currentPass = tokens[1];
            String name = tokens[2];
            int points = Integer.parseInt(tokens[3]);
            if (contests.containsKey(currentContest)) {
                if (contests.get(currentContest).equals(currentPass)) {
                    Intern internCheck = findMyIntern(name, internList);
                    if (internCheck == null) {
                        Intern intern = new Intern(name, new ArrayList<>(currentContest),
                                new ArrayList<>(points));
                        internList.add(intern);
                    } else {
                        int indexOfCurrentIntern = internList.indexOf(internCheck);
                        internList.remove(indexOfCurrentIntern);
                        String internName = internCheck.getName();
                        List<String> internContest = internCheck.getAllContests();
                        List<Integer> internPoints = internCheck.getPoints();
                        if (internContest.contains(currentContest)) {
                            int currentIndexOfContest = internContest.indexOf(currentContest);
                            int currentPoints = internPoints.get(currentIndexOfContest);
                            if (currentPoints < points) {
                                internPoints.remove(currentIndexOfContest);
                                internPoints.add(currentIndexOfContest, points);
                            }
                            internList.add(new Intern(internName, internContest, internPoints));
                        } else {
                            internContest.add(currentContest);
                            internPoints.add(points);
                            internList.add(new Intern(internName, internContest, internPoints));
                        }

                    }
                }
            }

            input = scanner.nextLine();
        }
        findBestCandidate(internList);
        System.out.println("Ranking:");
        internList.sort(Comparator.comparing(Intern::getName));
        Collections.sort(internList, new Comparator<Intern>() {
            @Override
            public int compare(Intern o1, Intern o2) {
                return o2.getPoints().get(0).compareTo(o1.getPoints().get(0));
            }
        });

//TODO
//        internList.forEach(
//
//
//        );
//    }
    }
    private static Intern findMyIntern(String name, List<Intern> internList) {
        for (Intern intern : internList) {
            if (intern.getName().equals(name)) {
                return intern;
            }
        }

        return null;
    }

    private static void findBestCandidate(List<Intern> internList) {
        int totalSumOfPoints = 0;
        String bestCandidateName = null;
        for (Intern intern : internList) {
            String name = intern.getName();
            List<Integer> totalPoints = intern.getPoints();
            int currentPoints = 0;
            for (int i = 0; i < totalPoints.size(); i++) {
                currentPoints += totalPoints.get(i);
            }
            if (currentPoints >= totalSumOfPoints) {
                totalSumOfPoints = currentPoints;
                bestCandidateName = name;
            }
        }

        System.out.printf("Best candidate is %s with total %d points.", bestCandidateName, totalSumOfPoints);

    }
}
