package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.toys;

public abstract class BaseToy implements Toy{
    private int softness;
    private double price;

    public BaseToy(int softness, double price) {
        this.softness = softness;
        this.price = price;
    }

    @Override
    public int getSoftness() {
        return this.softness;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
