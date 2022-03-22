package OOP.L10UnitTesting.Lab.demoTestCalculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static int multiplier(int a, int b) {
        return a * b;
    }

    public void doSomething() {
        throw new IllegalStateException();
    }

    public int subtraction() {
        return a - b;
    }
}
