package OOP.L01WorkingWithAbstraction.Lab;

public enum Seasons {
    SPRING("Spring", 24, "low"),
    WINTER("Spring", 24, "low"),
    SUMMER("Spring", 24, "low"),
    AUTUMN("Spring", 24, "low"),
    ;


    private String name;
    private int temperature;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    Seasons(String name, int temperature, String value) {
        this.name = name;
        this.temperature = temperature;
        this.value = value;
    }
}

