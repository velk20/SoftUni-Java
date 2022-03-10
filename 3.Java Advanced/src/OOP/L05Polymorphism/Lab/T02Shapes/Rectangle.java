package OOP.L05Polymorphism.Lab.T02Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    protected Double calculatePerimeter() {
        return 2 * this.height + 2 * this.width;
    }

    @Override
    protected Double calculateArea() {
        return this.height * this.width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
