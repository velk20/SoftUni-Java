package OOP.L02Encapsulation.Lab.T02SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

     Person(String firstName, String lastName, int age,double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

     String getFirstName() {
        return firstName;
    }

     int getAge() {
        return age;
    }

     double getSalary() {
        return salary;
    }

     void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", this.firstName, this.lastName, this.salary);
    }

     void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.salary += (this.salary * bonus / 100) / 2;
        } else this.salary += (this.salary * bonus / 100);
    }
}
