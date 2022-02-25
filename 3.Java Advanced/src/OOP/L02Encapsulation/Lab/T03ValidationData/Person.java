package OOP.L02Encapsulation.Lab.T03ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setSalary(salary);
        this.setAge(age);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }


    public int getAge() {
        return age;
    }



    protected void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    protected void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    protected void setSalary(double salary) {
        if (salary < 460.0) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", this.firstName, this.lastName, this.salary);
    }

    protected void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.salary += (this.salary * bonus / 100) / 2;
        } else this.salary += (this.salary * bonus / 100);
    }
}
