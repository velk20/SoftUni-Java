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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fish: ").append(this.name).append(System.lineSeparator());//na nov red
        stringBuilder.append("Color: ").append(this.color).append(System.lineSeparator());//na nov red
        stringBuilder.append("Number of fins: ").append(this.fins);//na nov red
        return stringBuilder.toString();
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
