package OOP.L05Polymorphism.Lab.T02Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    protected Double calculatePerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    protected Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
