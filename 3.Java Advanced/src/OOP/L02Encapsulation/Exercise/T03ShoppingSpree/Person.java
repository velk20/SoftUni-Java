package OOP.L02Encapsulation.Exercise.T03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    private void setMoney(double money) {
        if (money<0) throw new IllegalArgumentException("Money cannot be negative");
        this.money = money;
    }


    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.getName(), product.getName()));
        }
        this.setMoney(this.money - product.getCost());
        this.products.add(product);
        System.out.printf("%s bought %s\n", this.name, product.getName());
    }



    public String getName() {
        return this.name;
    }
}
