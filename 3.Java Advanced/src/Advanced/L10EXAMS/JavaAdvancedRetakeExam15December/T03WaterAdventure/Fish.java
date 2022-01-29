package Advanced.L10EXAMS.JavaAdvancedRetakeExam15December.T03WaterAdventure;

public class Fish {
    private String name;
    private String color;
    private int fins;

    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    @Override
    public String toString() {
        return String.format("Fish: %s\nColor: %s\nNumber of fins: %d", this.name, this.color, this.fins);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getFins() {
        return fins;
    }
}
