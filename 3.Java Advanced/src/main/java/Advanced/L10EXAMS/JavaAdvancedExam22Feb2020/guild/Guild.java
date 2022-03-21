package Advanced.L10EXAMS.JavaAdvancedExam22Feb2020.guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private String name;
    private int capacity;
    private List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (this.roster.size() < this.capacity) {
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                this.roster.remove(player);
                return true;
            }
        }
        return false;
    }

    public void promotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                player.setRank("Member");
                break;
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                player.setRank("Trial");
                break;
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> kickedPlayers = new ArrayList<>();
        for (int i = 0;i<this.roster.size();i++) {
            if (this.roster.get(i).getClazz().equals(clazz)) {
                kickedPlayers.add(this.roster.get(i));
                this.roster.remove(i);
                i--;
            }
        }
        return kickedPlayers.toArray(Player[]::new);

    }

    public  int count() {
        return this.roster.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Players in the Advanced.L10EXAMS.JavaAdvancedExam22Feb2020.guild: %s:", this.name)).append(System.lineSeparator());
        for (Player player : roster) {
            stringBuilder.append(player.toString()).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
