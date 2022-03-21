package OOP.L02Encapsulation.Exercise.T05FootballTeamGenerator;

import java.util.*;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                this.players.remove(player);
                return;
            }
        }

        System.out.printf("Player %s is not in %s team.", name, this.name);

    }

    public double getRating() {
        return players.stream().mapToDouble(Player::overallSkillLevel).sum();
    }
}
