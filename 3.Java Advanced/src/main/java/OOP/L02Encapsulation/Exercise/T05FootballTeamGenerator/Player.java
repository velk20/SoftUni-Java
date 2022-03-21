package OOP.L02Encapsulation.Exercise.T05FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        this.endurance = endurance;
        this.sprint = sprint;
        this.dribble = dribble;
        this.passing = passing;
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else throw new IllegalArgumentException("A name should not be empty.");
    }

    private void setSprint(int sprint) {
        if (checkSkillsInRange(sprint)){
            this.sprint = sprint;
        } else throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", sprint));
    }

    private void setDribble(int dribble) {
        if (checkSkillsInRange(dribble)){
            this.dribble = dribble;
        } else throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", dribble));

    }

    private void setPassing(int passing) {
        if (checkSkillsInRange(passing)){
            this.passing = passing;
        } else throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", passing));

    }

    private void setShooting(int shooting) {
        if (checkSkillsInRange(shooting)){
            this.shooting = shooting;
        } else throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", shooting));

    }

    private void setEndurance(int endurance) {
        if (checkSkillsInRange(endurance)){
            this.endurance = endurance;
        } else throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", endurance));

    }

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) * 1.0 / 5;
    }


    private boolean checkSkillsInRange(int skill) {
        return skill >= 0 && skill <= 100;
    }
}
