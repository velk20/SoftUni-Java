package L11FINAL_EXAMS.MyFinalExam;

import java.util.*;

public class T03Followers {

    private static class Account{
        private String username;
        private int likes;
        private int comments;

        public Account(String username, int likes, int comments) {
            this.username = username;
            this.likes = likes;
            this.comments = comments;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }
    }

    public static void main(String[] args) {
        List<Account> followers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("Log out")) {
            String[] tokens = input.split(": ");
            String command = tokens[0];

            if (command.equals("New follower")) {
                String username = tokens[1];
                if (getAccount(username, followers) == null) {
                    Account account = new Account(username, 0, 0);
                    followers.add(account);
                }
            } else if (command.equals("Like")) {
                String username = tokens[1];
                int countOfLikes = Integer.parseInt(tokens[2]);
                if (getAccount(username, followers) == null) {
                    Account account = new Account(username, countOfLikes, 0);
                    followers.add(account);
                } else {
                    Account account = getAccount(username, followers);
                    int indexOfTheAccount = followers.indexOf(account);
                    int currentLikes = followers.get(indexOfTheAccount).getLikes();
                    followers.get(indexOfTheAccount).setLikes(currentLikes+countOfLikes);
                }
            } else if (command.equals("Comment")) {
                String username = tokens[1];
                if (getAccount(username, followers) == null) {
                    Account account = new Account(username, 0, 1);
                    followers.add(account);
                } else {
                    Account account = getAccount(username, followers);
                    int indexOfTheAccount = followers.indexOf(account);
                    int currentComments = account.getComments();
                    followers.get(indexOfTheAccount).setComments(currentComments+1);
                }
            } else if (command.equals("Blocked")) {
                String username = tokens[1];
                if (getAccount(username, followers) == null) {
                    System.out.printf("%s doesn't exist.\n", username);
                } else {
                    Account account = getAccount(username, followers);
                    int indexOfTheAccount = followers.indexOf(account);
                    followers.remove(indexOfTheAccount);
                }
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> accounts = new TreeMap<>();
        for (Account follower : followers) {
            String username = follower.getUsername();
            int likes = follower.getLikes();
            int comments = follower.getComments();
            accounts.put(username, likes + comments);
        }
        System.out.println(accounts.size() + " followers");
        accounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
        ;
    }

    public static Account getAccount(String username, List<Account> accountList) {
        for (Account account : accountList) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }
}
