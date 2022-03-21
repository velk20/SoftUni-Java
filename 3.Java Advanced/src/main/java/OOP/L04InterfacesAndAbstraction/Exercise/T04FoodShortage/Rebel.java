package OOP.L04InterfacesAndAbstraction.Exercise.T04FoodShortage;

public class Rebel implements Person,Buyer{
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public int getAge() {
        return age;
    }
}
