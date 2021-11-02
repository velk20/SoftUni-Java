package L06ObjectsAndClasses.MoreExercise;

import java.util.Scanner;

public class T01CompanyRoster {
    private static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        public Employee(String name, double salary, String position, String department) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = "n/a";
            this.age = -1;
        }

        public Employee(String name, double salary, String position, String department, String email) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = -1;
        }

        public Employee(String name, double salary, String position, String department, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.age = age;
            this.email = "n/a";
        }

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

        }
    }
}
